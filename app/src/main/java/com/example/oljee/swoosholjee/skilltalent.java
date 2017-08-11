
package com.example.oljee.swoosholjee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class skilltalent extends AppCompatActivity {


Button beginner = null;
    Button pro = null;
    Button finish = null;
    String S="";
    int num = 0;
float o = (float).7;
    float i = (float).3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skilltalent);

   S=getIntent().getStringExtra("");
        beginner = (Button) findViewById(R.id.selection1);
        pro = (Button) findViewById(R.id.selection2);
        finish = (Button) findViewById(R.id.selection3);


        beginner.setOnClickListener(new OnClickListener() {



            @Override
            public void onClick(View v) {
                finish.setBackgroundResource(R.drawable.button);
                num = 1;
                finish.setAlpha(o);
                beginner.setAlpha(o);
                pro.setAlpha(i);
            }
        });





        pro.setOnClickListener(new OnClickListener() {



            @Override
            public void onClick(View v) {
                finish.setBackgroundResource(R.drawable.button);
                num = 2;
                finish.setAlpha(o);
                pro.setAlpha(o);
                beginner.setAlpha(i);
            }
        });



        finish.setOnClickListener(new OnClickListener() {



            @Override
            public void onClick(View v) {

                if(num == 1){
                    Intent intent = new Intent(getBaseContext(), league.class);
                    intent.putExtra("",1);
                    intent.putExtra("1",S);
                    intent.putExtra("2",1);
                    startActivity(intent);

                }
                if(num == 2){

                    Intent intent = new Intent(getBaseContext(), league.class);
                    intent.putExtra("", 2);

                    intent.putExtra("1",S);
                    intent.putExtra("2",1);
                    startActivity(intent);
                }
            }
        });




    }


}