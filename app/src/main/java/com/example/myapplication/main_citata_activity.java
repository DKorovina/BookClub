
	 
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
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.navigation.NavController;

    public class main_citata_activity extends Activity {


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


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_citata);
        TextView statia = findViewById(R.id.statia);
        Button news = findViewById(R.id.news);
        Button recnz = findViewById(R.id.recnz);


        _bg__main = (View) findViewById(R.id._bg__main);
        ___________________________________________________________________________________________________________________________ = (TextView) findViewById(R.id.___________________________________________________________________________________________________________________________);
        ____________________________________ = (TextView) findViewById(R.id.____________________________________);
        _3333_______ = (TextView) findViewById(R.id._3333_______);
        image_1 = (ImageView) findViewById(R.id.image_1);
        ____________________________________________________________________________________________________________ = (TextView) findViewById(R.id.____________________________________________________________________________________________________________);
        _bg________ek1 = (View) findViewById(R.id._bg________ek1);
        rectangle_2 = (View) findViewById(R.id.rectangle_2);
        rectangle_1 = (View) findViewById(R.id.rectangle_1);
        _______ = (TextView) findViewById(R.id._______);
        ______ = (TextView) findViewById(R.id.______);
        ________ = (TextView) findViewById(R.id.________);



        //custom code goes here
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(main_citata_activity.this, main_activity.class);

                startActivity(intent);

            }
        });
        recnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(main_citata_activity.this, main_recenz_activity.class);

                startActivity(intent);

            }
        });

    }

        public void onTextViewClick(View v) {
            Intent intent = new Intent(this, article_activity.class);
            startActivity(intent);
        }
}
	
	