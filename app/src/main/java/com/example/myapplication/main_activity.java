
	 
	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		main
     *	@date 		Monday 01st of April 2024 12:57:51 PM
     *	@title 		Page 1
     *	@author
     *	@keywords
     *	@generator 	Export Kit v1.3.figma
     *
     */


    package com.example.myapplication;

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.KeyEvent;
    import android.view.MotionEvent;
    import android.view.View;
    import android.view.inputmethod.EditorInfo;
    import android.view.inputmethod.InputMethodManager;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ImageButton;
    import android.widget.ImageView;
    import android.widget.ListView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.navigation.NavController;

    import com.google.android.gms.tasks.OnCompleteListener;
    import com.google.android.gms.tasks.Task;
    import com.google.firebase.firestore.FirebaseFirestore;
    import com.google.firebase.firestore.QueryDocumentSnapshot;
    import com.google.firebase.firestore.QuerySnapshot;

    import java.util.ArrayList;
    import java.util.List;


    public class main_activity extends Activity {


        private View _bg__main;
        private View _bg_________________ek1;
        private View rectangle_9;
        private View rectangle_10;
        private View rectangle_11;
        private View _bg_________1_ek1;
        private TextView ___________________________________________________________________________________________________________________________;
        private TextView ____________________________________;
        private TextView _3333_______;
        private TextView _3333________ek1;
        private TextView _3333________ek2;
        private ImageView image_1;
        private View _bg_________1_ek3;
        private TextView ____________________________________________________________________________________________________________;
        private TextView _____________________________________ek1;
        private ImageView image_1_ek1;
        private View _bg_________1_ek5;
        private TextView _____________________________________________________________________________________________________________ek1;
        private TextView _____________________________________ek2;
        private ImageView image_1_ek2;
        private View _bg________ek1;
        private View rectangle_2;
        private View _bg________ek3;
        private View rectangle_1;
        private TextView _______;
        private TextView ______;
        private TextView ________;
        private View _bg_____________ek1;
        private View ellipse_9;
        private View ellipse_10;
        private View rectangle_8;
        private NavController navController;
        private EditText searchEditText;
        private FirebaseFirestore db;


        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            TextView statia = findViewById(R.id.statia);
            Button citata = findViewById(R.id.citata);
			Button news = findViewById(R.id.news);
            Button recnz = findViewById(R.id.recnz);
            ImageButton navigation_page2 = findViewById((R.id.navigation_page2));
            ImageButton navigation_page3 = findViewById((R.id.navigation_page3));
            ImageButton navigation_page4 = findViewById((R.id.navigation_page4));
            ImageView searchIcon = findViewById(R.id.sourchicon);
            View rootView = findViewById(R.id.content);
            searchEditText = findViewById(R.id.searchEditText);
             db = FirebaseFirestore.getInstance();

            rootView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    hideKeyboardAndSearchEditText();
                    return false;
                }
            });

            searchIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSearchDialog();
                }
            });



			news.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					selectTab1();
				}
			});
            citata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectTab2();
                }
            });
            recnz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectTab3();
                }
            });
            navigation_page2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(main_activity.this, profil_activity.class);

                    startActivity(intent);
                    navigation_page2.setImageResource(R.drawable.profilv);

                }
            });
            navigation_page3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(main_activity.this, librery_activity.class);

                    startActivity(intent);
                    navigation_page3.setImageResource(R.drawable.polkiv);

                }
            });
            navigation_page4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(main_activity.this, club_main_activity.class);

                    startActivity(intent);
                    navigation_page4.setImageResource(R.drawable.clubv);

                }
            });
        }

        private void hideKeyboardAndSearchEditText() {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(searchEditText.getWindowToken(), 0);
            searchEditText.setVisibility(View.GONE);
        }
        private void openSearchDialog() {
            searchEditText.setVisibility(View.VISIBLE);

            searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                            String searchText = v.getText().toString().trim();
                            db.collection("Book")
                                    .orderBy("book_name")
                                    .startAt(searchText)
                                    .endAt(searchText + "\uf8ff")
                                    .get()
                                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                        @Override
                                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                            if (task.isSuccessful()) {
                                                List<Book> foundBooks = new ArrayList<>(); // Создаем список для хранения найденных книг
                                                for (QueryDocumentSnapshot document : task.getResult()) {
                                                    Book book = document.toObject(Book.class);
                                                    foundBooks.add(book);

                                                }
                                                ListView searchResultsListView = findViewById(R.id.searchResultsListView);
                                                BookAdapter adapter = new BookAdapter(main_activity.this, foundBooks);
                                                searchResultsListView.setAdapter(adapter);
                                                searchResultsListView.setVisibility(View.VISIBLE);
                                            } else {
                                                Log.d("Error", "Error getting documents");

                                            }
                                        }
                                    });
                            // Скрываем клавиатуру после завершения поиска
                            hideKeyboardAndSearchEditText();
                            return true;
                        }

                        return false;
                    }
            });
        }

        public void onTextViewClick(View v) {
            Intent intent = new Intent(main_activity.this, article_activity.class);
            startActivity(intent);
        }

        private void selectTab1() {
            findViewById(R.id.tab1Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab2Content).setVisibility(View.GONE);
            findViewById(R.id.tab3Content).setVisibility(View.GONE);

            Button recenzButton = findViewById(R.id.recnz);
            Button newsButton = findViewById(R.id.news);
            Button citataButton = findViewById(R.id.citata);

            recenzButton.setTextColor(getResources().getColor(R.color.gray));
            newsButton.setTextColor(getResources().getColor(R.color.vinous));
            citataButton.setTextColor(getResources().getColor(R.color.gray));
        }

        private void selectTab2() {
            findViewById(R.id.tab1Content).setVisibility(View.GONE);
            findViewById(R.id.tab2Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab3Content).setVisibility(View.GONE);

            Button recenzButton = findViewById(R.id.recnz);
            Button newsButton = findViewById(R.id.news);
            Button citataButton = findViewById(R.id.citata);

            recenzButton.setTextColor(getResources().getColor(R.color.gray));
            newsButton.setTextColor(getResources().getColor(R.color.gray));
            citataButton.setTextColor(getResources().getColor(R.color.vinous));

        }

        private void selectTab3() {
            findViewById(R.id.tab3Content).setVisibility(View.VISIBLE);
            findViewById(R.id.tab2Content).setVisibility(View.GONE);
            findViewById(R.id.tab1Content).setVisibility(View.GONE);

            Button recenzButton = findViewById(R.id.recnz);
            Button newsButton = findViewById(R.id.news);
            Button citataButton = findViewById(R.id.citata);

            recenzButton.setTextColor(getResources().getColor(R.color.vinous));
            newsButton.setTextColor(getResources().getColor(R.color.gray));
            citataButton.setTextColor(getResources().getColor(R.color.gray));
        }

    }