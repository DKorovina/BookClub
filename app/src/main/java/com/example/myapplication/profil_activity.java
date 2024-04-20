
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		profil
	 *	@date 		Monday 01st of April 2024 12:58:16 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class profil_activity extends Activity {

	
	private View _bg__profil;
	private View _bg________ek1;
	private View rectangle_2;
	private View rectangle_1;
	private View _bg__group_16_ek1;
	private View rectangle_9;
	private ImageView polygon_2;
	private View rectangle_10;
	private TextView ______ek2;
	private ImageView rectangle_17;
	private ImageView rectangle_18;
	private ImageView line_1;
	private View _bg__group_17_ek1;
	private View rectangle_19;
	private TextView ___________________;
	private TextView ______;
	private TextView ________;
	private View rectangle_21;
	private TextView _________ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.profil);
		ImageButton navigation_page1 = findViewById(R.id.navigation_page1);
		ImageButton navigation_page3 = findViewById(R.id.navigation_page3);
		ImageButton navigation_page4 = findViewById(R.id.navigation_page4);

		

		_bg________ek1 = (View) findViewById(R.id._bg________ek1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);

		rectangle_9 = (View) findViewById(R.id.rectangle_9);


		rectangle_17 = (ImageView) findViewById(R.id.rectangle_17);
		rectangle_18 = (ImageView) findViewById(R.id.rectangle_18);
		line_1 = (ImageView) findViewById(R.id.line_1);

		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		___________________ = (TextView) findViewById(R.id.___________________);
		______ = (TextView) findViewById(R.id.______);
		________ = (TextView) findViewById(R.id.________);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		_________ek1 = (TextView) findViewById(R.id._________ek1);
	
		
		//custom code goes here
		navigation_page1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(profil_activity.this, main_activity.class);

				startActivity(intent);
				navigation_page1.setImageResource(R.drawable.mainv);

			}
		});
		navigation_page3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(profil_activity.this, librery_activity.class);

				startActivity(intent);
				navigation_page3.setImageResource(R.drawable.polkiv);

			}
		});
		navigation_page4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(profil_activity.this, club_main_activity.class);

				startActivity(intent);
				navigation_page4.setImageResource(R.drawable.clubv);

			}
		});
	}
}
	
	