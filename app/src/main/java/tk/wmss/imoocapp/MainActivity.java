package tk.wmss.imoocapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tk.wmss.imoocapp.demoapi.CheckBoxDemo;
import tk.wmss.imoocapp.demoapi.ToggleButtonDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toToggleButtonDome(View view){
        Intent intent = new Intent(MainActivity.this, ToggleButtonDemo.class);
        startActivity(intent);
    }

    public void  toCheckBoxDemo(View view){
        Intent intent = new Intent(MainActivity.this, CheckBoxDemo.class);
        startActivity(intent);
    }
}
