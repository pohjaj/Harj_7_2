package com.example.harj_7_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
    }

    public void sendMessage(View view){
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        //textView = (TextViev) findViewById(R.id.textView);
        //String message = editText.getText().toString();
        String message = "Hello world!";
        //intent.putExtra(EXTRA_MESSAGE, message);
        text.setText(message);
        //startActivity(intent);
    }
}