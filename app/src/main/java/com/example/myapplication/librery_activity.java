
	 
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
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.ImageButton;
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
	private ImageButton navigation_page1,navigation_page2, navigation_page4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.librery);
		Button book_note_button = findViewById(R.id.book_note_button);
		Button tab1Button = findViewById(R.id.tab1_button);
		Button tab2Button = findViewById(R.id.tab2_button);
		navigation_page1 = findViewById(R.id.navigation_page1);
		navigation_page2 = findViewById(R.id.navigation_page2);
		navigation_page4 = findViewById(R.id.navigation_page4);

		
		//custom code goes here


		book_note_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(librery_activity.this, book_note_activity.class);

				startActivity(intent);


			}
		});

		tab1Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
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

		navigation_page1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(librery_activity.this, main_activity.class);

				startActivity(intent);
				navigation_page1.setImageResource(R.drawable.mainv);

			}
		});
		navigation_page2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(librery_activity.this, profil_activity.class);

				startActivity(intent);
				navigation_page2.setImageResource(R.drawable.profilv);

			}
		});
		navigation_page4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(librery_activity.this, club_main_activity.class);

				startActivity(intent);
				navigation_page4.setImageResource(R.drawable.clubv);

			}
		});

	}


	private void selectTab1() {
		findViewById(R.id.tab1Content).setVisibility(View.VISIBLE);
		findViewById(R.id.tab2Content).setVisibility(View.GONE);
	}

	private void selectTab2() {
		findViewById(R.id.tab1Content).setVisibility(View.GONE);
		findViewById(R.id.tab2Content).setVisibility(View.VISIBLE);
	}

}
	
	