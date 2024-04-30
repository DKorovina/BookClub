
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		enter
	 *	@date 		Sunday 31st of March 2024 04:45:52 PM
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
	import android.os.Handler;
	import android.view.View;
	import android.widget.ImageView;
	import android.widget.TextView;

	import com.google.firebase.auth.FirebaseAuth;
	import com.google.firebase.auth.FirebaseUser;
public class enter_activity extends Activity {

	private FirebaseAuth auth;
	private static final int SPLASH_DELAY = 3000;
	
	private View _bg___enter;
	private View _bg__group_1_ek1;
	private View _bg________ek1;
	private View ellipse_2;
	private View ellipse_4;
	private View ellipse_3;
	private View ellipse_5;
	private View ellipse_6;
	private View ellipse_7;
	private View ellipse_8;
	private View ellipse_10;
	private View ellipse_9;
	private View _bg__________ek1;
	private View ________ek2;
	private View rectangle_3;
	private View rectangle_4;
	private View ellipse_11;
	private TextView d;
	private ImageView polygon_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.enter);

		auth = FirebaseAuth.getInstance();

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				FirebaseUser currentUser = auth.getCurrentUser();
				if (currentUser != null) {
					Intent intent = new Intent(enter_activity.this, main_activity.class);
					startActivity(intent);
					finish();
				} else {
					Intent intent = new Intent(enter_activity.this, ____________activity.class);
					startActivity(intent);
					finish();
				}
			}
		}, SPLASH_DELAY);
		
		//custom code goes here
	
	}

}


	