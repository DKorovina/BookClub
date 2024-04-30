
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		_______________________
	 *	@date 		Sunday 31st of March 2024 03:11:54 PM
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
	import android.widget.EditText;
	import android.widget.ImageView;
	import android.widget.TextView;
	import android.widget.Toast;

	import androidx.annotation.NonNull;

	import com.google.android.gms.tasks.OnCompleteListener;
	import com.google.android.gms.tasks.Task;
	import com.google.firebase.auth.AuthResult;
	import com.google.firebase.auth.FirebaseAuth;


	public class ________________________activity extends Activity {


		private View _bg_________________________;
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
		private View rectangle_15;
		private View rectangle_16;
		private TextView ____;
		private TextView _______________;
		private TextView _________________;
		private TextView _______;
		private EditText emailedt, passwordedt;
		private String email, password;

		private FirebaseAuth auth;



		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout._______________________);

			auth = FirebaseAuth.getInstance();
			Button button = findViewById(R.id.button);
			EditText passwordedt = findViewById(R.id.pswd);
			EditText emailedt = findViewById(R.id.phone_number);


			___________ = (TextView) findViewById(R.id.___________);
			_______________ = (TextView) findViewById(R.id._______________);
			_________________ = (TextView) findViewById(R.id._________________);
			_______ = (TextView) findViewById(R.id._______);

			button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {

					email = emailedt.getText().toString().trim();
					password = passwordedt.getText().toString().trim();
					if (email.isEmpty()){
						emailedt.setError("Введите e-mail");
					}
					if (password.isEmpty()){
						passwordedt.setError("Введите пароль");
					}else{
						auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener (new OnCompleteListener<AuthResult>(){
							@Override
							public void onComplete(@NonNull Task<AuthResult> task) {
								if (task.isSuccessful()) {
									Toast.makeText(________________________activity.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
									startActivity(new Intent(________________________activity.this, ____________activity.class));
								} else {
									Toast.makeText(________________________activity.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
								}
							}
						});

					}
				}
			});

		}

	}