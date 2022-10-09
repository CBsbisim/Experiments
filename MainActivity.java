package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

       EditText edittext1;//声明编辑框1的变量
       EditText edittext2;//声明编辑框2的变量
       TextView textView2;//声明文本框2的变量
       Button GetResult;//声明按钮的变量
       int sum;

       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           edittext1 = findViewById(R.id.edittext1);//查找编辑框1输入的值
           edittext2 = findViewById(R.id.edittext2);//查找编辑框2输入的值
           textView2 = findViewById(R.id.textView2);//查找文本框2的值（可省略）
           GetResult=findViewById(R.id.GetResult);//查找按钮输入的值
           GetResult.setOnClickListener(this);//触发按钮
       }
       @Override
       public void onClick(View v) {
           String j1=edittext1.getText().toString();//设置字符变量j1接收编辑框1输入值
           String j2=edittext2.getText().toString();//设置字符变量j2接收编辑框2输入值
           int num1=Integer.valueOf(j1).intValue();//强制转换j1数据类型为int型
           int num2=Integer.valueOf(j2).intValue();//强制转换j2数据类型为int型
           sum=num1+num2;//相加
           j1=String.valueOf(sum);//相加值赋值给j1
           textView2.setText(j1);//用文本框2输出
       }
}