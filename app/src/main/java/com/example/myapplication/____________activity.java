
	 
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
	import android.util.Patterns;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.ImageView;
	import android.widget.TextView;
	import android.widget.Toast;

	import androidx.annotation.NonNull;

	import com.google.android.gms.tasks.OnFailureListener;
	import com.google.android.gms.tasks.OnSuccessListener;
	import com.google.firebase.auth.AuthResult;
	import com.google.firebase.auth.FirebaseAuth;

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
	private Button button, regbutt;
	private EditText emailedt, passwordedt;
	private FirebaseAuth auth;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.___________);

		Button button = findViewById(R.id.button);
		Button regbutt = findViewById(R.id.regbutt);
		emailedt = findViewById(R.id.email);
		passwordedt = findViewById(R.id.password);

		auth = FirebaseAuth.getInstance();


		_bg_____________ = (View) findViewById(R.id._bg_____________);
		___________ = (TextView) findViewById(R.id.___________);
		_______________ = (TextView) findViewById(R.id._______________);
		_______ = (TextView) findViewById(R.id._______);
	
		
		//custom code goes here
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				String email = emailedt.getText().toString();
				String password = passwordedt.getText().toString();

				if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
					if (!password.isEmpty()) {
						auth.signInWithEmailAndPassword(email, password)
								.addOnSuccessListener(new OnSuccessListener<AuthResult>() {
									@Override
									public void onSuccess(AuthResult authResult) {
										Toast.makeText(____________activity.this, "Login Successful", Toast.LENGTH_SHORT).show();
										startActivity(new Intent(____________activity.this, main_activity.class));
										finish();
									}
								}).addOnFailureListener(new OnFailureListener() {
									@Override
									public void onFailure(@NonNull Exception e) {
										Toast.makeText(____________activity.this, "Login Failed", Toast.LENGTH_SHORT).show();
									}
								});
					} else {
						passwordedt.setError("Empty fields are not allowed");
					}
				} else if (email.isEmpty()) {
					emailedt.setError("Empty fields are not allowed");
				} else {
					emailedt.setError("Please enter correct email");
				}
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
	
	