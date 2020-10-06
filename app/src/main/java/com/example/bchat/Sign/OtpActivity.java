package com.example.bchat.Sign;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.bchat.R;

public class OtpActivity extends AppCompatActivity {
    EditText o1,o2,o3,o4;
    int position=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(getResources().getColor(R.color.blue));
        }
        //mapping
        o1=findViewById(R.id.otp1);
        o2=findViewById(R.id.otp2);
        o3=findViewById(R.id.otp3);
        o4=findViewById(R.id.otp4);

    }
    public void otpEnter(View view){
        if(position<=5 && position>=1) {
            switch (view.getId()) {
                case R.id.btn0:addvalue(0);break;
                case R.id.btn1:addvalue(1);break;
                case R.id.btn2:addvalue(2);break;
                case R.id.btn3:addvalue(3);break;
                case R.id.btn4:addvalue(4);break;
                case R.id.btn5:addvalue(5);break;
                case R.id.btn6:addvalue(6);break;
                case R.id.btn7:addvalue(7);break;
                case R.id.btn8:addvalue(8);break;
                case R.id.btn9:addvalue(9);break;
                case R.id.btnback:removevalue();
            }
        }
    }
    private void addvalue(int value){
        switch (position){
            case 1:o1.setText(""+value);o1.getBackground().setColorFilter(getResources().getColor(R.color.green), PorterDuff.Mode.SRC_ATOP);position++;break;
            case 2:o2.setText(""+value);o2.getBackground().setColorFilter(getResources().getColor(R.color.green), PorterDuff.Mode.SRC_ATOP);position++;break;
            case 3:o3.setText(""+value);o3.getBackground().setColorFilter(getResources().getColor(R.color.green), PorterDuff.Mode.SRC_ATOP);position++;break;
            case 4:o4.setText(""+value);o4.getBackground().setColorFilter(getResources().getColor(R.color.green), PorterDuff.Mode.SRC_ATOP);position++;break;
        }
    }
    private void removevalue(){
        if(position>1)
            position--;
        switch (position){
            case 1:o1.setText("");o1.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);break;
            case 2:o2.setText("");o2.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);break;
            case 3:o3.setText("");o3.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);break;
            case 4:o4.setText("");o4.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);break;
        }
    }
}