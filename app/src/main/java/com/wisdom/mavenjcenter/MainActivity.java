package com.wisdom.mavenjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wisdom.irefreshlayout.VRefreshLayout;

public class MainActivity extends AppCompatActivity {
  private VRefreshLayout vRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
