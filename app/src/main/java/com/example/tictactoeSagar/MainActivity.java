package com.example.tictactoeSagar;

import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
int flag=0,count=0,flag2=0;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);

    }
    public void check(View v) throws InterruptedException {
        Button v1= (Button)v;

        if(v1.getText().toString().equals("") && flag2==0) {

            if (flag == 0) {
                v1.setTextSize(100);
                v1.setText("X");
                flag = 1;
                count++;
            } else {
                v1.setTextSize(100);
                v1.setText("O");
                flag = 0;
                count++;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    btn1.setBackgroundColor(Color.GREEN);
                    btn2.setBackgroundColor(Color.GREEN);
                    btn3.setBackgroundColor(Color.GREEN);
                    flag2=1;



                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {

                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    btn4.setBackgroundColor(Color.GREEN);
                    btn5.setBackgroundColor(Color.GREEN);
                    btn6.setBackgroundColor(Color.GREEN);
                    flag2=1;

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Intent intent =getIntent();
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    btn7.setBackgroundColor(Color.GREEN);
                    btn8.setBackgroundColor(Color.GREEN);
                    btn9.setBackgroundColor(Color.GREEN);
                    flag2=1;
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    btn1.setBackgroundColor(Color.GREEN);
                    btn4.setBackgroundColor(Color.GREEN);
                    btn7.setBackgroundColor(Color.GREEN);
                    flag2=1;
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {

                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    btn2.setBackgroundColor(Color.GREEN);
                    btn5.setBackgroundColor(Color.GREEN);
                    btn8.setBackgroundColor(Color.GREEN);
                    flag2=1;
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {

                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    btn3.setBackgroundColor(Color.GREEN);
                    btn6.setBackgroundColor(Color.GREEN);
                    btn9.setBackgroundColor(Color.GREEN);
                    flag2=1;
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    btn1.setBackgroundColor(Color.GREEN);
                    btn5.setBackgroundColor(Color.GREEN);
                    btn9.setBackgroundColor(Color.GREEN);
                    flag2=1;
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    btn3.setBackgroundColor(Color.GREEN);
                    btn5.setBackgroundColor(Color.GREEN);
                    btn7.setBackgroundColor(Color.GREEN);
                    flag2=1;
                }
                else if(count==9)
                {
                    Toast.makeText(this, "Match is Draw ", Toast.LENGTH_SHORT).show();
                    flag2=1;
                }
            }
        }

    }
    public void restart(View v)
    {
        flag2=0;
        Intent intent =getIntent();
        finish();
        startActivity(intent);
    }




}