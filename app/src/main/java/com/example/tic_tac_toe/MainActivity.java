package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,refresh;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
int flag=0;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newgame();
            }
        });

    }
    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        refresh=findViewById(R.id.refresh);
    }
    public void check(View view){
        Button btn_current=(Button) view;
        if(btn_current.getText().toString().equals("")){


        count++;
        if(flag==0){
            btn_current.setText("X");
            flag=1;
        }else{
            btn_current.setText("O");
            flag=0;
        }
     if(count>4){
         b1=btn1.getText().toString();
         b2=btn2.getText().toString();
         b3=btn3.getText().toString();
         b4=btn4.getText().toString();
         b5=btn5.getText().toString();
         b6=btn6.getText().toString();
         b7=btn7.getText().toString();
         b8=btn8.getText().toString();
         b9=btn9.getText().toString();

         //condition
         if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
             //1

             Toast.makeText(this, "winner is "+b1, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b1);
                 }
             },1000);

         }else if(b4.equals(b5) && b5.equals(b6) && !b5.equals("")){
             //2
             Toast.makeText(this, "winner is "+b4, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b4);
                 }
             },1000);

         }else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
             //3
             Toast.makeText(this, "winner is "+b7, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b7);
                 }
             },1000);

         }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
             //4
             Toast.makeText(this, "winner is "+b1, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b1);
                 }
             },1000);

         }else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
             //5
             Toast.makeText(this, "winner is "+b2, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b2);
                 }
             },1000);

         }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
             //6
             Toast.makeText(this, "winner is "+b3, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b3);
                 }
             },1000);

         }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
             //7
             Toast.makeText(this, "winner is "+b1, Toast.LENGTH_SHORT).show();
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();
                     congtas(b1);
                 }
             },1000);

         }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
             //8
             Toast.makeText(this, "winner is "+b3, Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    newgame();
                    congtas(b3);
                }
            },1000);

         }else if(!b1.equals("") && !b2.equals("") && !b3.equals("") &&
         !b4.equals("") && !b5.equals("") && !b6.equals("") &&
         !b7.equals("") && !b8.equals("") && !b9.equals("")){
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     newgame();

                 }
             },1000);
             Toast.makeText(this, "Game draw", Toast.LENGTH_LONG).show();

         }
     }
        }
    }
    public void newgame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }
    public void congtas(String name){

        Intent intent=new Intent(MainActivity.this,winner_display.class);
        startActivity(intent);
    }

}