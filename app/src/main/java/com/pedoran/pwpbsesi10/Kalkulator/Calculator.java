package com.pedoran.pwpbsesi10.Kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pedoran.pwpbsesi10.MainActivity;
import com.pedoran.pwpbsesi10.R;

import java.util.regex.Pattern;

public class Calculator extends AppCompatActivity{
    TextView tvHasil,tvOperasi;
    String sentence = "";
    String operator = "";
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tvHasil = findViewById(R.id.tv_calc_result);
        tvOperasi = findViewById(R.id.tv_calc_sentence);
        tvOperasi.setText(sentence);
    }

    public void updateSentence(){
        tvOperasi.setText(sentence);
    }

    public void clear(){
        sentence = "";
        operator = "";
        result = "";
    }

    public void onClickNumber(View v){
        Button number = (Button) v;
        sentence += number.getText();
        updateSentence();
    }

    public void onClickOperator(View v){
        if (sentence == "") return;
        Button operate = (Button) v;

        if(result != ""){
            String temp = result;
            clear();
            sentence = temp;
        }

        if(operator != ""){
            Log.d("Test",""+sentence.charAt(sentence.length()-1));
            if(isOperator(sentence.charAt(sentence.length()-1))){
                sentence = sentence.replace(sentence.charAt(sentence.length()-1),operate.getText().charAt(0));
                updateSentence();
                return;
            }else{
                //jika operasi nya lebih dari satu
                getResult();
                sentence = result;
                result = "";
            }
            operator = operate.getText().toString();
        }

        sentence += operate.getText();
        operator = operate.getText().toString();
        updateSentence();
    }

    public void onClickAC(View v){
        clear();
        updateSentence();
    }

    public void onClickEqual(View v){
        if(sentence == "") return;
        if(!getResult()) return;
        tvOperasi.setText(sentence);
        tvHasil.setText(result);
    }

    public void onClickDot(View v){
        sentence += ".";
        updateSentence();
    }

    public double calculate(String num1,String num2,String op){
        switch (op){
            case "+": return Double.valueOf(num1) + Double.valueOf(num2);
            case "-": return Double.valueOf(num1) - Double.valueOf(num2);
            case "*": return Double.valueOf(num1) * Double.valueOf(num2);
            case "/": try{
                //entah kenapa kalo ga diginiin malah error
                return Double.valueOf(num1) / Double.valueOf(num2);
            }catch (Exception e){
                Log.d("ERROR",e.getMessage());
            }
            default: return -1;
        }
    }

    public boolean getResult(){
        if(operator == "") return false;
        String[] operation = sentence.split(Pattern.quote(operator));
        if(operation.length < 2) return false;
        result = String.valueOf(calculate(operation[0],operation[1],operator));
        return true;
    }

    public boolean isOperator(char op){
        switch (op){
            case '+':
            case '-':
            case '*':
            case '/': return true;
            default: return false;
        }
    }
}
