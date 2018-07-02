package com.bit.app02.myapp02;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private EditText result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        this.setTitle("두번째 페이지");

        result=findViewById(R.id.textParam);
        final Intent intent=this.getIntent();
        String msg=intent.getStringExtra("param1");


        result.setText(msg);

        btn=findViewById(R.id.btn_03_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText result=findViewById(R.id.textParam);
                String msg=result.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("result",msg);

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}
