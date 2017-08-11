
package com.example.oljee.swoosholjee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class league extends AppCompatActivity {

float i = (float) .7;
    float o = (float).2;
    Button next = null;
    Button M = null;
    Button N = null;
    Button C = null;
    int num=0;
    int bool = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        TextView last = (TextView) findViewById(R.id.last);
        TextView last1 = (TextView) findViewById(R.id.last1);
        next = (Button) findViewById(R.id.leaguebutton4);
        M = (Button) findViewById(R.id.leaguebutton1);

        N = (Button) findViewById(R.id.leaguebutton2);
        C = (Button) findViewById(R.id.leaguebutton3);

 int num1 = getIntent().getIntExtra("",0);

String s = getIntent().getStringExtra("1");
bool = getIntent().getIntExtra("2",0);
//Mens
    if("Mens".equals(s)) {
        if (num1 == 1) {

            last.setText("I am a:");
            last1.setText("Beginner");
            next.setVisibility(View.GONE);
            M.setAlpha(1);
            N.setAlpha(o);
            C.setAlpha(o);
            N.setClickable(false);

        }
        if (num1 == 2) {

            last.setText("I am a:"+"\n");
            last1.setText("Baller");
            next.setVisibility(View.GONE);
            M.setAlpha(1);
            N.setAlpha(o);
            C.setAlpha(o);
        }
    }
//Womens
        if("Womens".equals(s)) {
            if (num1 == 1) {

                last.setText("I am a:");
                next.setVisibility(View.GONE);
                last1.setText("Beginner");
                N.setAlpha(1);
                M.setAlpha(o);
                C.setAlpha(o);

            }
            if (num1 == 2) {

                last.setText("I am a:");
                last1.setText("Baller");
                next.setVisibility(View.GONE);
                N.setAlpha(1);

                M.setAlpha(o);
                C.setAlpha(o);
            }
        }
        //Coed

        if("Coed".equals(s)) {
            if (num1 == 1) {

                last.setText("I am a :");
                last1.setText("Beginner");
                next.setVisibility(View.GONE);
                C.setAlpha(1);
                M.setAlpha(o);
                N.setAlpha(o);

            }
            if (num1 == 2) {

                last.setText("I am a:");
                last1.setText("Baller");
                next.setVisibility(View.GONE);
                C.setAlpha(1);
                M.setAlpha(o);
                N.setAlpha(o);
            }
        }

        if(bool !=1) {
            M.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View v) {
                    next.setAlpha(i);
                    next.setBackgroundResource(R.drawable.button);
                    N.setAlpha(o);
                    C.setAlpha(o);
                    M.setAlpha(i);
                    num = 1;

                }
            });


            N.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View v) {
                    next.setBackgroundResource(R.drawable.button);
                    next.setAlpha(i);
                    M.setAlpha(o);
                    C.setAlpha(o);
                    N.setAlpha(i);
                    num = 2;

                }
            });


            C.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View v) {
                    next.setBackgroundResource(R.drawable.button);
                    N.setAlpha(o);
                    M.setAlpha(o);
                    C.setAlpha(i);
                    next.setAlpha(i);
                    num = 3;

                }
            });
        }



        next.setOnClickListener(new OnClickListener() {




            @Override
            public void onClick(View v) {




                if(num == 1){

                    Intent intent = new Intent(getBaseContext(), skilltalent.class);
                    intent.putExtra("", "Mens");
                    startActivity(intent);


                };

                if(num == 2){

                    Intent intent = new Intent(getBaseContext(), skilltalent.class);
                    intent.putExtra("", "Womens");
                    startActivity(intent);


                };
                if(num == 3){

                    Intent intent = new Intent(getBaseContext(), skilltalent.class);
                    intent.putExtra("", "Coed");
                    startActivity(intent);


                };

            }
        });









    }




}