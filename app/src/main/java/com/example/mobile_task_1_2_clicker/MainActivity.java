package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;


    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        mainBtn2 = (Button) findViewById(R.id.button2);
        mainBtn3 = (Button) findViewById(R.id.button3);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score++;
                if (score == 12 || score == 13 || score == 14){
                    String s = "Кнопка нажата : " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                                    }
                else if (score %10 == 2 || score %10 == 3 || score %10 == 4 ){
                    String s = "Кнопка нажата : " + score + " раза";
                    mainText.setText(s.toCharArray(), 0, s.length());
                }
                else if (score  == 1||score  >=5  ){
                    String s = "Кнопка нажата : " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                }

            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                if (score == 12 || score == 13 || score == 14){
                    String s = "Кнопка нажата : " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                }
                else if (score %10 == 2 || score %10 == 3 || score %10 == 4) {
                    String s = "Кнопка нажата : " + score + " разa";
                    mainText.setText(s.toCharArray(), 0, s.length());
                }
                else if (score  == 1||score  >=5  ){
                    String s = "Кнопка нажата : " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                }
            }
        };
        mainBtn2.setOnClickListener(clickListener1);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кнопка нажата : "  + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };
        mainBtn3.setOnClickListener(clickListener2);



    }

}

