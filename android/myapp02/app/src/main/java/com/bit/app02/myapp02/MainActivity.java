package com.bit.app02.myapp02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit01;
    private Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("첫번째 페이지");

        edit01=findViewById(R.id.editText);
        edit01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((EditText)view).setText("");
            }
        });

        btn01=findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit=findViewById(R.id.editText);
                String msg=edit.getText().toString();
                for(int i=0;i<msg.length();i++){
                    if(!Character.isDigit(msg.charAt(i))){
                        msg="잘못입력 숫자plase";
                        edit.setText("");
                        break;
                    }
                }
                Toast.makeText(view.getContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
