
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		librery
	 *	@date 		Monday 01st of April 2024 12:58:39 PM
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
	import android.widget.ImageView;
	import android.widget.TextView;

public class librery_activity extends Activity {

	
	private View _bg__librery;
	private View _bg________ek1;
	private View rectangle_2;
	private View rectangle_1;
	private ImageView rectangle_23;
	private ImageView line_1;
	private TextView ______ek2;
	private TextView ______ek3;
	private TextView ____________________;
	private TextView ______________;
	private TextView _50_;
	private View rectangle_21;
	private TextView _____________________ek1;
	private TextView _______________ek1;
	private TextView _50__ek1;
	private ImageView line_6;
	private ImageView line_7;
	private ImageView rectangle_24;
	private ImageView line_2;
	private ImageView line_3;
	private ImageView line_4;
	private View rectangle_25;
	private TextView _____________________ek2;
	private View _bg__group_20_ek1;
	private View ellipse_8;
	private View _bg__group_17_ek1;
	private View rectangle_11;
	private View rectangle_12;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.librery);

		

		_bg________ek1 = (View) findViewById(R.id._bg________ek1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		rectangle_23 = (ImageView) findViewById(R.id.rectangle_23);
		line_1 = (ImageView) findViewById(R.id.line_1);

		____________________ = (TextView) findViewById(R.id.____________________);
		______________ = (TextView) findViewById(R.id.______________);
		_50_ = (TextView) findViewById(R.id._50_);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		_____________________ek1 = (TextView) findViewById(R.id._____________________ek1);
		_______________ek1 = (TextView) findViewById(R.id._______________ek1);

		line_6 = (ImageView) findViewById(R.id.line_6);

		rectangle_24 = (ImageView) findViewById(R.id.rectangle_24);
		line_2 = (ImageView) findViewById(R.id.line_2);
		line_3 = (ImageView) findViewById(R.id.line_3);
		line_4 = (ImageView) findViewById(R.id.line_4);



	
		
		//custom code goes here
		Button tab1Button = findViewById(R.id.tab1_button);
		Button tab2Button = findViewById(R.id.tab2_button);

		// Устанавливаем обработчики событий для кнопок
		tab1Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// При нажатии на кнопку "Вкладка 1" переключаемся на первую вкладку
				selectTab1();
			}
		});

		tab2Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// При нажатии на кнопку "Вкладка 2" переключаемся на вторую вкладку
				selectTab2();
			}
		});
	}

	// Метод для переключения на первую вкладку
	private void selectTab1() {
		findViewById(R.id.tab1Content).setVisibility(View.VISIBLE);
		findViewById(R.id.tab2Content).setVisibility(View.GONE);
	}

	// Метод для переключения на вторую вкладку
	private void selectTab2() {
		findViewById(R.id.tab1Content).setVisibility(View.GONE);
		findViewById(R.id.tab2Content).setVisibility(View.VISIBLE);
	}

}
	
	