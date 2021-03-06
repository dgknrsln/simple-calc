package com.example.dgknrsln.hesapmakinesi;

import android.icu.math.BigDecimal;
import android.icu.math.MathContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    BigDecimal intNum1, intNum2,result;
    String strNum1, strNum2;
    String resultScreen = "", operator ="";
    TextView tvScreen;
    MathContext mc;



    /*Print result to TextView*/
    public void result(View v){

        tvScreen = (TextView)findViewById(R.id.textView);

        try{
            if(operator.equals("+")){

                mc = new MathContext(9);
                if(resultScreen.indexOf("+")==0){
                    strNum2 = resultScreen.substring(resultScreen.indexOf("+")+1,resultScreen.length());
                    intNum1 = result;
                }else{
                    strNum1 = resultScreen.substring(0,resultScreen.indexOf("+"));
                    strNum2 = resultScreen.substring(resultScreen.indexOf("+")+1,resultScreen.length());
                    intNum1 = new BigDecimal(strNum1);
                }

                intNum2 = new BigDecimal(strNum2);

                result = intNum1.add(intNum2);

                resultScreen = result.toString();

                tvScreen.setText(resultScreen);
                resultScreen ="";

            }else if(operator.equals("-")){

                if(resultScreen.indexOf("-")==0){
                    strNum2 = resultScreen.substring(resultScreen.indexOf("-")+1,resultScreen.length());
                    intNum1 = result;
                }else{
                    strNum1 = resultScreen.substring(0,resultScreen.indexOf("-"));
                    strNum2 = resultScreen.substring(resultScreen.indexOf("-")+1,resultScreen.length());
                    intNum1 = new BigDecimal(strNum1);
                }

                intNum2 = new BigDecimal(strNum2);

                result = intNum1.subtract(intNum2);

                resultScreen = result.toString();

                tvScreen.setText(resultScreen);
                resultScreen ="";

            }else if(operator.equals("*")){

                if(resultScreen.indexOf("*")==0){
                    strNum2 = resultScreen.substring(resultScreen.indexOf("*")+1,resultScreen.length());
                    intNum1 = result;
                }else{
                    strNum1 = resultScreen.substring(0,resultScreen.indexOf("*"));
                    strNum2 = resultScreen.substring(resultScreen.indexOf("*")+1,resultScreen.length());
                    intNum1 = new BigDecimal(strNum1);
                }

                intNum2 = new BigDecimal(strNum2);

                result = intNum1.multiply(intNum2);

                resultScreen = result.toString();

                tvScreen.setText(resultScreen);
                resultScreen ="";

            }else if(operator.equals("/")){

                if(resultScreen.indexOf("/")==0){
                    strNum2 = resultScreen.substring(resultScreen.indexOf("/")+1,resultScreen.length());
                    intNum1 = result;
                }else{
                    strNum1 = resultScreen.substring(0,resultScreen.indexOf("/"));
                    strNum2 = resultScreen.substring(resultScreen.indexOf("/")+1,resultScreen.length());
                    intNum1 = new BigDecimal(strNum1);
                }

                intNum2 = new BigDecimal(strNum2);


                if(intNum2.equals(0)){
                    tvScreen.setText("Err");
                    resultScreen ="";
                }else{
                    result = intNum1.divide(intNum2, 6, BigDecimal.ROUND_HALF_UP);

                    resultScreen = result.toString();

                    tvScreen.setText(resultScreen);
                    resultScreen ="";
                }


            }

        }catch(Exception e){
            tvScreen.setText("Err");
            resultScreen ="";
        }


    }

    /*All clear*/
    public void allClear(View v){
        tvScreen = (TextView)findViewById(R.id.textView);
        resultScreen = "";
        tvScreen.setText(resultScreen);

    }
    /*Delete*/
    public void delete(View V){

        tvScreen = (TextView)findViewById(R.id.textView);

        try{
            resultScreen = resultScreen.substring(0,resultScreen.length()-1);
            tvScreen.setText(resultScreen);
        }catch(Exception e){

        }
    }
    /*Print number or operator to TextView*/
    public void printScreen(String element){
        tvScreen = (TextView)findViewById(R.id.textView);
        resultScreen = resultScreen + element;
        tvScreen.setText(resultScreen);
    }
    /*ekran metoduna basılan butonu gönderir*/
    public void one(View v){
        printScreen("1");
    }
    public void two(View v){
        printScreen("2");
    }
    public void three(View v){
        printScreen("3");
    }
    public void four(View v){
        printScreen("4");
    }
    public void five(View v){
        printScreen("5");
    }
    public void six(View v){
        printScreen("6");
    }
    public void seven(View v){
        printScreen("7");
    }
    public void eight(View v){
        printScreen("8");
    }
    public void nine(View v){
        printScreen("9");
    }
    public void zero(View v){
        printScreen("0");
    }
    public void add(View v){
        printScreen("+");
        operator = "+";
    }
    public void substract(View v){
        printScreen("-");
        operator = "-";
    }
    public void multiply(View v){
        printScreen("*");
        operator = "*";
    }
    public void divide(View v){
        printScreen("/");
        operator = "/";
    }
    public void dot(View v){
        printScreen(".");
    }
    public void rightBracket(View v){
        printScreen(")");
    }public void leftBracket(View v){
        printScreen("(");
    }



}
