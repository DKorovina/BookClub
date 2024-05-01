
	 
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
    import android.util.Log;
    import android.view.View;
	import android.widget.Button;
	import android.widget.ImageButton;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;

    import com.google.android.gms.tasks.OnFailureListener;
    import com.google.android.gms.tasks.OnSuccessListener;
    import com.google.firebase.auth.FirebaseAuth;
    import com.google.firebase.firestore.DocumentReference;
    import com.google.firebase.firestore.DocumentSnapshot;
    import com.google.firebase.firestore.FirebaseFirestore;

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
        private FirebaseAuth auth;


        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.profil);

            ImageButton navigation_page1 = findViewById(R.id.navigation_page1);
            ImageButton navigation_page3 = findViewById(R.id.navigation_page3);
            ImageButton navigation_page4 = findViewById(R.id.navigation_page4);
            TextView exitButt = findViewById(R.id.exitButt);
            ImageButton change_but = findViewById(R.id.change_but);
			Button recnz = findViewById(R.id.recenz);
			Button citata = findViewById(R.id.citata);
			Button selection =findViewById(R.id.selection);


            FirebaseFirestore db = FirebaseFirestore.getInstance();
            String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
            DocumentReference userRef = db.collection("users").document(uid);


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
            userRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                @Override
                public void onSuccess(DocumentSnapshot documentSnapshot) {
                    if (documentSnapshot.exists()) {
                        // Получаем имя пользователя из документа
                        String username = documentSnapshot.getString("username");

                        // Отображаем имя пользователя на странице профиля
                        TextView nameuser = findViewById(R.id.nameuser); // Замените R.id.usernameTextView на ваш ID TextView
                        nameuser.setText(username);
                    } else {
                        Log.d("ProfileActivity", "No such document");
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ProfileActivity", "Error getting document", e);
                }
            });


            change_but.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent = new Intent(profil_activity.this, ____________activity.class);
                    startActivity(intent);
                    finish();
                }
            });

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

        private void selectTab1() {
            findViewById(R.id.tab1Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab2Content).setVisibility(View.GONE);
            findViewById(R.id.tab3Content).setVisibility(View.GONE);
        }

        private void selectTab2() {
            findViewById(R.id.tab1Content).setVisibility(View.GONE);
            findViewById(R.id.tab2Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab3Content).setVisibility(View.GONE);
        }

        private void selectTab3() {
            findViewById(R.id.tab3Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab2Content).setVisibility(View.GONE);
            findViewById(R.id.tab1Content).setVisibility(View.GONE);
        }
    }
	
	