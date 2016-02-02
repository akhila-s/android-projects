package com.example.akhila.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_one;
    EditText display;
    String number_selected = "";
    String display_string = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }



    String total = "";
    double v1, v2;
    String sign = "";
    double grand_total = 0;
    public void onClick(View v){
        Button button = (Button) v;
        String str = button.getText().toString();
        total = total + str;
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText(total);
    }

    public void onAdd (View v) {
        v1 = Double.parseDouble(total);
        total = "";
        Button button = (Button) v;
        String str = button.getText().toString();
        sign = str;
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
    }

    public  void onCalculate (View v) {
        EditText edit = (EditText)findViewById(R.id.editText);
        String str2 = edit.getText().toString();
        v2 = Double.parseDouble(str2);

        if (sign.equals("+")) {
            grand_total = v1 + v2 ;
        }
        else if (sign.equals("-")) {
            grand_total = v1 - v2;
        }
        else if (sign.equals("*")) {
            grand_total = v1 * v2;
        }
        else if (sign.equals("/")) {
            grand_total = v1 /v2;
        }
        edit.setText(grand_total+"");
        v1 = 0;
        v2 = 0;
    }

    public void OnClear (View v) {
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
        grand_total = 0;
        total = "";
        v1 = 0;
        v2 = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

//
//
//     public void display1(View v) {
//        number_selected = Integer.toString(1);
//        display_string.concat(number_selected);
//         System.out.println(display_string);
//        display.setText(display_string);
//    }
//
//
//    public void display2(View v) {
//        number_selected = Integer.toString(2);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display3(View v) {
//        number_selected = Integer.toString(3);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display4(View v) {
//        number_selected = Integer.toString(4);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display5(View v) {
//        number_selected = Integer.toString(5);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display6(View v) {
//        number_selected = Integer.toString(6);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display7(View v) {
//        number_selected = Integer.toString(7);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display8(View v) {
//        number_selected = Integer.toString(8);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display9(View v) {
//        number_selected = Integer.toString(9);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//
//    public void display0(View v) {
//        number_selected = Integer.toString(0);
//        display_string.concat(number_selected);
//        display.setText(display_string);
//    }
//
//    public void display_plus(View v) {
//        display_string.concat("+");
//        display.setText(display_string);
//    }
//
//    public void display_minus(View v) {
//        display_string.concat("-");
//        display.setText(display_string);
//    }
//
//    public void display_multiply(View v) {
//        display_string.concat("X");
//        display.setText(display_string);
//    }
//
//    public void display_divide(View v) {
//        display_string.concat("/");
//        display.setText(display_string);
//    }
//    public void display_decimal(View v) {
//        display_string.concat(".");
//        display.setText(display_string);
//    }
//
//}
