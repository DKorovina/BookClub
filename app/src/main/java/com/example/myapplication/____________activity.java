
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		___________
	 *	@date 		Sunday 31st of March 2024 02:25:04 PM
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
	import android.widget.Button;
	import android.widget.ImageView;
	import android.widget.TextView;

public class ____________activity extends Activity {

	
	private View _bg_____________;
	private View _bg__group_7_ek1;
	private ImageView rectangle_1;
	private ImageView rectangle_3;
	private View ellipse_2;
	private View _bg__group_8_ek1;
	private ImageView subtract;
	private View _bg__group_4_ek1;
	private View _bg__group_3_ek1;
	private View ellipse_5;
	private View ellipse_6;
	private View _bg__group_2_ek1;
	private View ellipse_5_ek1;
	private View ellipse_6_ek1;
	private View _bg__group_5_ek1;
	private View _bg__group_3_ek3;
	private View ellipse_5_ek2;
	private View ellipse_6_ek2;
	private View _bg__group_2_ek3;
	private View ellipse_5_ek3;
	private View ellipse_6_ek3;
	private View rectangle_4;
	private View rectangle_5;
	private View rectangle_6;
	private View ellipse_7;
	private ImageView polygon_1;
	private TextView ___________;
	private View rectangle_13;
	private View rectangle_14;
	private View rectangle_16;
	private TextView ____;
	private TextView _______________;
	private TextView ____________ek1;
	private TextView _______;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.___________);

		Button button = findViewById(R.id.button);
		Button regbutt = findViewById(R.id.regbutt);

		_bg_____________ = (View) findViewById(R.id._bg_____________);

		___________ = (TextView) findViewById(R.id.___________);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);


		_______________ = (TextView) findViewById(R.id._______________);

		_______ = (TextView) findViewById(R.id._______);
	
		
		//custom code goes here
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(____________activity.this, main_activity.class);

				startActivity(intent);
			}
		});

		regbutt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(____________activity.this, ________________________activity.class);

				startActivity(intent);
			}
		});
	}
}
	
	