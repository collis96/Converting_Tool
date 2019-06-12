package com.arcticumi.convert;

public class Conversions {
    private static final String TAG = "Conversions";
    private double output;

    public Conversions() {
        output = 0;
    }

    public void inchesToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                output = input;
                break;
            case "Feet":
                output = input / 12;
                break;
            case "Miles":
                output = input / 63360;
                break;
            case "Centimetres":
                output = input * 2.54;
                break;
            case "Metres":
                output = input / 39.37;
                break;
            case "Kilometres":
                output = input / 39370.079;
                break;
        }
    } //done

    public void feetToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                output = input * 12;
                break;
            case "Feet":
                output = input;
                break;
            case "Miles":
                output = input / 5280;
                break;
            case "Centimetres":
                output = input * 30.48;
                break;
            case "Metres":
                output = input * 0.3048;
                break;
            case "Kilometres":
                output = input / 3280.84;
                break;
        }
    } //done

    public void milesToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                output = input * 63360;
                break;
            case "Feet":
                output = input * 5280;
                break;
            case "Miles":
                output = input;
                break;
            case "Centimetres":
                output = input * 160934.4;
                break;
            case "Metres":
                output = input * 1609.344
                ;
                break;
            case "Kilometres":
                output = input * 1.60934;
                break;
        }
    } //done

    public void centiToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                output = input / 30.48;
                break;
            case "Miles":
                output = input / 160934.4;
                break;
            case "Inches":
                output = input * 0.3937007;
                break;
            case "Centimetres":
                output = input;
                break;
            case "Metres":
                output = input / 100;
                break;
            case "Kilometres":
                output = input / 100000;
                break;
        }
    } //done

    public void metresToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                output = input * 3.28084;
                break;
            case "Miles":
                output = input / 1609.344;
                break;
            case "Centimetres":
                output = input * 100;
                break;
            case "Metres":
                output = input;
                break;
            case "Inches":
                output = input * 39.37;
                break;
            case "Kilometres":
                output = input / 1000;
                break;
        }
    } //done

    public void kilometreToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                output = input * 3280.84;
                break;
            case "Miles":
                output = input * 0.621371;
                break;
            case "centimetres":
                output = input * 100000;
                break;
            case "Metres":
                output = input * 1000;
                break;
            case "Kilometres":
                output = input;
                break;
            case "Inches":
                output = input * 39370.079;
                break;
        }
    } //done

    public double getOutput() {
        return output;
    }
}
