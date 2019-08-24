package com.arcticumi.convert;

public class Format {

    private String output;

    Format(String inUnit, String outUnit, double convertedNum) {
        if (inUnit.equals("Inches")) {
            switch (outUnit) { //todo put switch in another function
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " Km";
                    break;
            }
        } else if (inUnit.equals("Feet")) {
            switch (outUnit) {
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " Km";
                    break;
            }
        } else if (inUnit.equals("Miles")) {
            switch (outUnit) {
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " km";
                    break;
            }
        } else if (inUnit.equals("Centimetres")) {
            switch (outUnit) {
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " Km";
                    break;
            }
        } else if (inUnit.equals("Metres")) {
            switch (outUnit) {
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " Km";
                    break;
            }
        } else if (inUnit.equals("Kilometres")) {
            switch (outUnit) {
                case "Inches":
                    output = roundTwo(convertedNum) + " in";
                    break;
                case "Feet":
                    output = roundTwo(convertedNum) + " ft";
                    break;
                case "Miles":
                    output = roundTwo(convertedNum) + " M";
                    break;
                case "Centimetres":
                    output = roundTwo(convertedNum) + " cm";
                    break;
                case "Metres":
                    output = roundTwo(convertedNum) + " m";
                    break;
                case "Kilometres":
                    output = roundTwo(convertedNum) + " Km";
                    break;
            }
        }
    }

    public String getOutput() {
        return output;
    }

    private double roundTwo(double input) {
        input = Math.round(input * 100);
        input /= 100;
        return input;
    } //TODO make in another class
}
