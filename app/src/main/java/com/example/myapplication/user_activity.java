
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		user
	 *	@date 		Monday 01st of April 2024 12:59:23 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class user_activity extends Activity {

	
	private View _bg__user;
	private View _bg________ek1;
	private View rectangle_2;
	private View rectangle_1;
	private TextView ______ek2;
	private ImageView rectangle_17;
	private ImageView rectangle_18;
	private ImageView line_1;
	private View _bg__group_17_ek1;
	private View rectangle_19;
	private TextView ________;
	private TextView _________ek1;
	private View _bg__group_18_ek1;
	private ImageView vector;
	private View _bg__group_17_ek3;
	private View rectangle_11;
	private View rectangle_12;
	private TextView ______;
	private View rectangle_20;
	private TextView ___________________;



	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.user);
		Button recnz = findViewById(R.id.recenz);
		Button citata = findViewById(R.id.citata);
		Button selection =findViewById(R.id.selection);

		//custom code goes here

		selection.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				selectTab2();
			}
		});
		citata.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				selectTab3();
			}
		});
		recnz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				selectTab1();
			}
		});
	}
	private void selectTab1() {
		findViewById(R.id.tab1Content).setVisibility(View.VISIBLE);
		findViewById(R.id.tab2Content).setVisibility(View.GONE);
		findViewById(R.id.tab3Content).setVisibility(View.GONE);

		Button recenzButton = findViewById(R.id.recenz);
		Button selectionButton = findViewById(R.id.selection);
		Button citataButton = findViewById(R.id.citata);

		recenzButton.setTextColor(getResources().getColor(R.color.vinous));
		selectionButton.setTextColor(getResources().getColor(R.color.gray));
		citataButton.setTextColor(getResources().getColor(R.color.gray));
	}

	private void selectTab2() {
		findViewById(R.id.tab1Content).setVisibility(View.GONE);
		findViewById(R.id.tab2Content).setVisibility(View.VISIBLE);
		findViewById(R.id.tab3Content).setVisibility(View.GONE);

		Button recenzButton = findViewById(R.id.recenz);
		Button selectionButton = findViewById(R.id.selection);
		Button citataButton = findViewById(R.id.citata);

		recenzButton.setTextColor(getResources().getColor(R.color.gray));
		selectionButton.setTextColor(getResources().getColor(R.color.vinous));
		citataButton.setTextColor(getResources().getColor(R.color.gray));
	}

	private void selectTab3() {
		findViewById(R.id.tab3Content).setVisibility(View.VISIBLE);
		findViewById(R.id.tab2Content).setVisibility(View.GONE);
		findViewById(R.id.tab1Content).setVisibility(View.GONE);

		Button recenzButton = findViewById(R.id.recenz);
		Button selectionButton = findViewById(R.id.selection);
		Button citataButton = findViewById(R.id.citata);

		recenzButton.setTextColor(getResources().getColor(R.color.gray));
		selectionButton.setTextColor(getResources().getColor(R.color.gray));
		citataButton.setTextColor(getResources().getColor(R.color.vinous));
	}

}
	
	