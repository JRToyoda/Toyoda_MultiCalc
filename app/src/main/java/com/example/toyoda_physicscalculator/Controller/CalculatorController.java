package com.example.toyoda_physicscalculator.Controller;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.toyoda_physicscalculator.Model.CalculatorModel;

public class CalculatorController {

    CalculatorModel a = new CalculatorModel();

    public void physics(double x, double y, String concept) {
        switch (concept) {
            case "Velocity":
                a.setConcept(concept);
                a.setDistance(x);
                a.setTime(y);
                a.setAnswer(a.getDistance()/a.getTime());
                break;
            case "Force":
                a.setConcept(concept);
                a.setMass(x);
                a.setAcceleration(y);
                a.setAnswer(a.getMass()*a.getAcceleration());
                break;
            case "Weight":
                a.setConcept(concept);
                a.setMass(x);
                a.setGravity(y);
                a.setAnswer(a.getMass()*a.getGravity());
                break;
            case "Density":
                a.setConcept(concept);
                a.setMass(x);
                a.setVolume(y);
                a.setAnswer(a.getMass()/a.getVolume());
                break;
            case "Voltage":
                a.setConcept(concept);
                a.setCurrent(x);
                a.setResistance(y);
                a.setAnswer(a.getCurrent()*a.getResistance());
        }
    }
    public void geometry(double x, double y, double z, String shape) {
        switch (shape) {
            case "RECTANGULAR PRISM":
                a.setShape(shape);
                a.setLength(x);
                a.setWidth(y);
                a.setHeight(z);
                a.setVolume(a.getLength()*a.getWidth()*a.getHeight());
                a.setArea(2*((a.getLength()*a.getWidth())+(a.getWidth()*a.getHeight())+(a.getLength()*a.getHeight())));
                break;
            case "SPHERE":
                a.setShape(shape);
                a.setRadius(x);
                a.setVolume((4/3)*Math.PI*Math.pow(a.getRadius(),3));
                a.setArea(4*Math.PI*Math.pow(a.getRadius(),2));
                break;
            case "CYLINDER":
                a.setShape(shape);
                a.setRadius(x);
                a.setHeight(y);
                a.setVolume(Math.PI*Math.pow(a.getRadius(),2)*a.getHeight());
                a.setArea(2*Math.PI*a.getRadius()*a.getHeight()+2*Math.PI*Math.pow(a.getRadius(),2));
                break;
            case "CONE":
                a.setShape(shape);
                a.setRadius(x);
                a.setHeight(y);
                a.setVolume(Math.PI*Math.pow(a.getRadius(),2)*(a.getHeight()/3));
                a.setArea(Math.PI* a.getRadius()*(a.getRadius()+Math.sqrt(Math.pow(a.getHeight(),2)+Math.pow(a.getRadius(),2))));
        }
    }
    @SuppressLint("SetTextI18n")
    public void physicsOutput(TextView x1, TextView x2, TextView x3, String concept) {
        a.setConcept(concept);
        switch (concept) {
                case "Velocity":
                x1.setText("Distance:");
                x2.setText("Time:");
                x3.setText(concept);
                break;
            case "Force":
                x1.setText("Mass:");
                x2.setText("Acceleration:");
                x3.setText(concept);
                break;
            case "Weight":
                x1.setText("Mass:");
                x2.setText("Gravity:");
                x3.setText(concept);
                break;
            case "Density":
                x1.setText("Mass:");
                x2.setText("Volume:");
                x3.setText(concept);
                break;
            case "Voltage":
                x1.setText("Current:");
                x2.setText("Resistance:");
                x3.setText(concept);
        }
    }
    @SuppressLint("SetTextI18n")
    public void geometryOutput(TextView Shape, TextView y1, TextView y2, TextView y3, String shape, EditText inputII, EditText inputIII) {
        a.setConcept(shape);
        switch (shape) {
            case "RECTANGULAR PRISM":
                Shape.setText(shape);
                y1.setText("Length:");
                y2.setText("Width");
                y3.setText("Height:");
                y2.setVisibility(View.VISIBLE);
                y3.setVisibility(View.VISIBLE);
                inputII.setVisibility(View.VISIBLE);
                inputIII.setVisibility(View.VISIBLE);
                inputII.setEnabled(true);
                inputIII.setEnabled(true);
                break;
            case "SPHERE":
                Shape.setText(shape);
                y1.setText("Radius:");
                y2.setVisibility(View.INVISIBLE);
                y3.setVisibility(View.INVISIBLE);
                inputII.setVisibility(View.INVISIBLE);
                inputIII.setVisibility(View.INVISIBLE);
                inputII.setEnabled(false);
                inputIII.setEnabled(false);
                break;
            case "CYLINDER":
                Shape.setText(shape);
                y1.setText("Radius:");
                y2.setText("Height:");
                y2.setVisibility(View.VISIBLE);
                y3.setVisibility(View.INVISIBLE);
                inputII.setVisibility(View.VISIBLE);
                inputIII.setVisibility(View.INVISIBLE);
                inputII.setEnabled(true);
                inputIII.setEnabled(false);
            case "CONE":
        }
    }
    public void physicsAnswer(TextView answer) {
        answer.setText(String.valueOf(a.getAnswer()));
    }
    public void geometryAnswer(TextView volume, TextView area) {
        volume.setText(String.valueOf(a.getVolume()));
        area.setText(String.valueOf(a.getArea()));
    }
}