package com.example.toyoda_physicscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button physics, geometry, velocity, force, weight, density, voltage, rectPrism, sphere, cylinder, cone, sqrPyramid, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        physics = findViewById(R.id.physics);
        geometry = findViewById(R.id.geometry);
        velocity = findViewById(R.id.velocity);
        force = findViewById(R.id.force);
        weight = findViewById(R.id.weight);
        density = findViewById(R.id.density);
        voltage = findViewById(R.id.voltage);
        rectPrism = findViewById(R.id.rectPrism);
        sphere = findViewById(R.id.sphere);
        cylinder = findViewById(R.id.cylinder);
        cone = findViewById(R.id.cone);
        sqrPyramid = findViewById(R.id.sqrPyramid);
        back = findViewById(R.id.back);

        physics.setOnClickListener(this);
        geometry.setOnClickListener(this);
        back.setOnClickListener(this);

        start();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.physics:
                physics();
                break;
            case R.id.geometry:
                geometry();
                break;
            case R.id.back:
                start();
        }
    }

    public void start() {
        velocity.setVisibility(View.GONE);
        force.setVisibility(View.GONE);
        weight.setVisibility(View.GONE);
        density.setVisibility(View.GONE);
        voltage.setVisibility(View.GONE);
        rectPrism.setVisibility(View.GONE);
        sphere.setVisibility(View.GONE);
        cylinder.setVisibility(View.GONE);
        cone.setVisibility(View.GONE);
        sqrPyramid.setVisibility(View.GONE);
        physics.setVisibility(View.VISIBLE);
        geometry.setVisibility(View.VISIBLE);
        back.setVisibility(View.GONE);
    }

    public void physics() {
        velocity.setVisibility(View.VISIBLE);
        force.setVisibility(View.VISIBLE);
        weight.setVisibility(View.VISIBLE);
        density.setVisibility(View.VISIBLE);
        voltage.setVisibility(View.VISIBLE);
        rectPrism.setVisibility(View.GONE);
        sphere.setVisibility(View.GONE);
        cylinder.setVisibility(View.GONE);
        cone.setVisibility(View.GONE);
        sqrPyramid.setVisibility(View.GONE);
        physics.setVisibility(View.GONE);
        geometry.setVisibility(View.GONE);
        back.setVisibility(View.VISIBLE);
    }

    public void geometry() {
        velocity.setVisibility(View.GONE);
        force.setVisibility(View.GONE);
        weight.setVisibility(View.GONE);
        density.setVisibility(View.GONE);
        voltage.setVisibility(View.GONE);
        rectPrism.setVisibility(View.VISIBLE);
        sphere.setVisibility(View.VISIBLE);
        cylinder.setVisibility(View.VISIBLE);
        cone.setVisibility(View.VISIBLE);
        sqrPyramid.setVisibility(View.VISIBLE);
        physics.setVisibility(View.GONE);
        geometry.setVisibility(View.GONE);
        back.setVisibility(View.VISIBLE);
    }
}
