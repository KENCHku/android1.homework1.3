package com.example.android1homework13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private String userName="Kench";
    private int userPassword = 1234;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Info=(TextView)findViewById(R.id.txtVwInfoMessage);
        Login=(Button)findViewById(R.id.button);

        Info.setText("fill in the fields");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if ((userName.equals("kench"))&&(userPassword.equals("1106"))){
            Info.setText("Successful!");
        }
        else if ((userName.equals(""))&&(userPassword.equals(""))){
            Info.setText("fill in the fields!");
        }
        else{
            Info.setText("Incorrect password or name!");
        }
    }
}