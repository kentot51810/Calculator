package com.hxh.hiatus.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare all the global variables
    private TextView displayText;
    private Button cancelBtn, posNegBtn, percentageBtn,
            divButton, multiplyBtn, minusBtn,
            addBtn, zeroBtn, oneBtn, twoBtn, threeBtn,
            fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn,
            nineBtn, decimalBtn;

    private String displayValue = "";
    private static boolean isTheStringEmpty = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeGlobalVariable();

        cancelBtn.setOnClickListener(v -> displayText.setText("0"));

        zeroBtn.setOnClickListener(view -> {
//            float convertedString = Float.parseFloat(displayText.getText().toString());
//            if (displayText.getText().charAt(1)){
//                return;
//            }else {
                displayText.append("0");
//            }
        });
        oneBtn.setOnClickListener((View view) -> {
            if (isTheStringEmpty) displayText.append("1");
        });
        twoBtn.setOnClickListener(view -> displayText.append("2"));
        threeBtn.setOnClickListener(view -> displayText.append("3"));
        fourBtn.setOnClickListener(view -> displayText.append("4"));
        fiveBtn.setOnClickListener(view -> displayText.append("5"));
        sixBtn.setOnClickListener(view -> displayText.append("6"));
        sevenBtn.setOnClickListener(view -> displayText.append("7"));
        eightBtn.setOnClickListener(view -> displayText.append("8"));
        nineBtn.setOnClickListener(view -> displayText.append("9"));
        decimalBtn.setOnClickListener(view -> displayText.append("."));

    }

    private void initializeGlobalVariable() {
        displayText = findViewById(R.id.display_text);
        cancelBtn = findViewById(R.id.cancel_button);
        posNegBtn = findViewById(R.id.pos_neg_button);
        divButton = findViewById(R.id.division_button);
        percentageBtn = findViewById(R.id.percentage_button);
        multiplyBtn = findViewById(R.id.multiplication_button);
        minusBtn = findViewById(R.id.minus_button);
        addBtn = findViewById(R.id.addition_button);
        zeroBtn = findViewById(R.id.number_zero_button);
        oneBtn = findViewById(R.id.number_one_button);
        twoBtn = findViewById(R.id.number_two_button);
        threeBtn = findViewById(R.id.number_three_button);
        fourBtn = findViewById(R.id.number_four_button);
        fiveBtn = findViewById(R.id.number_five_button);
        sixBtn = findViewById(R.id.number_six_button);
        sevenBtn = findViewById(R.id.number_seven_button);
        eightBtn = findViewById(R.id.number_eight_button);
        nineBtn = findViewById(R.id.number_nine_button);
        decimalBtn = findViewById(R.id.decimal_button);

    }

}
