/*
 * Copyright (C) 2013 Manuel Peinado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.appwx.sdk.demo.fadingactionbar;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.appwx.sdk.fadingactionbar.FadingActionBarHelper;
import com.appwx.sdk.demo.R;

public class LightActionBarActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		FadingActionBarHelper helper = new FadingActionBarHelper()
				.actionBarBackground(R.drawable.ab_background_light)
				.headerLayout(R.layout.header_light)
				.contentLayout(R.layout.activity_scrollview)
				.lightActionBar(true);
		setContentView(helper.createView(this));
		helper.initActionBar(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}
}
