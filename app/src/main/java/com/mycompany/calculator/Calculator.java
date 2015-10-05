package com.mycompany.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity {

    public String str = "";
    int i,
        num = 0,
        num2 = 0;
    char operator;
    EditText showResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        showResult = (EditText) findViewById(R.id.result_id);
    }

    private void reset() {
        str ="";
        num = 0;
        num2 = 0;
        showResult.setText("");
    }

    private void insertNum(int j) {
        num2 = j;
        str = Integer.toString(j);
        showResult.setText(str);
    }

    private void doOperation() {
        //resets string
        str = "";

        //calculates the final number
        if(operator == '+')
            num += num2;
        else if(operator == '-')
            num -= num2;
        else if(operator == '*')
            num *= num2;
        else if(operator == '/')
            num /= num2;
    }

    private void displayResult() {
        doOperation();
        showResult.setText("" + num);
    }

    public void btn1Clicked(View v) {
        insertNum(1);
    }

    public void btn2Clicked(View v) {
        insertNum(2);
    }

    public void btn3Clicked(View v) {
        insertNum(3);
    }

    public void btn4Clicked(View v) {
        insertNum(4);
    }

    public void btn5Clicked(View v) {
        insertNum(5);
    }

    public void btn6Clicked(View v) {
        insertNum(6);
    }

    public void btn7Clicked(View v) {
        insertNum(7);
    }

    public void btn8Clicked(View v) {
        insertNum(8);
    }

    public void btn9Clicked(View v) {
        insertNum(9);
    }

    public void btnAddClicked(View v) {
        operator = '+';
        showResult.setText("");
        num = num2;
    }

    public void btnSubtractClicked(View v) {
        operator = '-';
        showResult.setText("");
        num = num2;
    }

    public void btnMultiplyClicked(View v) {
        operator = '*';
        showResult.setText("");
        num = num2;
    }

    public void btnDivideClicked(View v) {
        operator = '/';
        showResult.setText("");
        num = num2;
    }

    public void btnEqualsClicked(View v) {
        displayResult();
    }

    public void btnCancelClicked(View v) {
        reset();
    }
}