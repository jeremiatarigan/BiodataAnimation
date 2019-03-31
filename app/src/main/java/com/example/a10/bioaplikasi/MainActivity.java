package com.example.a10.bioaplikasi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Imageview;
    LinearLayout LinearLayout,LinearLayout2,LinearLayout3,LinearLayout4;
    Button btnclose,btnemail;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Imageview  = (ImageView) findViewById(R.id.imageView);
        LinearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        LinearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
        LinearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);
        LinearLayout4 = (LinearLayout) findViewById(R.id.linearLayout4);
        btnclose = (Button) findViewById(R.id.btnclose);
        btnemail = (Button) findViewById(R.id.btnemail);
        email = (TextView) findViewById(R.id.email);


        btnemail.setAlpha(0);
        btnemail.setTranslationY(400);

        email.setAlpha(0);
        email.setTranslationY(400);

        Imageview.setTranslationY(-400);
        Imageview.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(600).start();

        LinearLayout.setTranslationX(-1000);
        LinearLayout.animate().alpha(1).translationX(0).setDuration(600).setStartDelay(650).start();

        LinearLayout2.setTranslationX(-1000);
        LinearLayout2.animate().alpha(1).translationX(0).setDuration(600).setStartDelay(700).start();

        LinearLayout3.setTranslationX(-1000);
        LinearLayout3.animate().alpha(1).translationX(0).setDuration(600).setStartDelay(750).start();

        LinearLayout4.setTranslationX(-1000);
        LinearLayout4.animate().alpha(1).translationX(0).setDuration(600).setStartDelay(800).start();

        btnclose.setTranslationX(2400);
        btnclose.animate().alpha(1).translationX(0).setDuration(600).setStartDelay(1000).start();

        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Imageview.animate().alpha(1).translationY(-400).setDuration(600).setStartDelay(400).start();
                LinearLayout.animate().alpha(1).translationX(1000).setDuration(600).setStartDelay(450).start();
                LinearLayout2.animate().alpha(1).translationX(1000).setDuration(600).setStartDelay(500).start();
                LinearLayout3.animate().alpha(1).translationX(1000).setDuration(600).setStartDelay(550).start();
                LinearLayout4.animate().alpha(1).translationX(1000).setDuration(600).setStartDelay(600).start();
                btnclose.animate().alpha(1).translationX(400).setDuration(600).setStartDelay(700).start();
                btnemail.animate().alpha(1).translationY(400).setDuration(600).setStartDelay(800).start();
                email.animate().alpha(1).translationY(400).setDuration(600).setStartDelay(850).start();


            }
        });

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent();
               intent.setAction(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("https://www.youtube.com/channel/UClsDm6AovjPRYht7Jk24txg?view_as=subscriber"));
               startActivity(intent);
            }
        });
    }
}
