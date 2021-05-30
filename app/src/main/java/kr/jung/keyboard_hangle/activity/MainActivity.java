package kr.jung.keyboard_hangle.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import kr.jung.keyboard_hangle.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        Intent mainAct = new Intent(this, MainSettingActivity.class);
        startActivity(mainAct);
        finish();
        super.onBackPressed();
    }
}