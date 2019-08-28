package com.pedoran.pwpbsesi10.Kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pedoran.pwpbsesi10.MainActivity;
import com.pedoran.pwpbsesi10.R;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btnAC = findViewById(R.id.btn_calc_ac);
        Button btn1 = findViewById(R.id.btn_calc1);
        Button btn2 = findViewById(R.id.btn_calc2);
        Button btn3 = findViewById(R.id.btn_calc3);
        Button btn4 = findViewById(R.id.btn_calc4);
        Button btn5 = findViewById(R.id.btn_calc5);
        Button btn6 = findViewById(R.id.btn_calc6);
        Button btn7 = findViewById(R.id.btn_calc7);
        Button btn8 = findViewById(R.id.btn_calc8);
        Button btn9 = findViewById(R.id.btn_calc9);
        Button btn0 = findViewById(R.id.btn_calc0);
        Button btnPlus = findViewById(R.id.btn_calc_plus);
        Button btnMinus = findViewById(R.id.btn_calc_minus);
        Button btnDiv = findViewById(R.id.btn_calc_div);
        Button btnMulti = findViewById(R.id.btn_calc_multi);
        Button btnDot = findViewById(R.id.btn_calc_dot);

        initbtn(btnAC);
        initbtn(btn0);
        initbtn(btn1);
        initbtn(btn2);
        initbtn(btn3);
        initbtn(btn4);
        initbtn(btn5);
        initbtn(btn6);
        initbtn(btn7);
        initbtn(btn8);
        initbtn(btn9);
        initbtn(btnMulti);
        initbtn(btnAC);
        initbtn(btnAC);
        initbtn(btnAC);
        initbtn(btnAC);



    }

    @Override
    public void onClick(View view) {

    }

    private void initbtn(Button btn){
        btn.setOnClickListener(this);
    }
}
