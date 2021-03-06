package com.haofang.testscos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bJumpToSCOSMainScreen)
    public void onViewClicked() {
        Intent intent = new Intent("scos.intent.action.SCOSMAIN");
        startActivity(intent);
    }
}
