package com.example.solar.quizproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void check_button(View view) {
        int option = Integer.parseInt(view.getTag().toString());
        if(option == 1){
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.answer11:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer12:
                    Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();
                    break;
            }
        }

        else if (option == 2) {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.answer21:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer22:
                    Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer23:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer24:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;

                default:
                    Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();
                    break;
            }
        }

        else if(option == 3){
            EditText texto = findViewById(R.id.editText1);
            String t = texto.getText().toString();
            String f = "Finland";
            if(texto.getText().toString().contains("Finland")) {
                Toast.makeText(getApplicationContext(),R.string.correct, Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(),R.string.wrong, Toast.LENGTH_LONG).show();
            }
        }

        else if(option==4){
            CheckBox a1 = findViewById(R.id.answer41);
            CheckBox a2 = findViewById(R.id.answer42);
            CheckBox a3 = findViewById(R.id.answer43);
            CheckBox a4 = findViewById(R.id.answer44);
            if(a1.isChecked()&&a2.isChecked()&&a3.isChecked()){
                Toast.makeText(getApplicationContext(),R.string.correct, Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(),R.string.wrong, Toast.LENGTH_LONG).show();
            }
        }

        else if(option == 5){
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup3);
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.answer51:
                    Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer52:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer53:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                case R.id.answer54:
                    Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();
                    break;}
        }
    }
}