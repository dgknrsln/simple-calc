package com.example.dgknrsln.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double intNum1, intNum2;
    String strNum1, strNum2;
    String resultScreen = "", operator ="";
    TextView tvScreen;



    /*Print result to TextView*/
    public void result(View v){

        tvScreen = (TextView)findViewById(R.id.textView);

        try{
            if(operator.equals("+")){
                strNum1 = resultScreen.substring(0,resultScreen.indexOf("+"));
                strNum2 = resultScreen.substring(resultScreen.indexOf("+")+1,resultScreen.length());

                intNum1 = Double.parseDouble(strNum1);
                intNum2 = Double.parseDouble(strNum2);

                Double result = intNum1 + intNum2;

                int intResult = result.intValue();
                if(intResult<result){
                    resultScreen = Double.toString(result);
                }else if(intResult==result){
                    resultScreen = Integer.toString(intResult);
                }

                tvScreen.setText(resultScreen);

            }else if(operator.equals("-")){
                strNum1 = resultScreen.substring(0,resultScreen.indexOf("-"));
                strNum2 = resultScreen.substring(resultScreen.indexOf("-")+1,resultScreen.length());

                intNum1 = Double.parseDouble(strNum1);
                intNum2 = Double.parseDouble(strNum2);

                Double result = intNum1 - intNum2;

                int intResult = result.intValue();

                if(intResult<result){
                    resultScreen = Double.toString(result);
                }else if(intResult==result){
                    resultScreen = Integer.toString(intResult);
                }
                tvScreen.setText(resultScreen);

            }else if(operator.equals("*")){
                strNum1 = resultScreen.substring(0,resultScreen.indexOf("*"));
                strNum2 = resultScreen.substring(resultScreen.indexOf("*")+1,resultScreen.length());

                intNum1 = Double.parseDouble(strNum1);
                intNum2 = Double.parseDouble(strNum2);

                Double result = intNum1 * intNum2;

                int intResult = result.intValue();
                if(intResult<result){
                    resultScreen = Double.toString(result);
                }else if(intResult==result){
                    resultScreen = Integer.toString(intResult);
                }
                tvScreen.setText(resultScreen);

            }else if(operator.equals("/")){
                strNum1 = resultScreen.substring(0,resultScreen.indexOf("/"));
                strNum2 = resultScreen.substring(resultScreen.indexOf("/")+1,resultScreen.length());

                intNum1 = Double.parseDouble(strNum1);
                intNum2 = Double.parseDouble(strNum2);


                if(intNum2==0){
                    tvScreen.setText("Err");
                }else{
                    Double result = intNum1 / intNum2;

                    int intResult = result.intValue();
                    if(intResult<result){
                        resultScreen = Double.toString(result);
                    }else if(intResult==result){
                        resultScreen = Integer.toString(intResult);
                    }
                    tvScreen.setText(resultScreen);
                }


            }

        }catch(Exception e){
            tvScreen.setText("Err");
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
