package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView papname, papnum, mamname, mamnum, kuyname, kuynum, atename, atenum, bunname, bunnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        papname=findViewById(R.id.papname);
        papnum=findViewById(R.id.papnum);

        mamname=findViewById(R.id.mamname);
        mamnum=findViewById(R.id.mamnum);

        kuyname=findViewById(R.id.kuyname);
        kuynum=findViewById(R.id.kuynum);

        atename=findViewById(R.id.atename);
        atenum=findViewById(R.id.atenum);

        bunname=findViewById(R.id.bunname);
        bunnum=findViewById(R.id.bunnum);

    }//oncreate

    public void msgbtn(View view) {
        String value=papname.getText().toString();
        Intent intent=new Intent(getApplicationContext(),sendpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void callbtn(View view) {
        String value=papnum.getText().toString();
        Intent intent=new Intent(getApplicationContext(),callpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void msgbtn2(View view) {
        String value=mamname.getText().toString();
        Intent intent=new Intent(getApplicationContext(),sendpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void callbtn2(View view) {
        String value=mamnum.getText().toString();
        Intent intent=new Intent(getApplicationContext(),callpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void msgbtn3(View view) {
        String value=kuyname.getText().toString();
        Intent intent=new Intent(getApplicationContext(),sendpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void callbtn3(View view) {
        String value=kuynum.getText().toString();
        Intent intent=new Intent(getApplicationContext(),callpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void msgbtn4(View view) {
        String value=atename.getText().toString();
        Intent intent=new Intent(getApplicationContext(),sendpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void callbtn4(View view) {
        String value=atenum.getText().toString();
        Intent intent=new Intent(getApplicationContext(),callpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void msgbtn5(View view) {
        String value=bunname.getText().toString();
        Intent intent=new Intent(getApplicationContext(),sendpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }

    public void callbtn5(View view) {
        String value=bunnum.getText().toString();
        Intent intent=new Intent(getApplicationContext(),callpage.class);
        intent.putExtra("value",value);
        startActivity(intent);
    }
}//main