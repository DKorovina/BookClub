
	 
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

	import com.google.firebase.auth.FirebaseAuth;

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
	private TextView exitButt;
	private FirebaseAuth auth;
	private ImageButton sozdaticon;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.profil);

		ImageButton navigation_page1 = findViewById(R.id.navigation_page1);
		ImageButton navigation_page3 = findViewById(R.id.navigation_page3);
		ImageButton navigation_page4 = findViewById(R.id.navigation_page4);
		exitButt = findViewById(R.id.exitButt);
		auth = FirebaseAuth.getInstance();
		sozdaticon = findViewById(R.id.sozdaticon);


		//custom code goes here
		sozdaticon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(profil_activity.this, change_activity.class));
				finish();
			}
		});
		exitButt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				auth.signOut();
				startActivity(new Intent(profil_activity.this, ____________activity.class));
				finish();
			}
		}); {

		}
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
	
	