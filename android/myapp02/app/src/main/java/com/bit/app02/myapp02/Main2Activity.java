package com.bit.app02.myapp02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button btn02;
    private Button btn01;
    private String msg="abcd";
    private Button btn03;
    private Button btn04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("메인 페이지");

        btn01=findViewById(R.id.btn01);
        btn02=findViewById(R.id.btn02);
        btn03=findViewById(R.id.btnTel);
        btn04=findViewById(R.id.btnImg);

        btn01.setOnClickListener(new BtnEvent());
        btn02.setOnClickListener(new BtnEvent());
        btn03.setOnClickListener(new BtnEvent());
        btn04.setOnClickListener(new BtnEvent());
    }

    class BtnEvent implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(btn01==view){
                Toast.makeText(view.getContext(), "버튼1 클릭", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent();
                intent.setClassName(view.getContext(),"com.bit.app02.myapp02.MainActivity");
                view.getContext().startActivity(intent);
            }else if(btn02==view){
                Toast.makeText(view.getContext(), "버튼2 클릭", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent();
                intent.setClass(view.getContext(),Main3Activity.class);

                intent.putExtra("param1",msg);
//                view.getContext().startActivity(intent);
                startActivityForResult(intent,0);
            }else if(btn03==view){
                Log.d("ab","sadf");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("01012345678"));
                startActivity(intent);
            } else if (btn04 == view) {
                Intent intent=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent);
            }

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Log.d("bit","onActivityResult");
        if(resultCode==RESULT_OK){
            String msg=data.getStringExtra("result");
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        }
    }
}
