package com.arcticumi.convert;

import android.util.Log;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversions {
    private static final String TAG = "Conversions";
    private double doubleOut;
    private BigDecimal bigInput;
    private BigDecimal bigConv;
    private BigDecimal bigOutput;
    private String strOutput;

    public double getDoubleOut() {
        return doubleOut;
    }

    public String getStrOutput() {
        return strOutput;
    }

    public void inchesToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Feet":
                doubleOut = input / 12;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input / 63360;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Centimetres":
                doubleOut = input * 2.54;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input / 39.37;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input / 39370.079;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void feetToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                doubleOut = input * 12;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Feet":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input / 5280;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Centimetres":
                doubleOut = input * 30.48;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input * 0.3048;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input / 3280.84;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void milesToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Inches":
                doubleOut = input * 63360;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Feet":
                doubleOut = input * 5280;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Centimetres":
                doubleOut = input * 160934.4;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input * 1609.344;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input * 1.60934;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void centiToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                doubleOut = input / 30.48;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input / 160934.4;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Inches":
                doubleOut = input * 0.3937007;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Centimetres":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input / 100;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input / 100000;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void metresToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                doubleOut = input * 3.28084;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input / 1609.344;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Centimetres":
                doubleOut = input * 100;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Inches":
                doubleOut = input * 39.37;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input / 1000;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void kilometreToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Feet":
                doubleOut = input * 3280.84;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Miles":
                doubleOut = input * 0.621371;
                strOutput = String.valueOf(doubleOut);
                break;
            case "centimetres":
                doubleOut = input * 100000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Metres":
                doubleOut = input * 1000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Kilometres":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Inches":
                doubleOut = input * 39370.079;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqKilometreToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input * 1000000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 2.59;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input * 1196000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 10760000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 1550000000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input * 100;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input * 247.105;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqMetreToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 1000000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 2590000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input * 1.196;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 10.764;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 1550.003;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input / 10000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input / 4046.856;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqMileToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input * 2.59;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input * 2590000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input * 3098000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 27880000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                bigInput = new BigDecimal(input);
                String convStr = "4014000000";
                bigConv = new BigDecimal(convStr);
                bigOutput = bigInput.multiply(bigConv);
                strOutput = bigOutput.toString();
                break;
            case "Hectare":
                doubleOut = input * 258.999;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input * 640;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqYardToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 1196000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input / 1.196;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 3098000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 9;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 1296;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input / 11959.9;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input / 4840;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqFootToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 10760000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input / 10.764;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 27880000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input / 9;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 144;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input / 107639.104;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input / 43560;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void sqInchToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 1550000000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input / 1550.003;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                bigInput = new BigDecimal(input);
                String convStr = "4014000000";
                bigConv = new BigDecimal(convStr);
                bigOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP);
                strOutput = bigOutput.toString();
                break;
            case "Square yard":
                doubleOut = input / 1296;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input / 144;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input / 15500000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input / 6273000;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void hectareToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 100;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input * 10000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 258.999;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input * 11959.9;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 107639.104;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 15500000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input * 2.471;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void acreToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Square kilometre":
                doubleOut = input / 247.105;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square metre":
                doubleOut = input * 4046.856;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square mile":
                doubleOut = input / 640;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square yard":
                doubleOut = input * 4840;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square foot":
                doubleOut = input * 43560;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Square inch":
                doubleOut = input * 6273000;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Hectare":
                doubleOut = input / 2.471;
                strOutput = String.valueOf(doubleOut);
                break;
            case "Acre":
                doubleOut = input;
                strOutput = String.valueOf(doubleOut);
                break;
        }
    }

    public void celsiusToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Celsius":
                strOutput = String.valueOf(input);
                break;
            case "Fahrenheit":
                bigInput = new BigDecimal(input);
                bigConv = new BigDecimal(32);
                double temp = 1.8;
                BigDecimal equation = bigInput.multiply(new BigDecimal(temp));
                bigOutput = equation.add(bigConv);
                strOutput = bigOutput.toString();
                break;
            case "Kelvin":
                bigInput = new BigDecimal(input);
                bigConv = new BigDecimal(273.15);
                bigOutput = bigInput.add(bigConv);
                strOutput = bigOutput.toString();
                break;
        }
    }

    public void fahrenheitToOther(double input, String outUnit) {
        double temp = 0.555556;
        bigInput = new BigDecimal(input);
        bigConv = new BigDecimal(32);
        BigDecimal equation = bigInput.subtract(bigConv);
        Log.d(TAG, "fahrenheitToOther: Before switch = " + equation.toString());
        switch (outUnit) {
            case "Celsius":
                bigOutput = equation.multiply(new BigDecimal(temp));
                Log.d(TAG, "fahrenheitToOther: Celsius in switch = " + bigOutput.toString());
                strOutput = bigOutput.toString();
                break;
            case "Fahrenheit":
                strOutput = String.valueOf(input);
                break;
            case "Kelvin":
                BigDecimal tempOutput = equation.multiply(new BigDecimal(temp));
                bigOutput = tempOutput.add(new BigDecimal(273.15));
                strOutput = bigOutput.toString();
                break;
        }
    }

    public void kelvinToOther(double input, String outUnit) {
        switch (outUnit) {
            case "Celsius":
                bigInput = new BigDecimal(input);
                bigConv = new BigDecimal(273.15);
                bigOutput = bigInput.subtract(bigConv);
                strOutput = bigOutput.toString();
                break;
            case "Fahrenheit":
                bigInput = new BigDecimal(input);
                bigConv = new BigDecimal(273.15);
                double temp = 1.8;
                BigDecimal equation = bigInput.subtract(bigConv);
                BigDecimal tempOutput = equation.multiply(new BigDecimal(temp));
                bigOutput = tempOutput.add(new BigDecimal(32));
                strOutput = bigOutput.toString();
                break;
            case "Kelvin":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void cubicMetreToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                strOutput = String.valueOf(input);
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(35.3147);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(61023.7);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(264.172);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(1056.688);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(2113.376);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(4166.667);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(33814.023);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(67628.045);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(202884.202);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(219.969);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(879.877);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(1759.75);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(3519.51);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(35195.08);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(56312.104);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(168936.313);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void cubicFootToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(35.315);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                strOutput = String.valueOf(input);
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(1728);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(28.317);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(28316.847);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(7.481);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(29.922);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(59.8442);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(117.987);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(957.506);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(1915.013);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(5745.041);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(6.229);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(24.915);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(49.831);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(99.661);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(996.614);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(1594.581);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(4783.74);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void cubicInchToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(61023.744);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(1728);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                strOutput = String.valueOf(input);
                break;
            case "Litre":
                bigConv = new BigDecimal(61.024);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(16.387);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(231);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(57.75);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(28.875);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(14.646);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(1.805);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(1.108);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(3.325);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(277.419);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(69.355);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(34.677);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(17.339);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(1.734);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(1.084);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(2.768);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void litreToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(28.317);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(61.024);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                strOutput = String.valueOf(input);
                break;
            case "Millilitre":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(3.785);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(1.057);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(2.113);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(4.167);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(33.814);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(67.628);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(202.884);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(4.546);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(1.137);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(1.76);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(3.52);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(35.195);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(56.312);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(168.936);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void millilitreToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(28316.847);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(16.387);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                strOutput = String.valueOf(input);
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(3785.412);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(946.353);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(473.176);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(240);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(29.574);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(14.787);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(4.929);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(4546.09);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(1136.522);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(568.261);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(284.131);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(28.413);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(17.758);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(5.919);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void usLiquidGallonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(264.172);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(7.481);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(231);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(3.785);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(3785.412);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                strOutput = String.valueOf(input);
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(15.773);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(128);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(256);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(768);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(3.331);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(6.661);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(13.323);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(133.228);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(213.165);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(639.494);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usLiquidQuartToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(1056.688);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(29.922);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(57.75);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(1.057);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(946.353);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                strOutput = String.valueOf(input);
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(3.943);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(64);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(192);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(4.804);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(3.331);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(33.307);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(53.291);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(159.873);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usLiquidPintToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(2113.376);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(59.844);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(28.875);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(2.113);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(473.176);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                strOutput = String.valueOf(input);
                break;
            case "US legal cup":
                bigConv = new BigDecimal(1.972);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(96);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(9.608);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(2.402);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(16.653);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(26.646);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(79.937);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usLegalCupToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(4166.667);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(117.987);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(14.646);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(4.167);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(240);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(15.773);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(3.943);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(1.972);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                strOutput = String.valueOf(input);
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(8.115);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(16.231);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(48.692);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(18.942);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(4.736);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(2.368);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(1.184);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(8.447);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(13.515);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(40.545);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usFluidOunceToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(33814.023);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(957.506);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(1.805);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(33.814);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(29.574);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(128);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(8.115);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                strOutput = String.valueOf(input);
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(6);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(153.722);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(38.43);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(19.215);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(9.608);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(1.041);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(4.996);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usTablespoonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(67628.045);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(1915.013);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(1.108);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(67.628);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(14.787);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(256);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(64);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(16.231);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                strOutput = String.valueOf(input);
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(3);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(307.443);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(76.861);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(38.43);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(19.215);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(1.922);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(2.496);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usTeaspoonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(202884.202);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(5745.041);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(3.325);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(202.884);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(4.929);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(768);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(192);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(96);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(48.692);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(6);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(3);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US teaspoon":
                strOutput = String.valueOf(input);
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(922.33);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(230.582);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(115.291);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(57.646);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(5.765);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(3.603);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void imperialGallonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(291.969);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(6.229);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(277.419);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(4.546);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(4546.09);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(4.804);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(9.608);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(18.942);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(153.722);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(307.443);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(922.33);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                strOutput = String.valueOf(input);
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(160);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(256);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(768);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialQuartToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(879.877);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(24.915);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(69.355);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(1.137);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(1136.522);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(3.331);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(2.402);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(4.736);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(38.43);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(76.861);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(230.582);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                strOutput = String.valueOf(input);
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(40);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(64);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(192);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialPintToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(1759.754);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(49.831);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(34.677);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(1.76);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(568.261);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(6.661);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(2.368);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(19.215);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(38.43);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(115.291);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                strOutput = String.valueOf(input);
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(20);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(96);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialCupToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(3519.508);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(99.661);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(17.339);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(3.52);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(284.131);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(13.323);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(3.331);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(1.184);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(9.608);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(19.215);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(57.646);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(4);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(2);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                strOutput = String.valueOf(input);
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(10);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(48);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialFluidOunceToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(35195.08);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(996.614);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(1.734);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(35.195);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(28.413);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(133.228);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(33.307);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(16.653);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(8.447);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(1.041);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(1.922);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(5.765);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(160);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(40);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(20);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(10);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                strOutput = String.valueOf(input);
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(1.6);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(4.8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialTablespoonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(56312.104);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(1594.581);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(1.084);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(56.312);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(17.758);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(213.165);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(53.291);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(26.646);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(13.515);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(1.665);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(3.603);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(256);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(64);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(32);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(1.6);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                strOutput = String.valueOf(input);
                break;
            case "Imperial teaspoon":
                bigConv = new BigDecimal(3);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void imperialTeaspoonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Cubic metre":
                bigConv = new BigDecimal(168936.313);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic foot":
                bigConv = new BigDecimal(4783.744);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Cubic inch":
                bigConv = new BigDecimal(2.768);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Litre":
                bigConv = new BigDecimal(168.936);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Millilitre":
                bigConv = new BigDecimal(5.919);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US liquid gallon":
                bigConv = new BigDecimal(639.494);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid quart":
                bigConv = new BigDecimal(159.873);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US liquid pint":
                bigConv = new BigDecimal(79.937);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US legal cup":
                bigConv = new BigDecimal(40.545);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US fluid ounce":
                bigConv = new BigDecimal(4.996);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US tablespoon":
                bigConv = new BigDecimal(2.498);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US teaspoon":
                bigConv = new BigDecimal(1.201);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial gallon":
                bigConv = new BigDecimal(768);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial quart":
                bigConv = new BigDecimal(192);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial pint":
                bigConv = new BigDecimal(96);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial cup":
                bigConv = new BigDecimal(48);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial fluid ounce":
                bigConv = new BigDecimal(4.8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial tablespoon":
                bigConv = new BigDecimal(3);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial teaspoon":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void secondToOther(double input, String outUnit) {
    }

    public void minuteToOther(double input, String outUnit) {
    }

    public void hourToOther(double input, String outUnit) {
    }

    public void dayToOther(double input, String outUnit) {
    }

    public void weekToOther(double input, String outUnit) {
    }

    public void monthToOther(double input, String outUnit) {
    }

    public void yearToOther(double input, String outUnit) {
    }

    public void jouleToOther(double input, String outUnit) {
    }

    public void kilojouleToOther(double input, String outUnit) {
    }

    public void gramCalorieToOther(double input, String outUnit) {
    }

    public void kilocalorieToOther(double input, String outUnit) {
    }

    public void wattHourToOther(double input, String outUnit) {
    }

    public void kilowattHourToOther(double input, String outUnit) {
    }

    public void electronvoltToOther(double input, String outUnit) {
    }

    public void britishThermalUnitToOther(double input, String outUnit) {
    }

    public void usThermToOther(double input, String outUnit) {
    }

    public void footPoundToOther(double input, String outUnit) {
    }

    public void atmosphereToOther(double input, String outUnit) {
    }

    public void barToOther(double input, String outUnit) {
    }

    public void pascalToOther(double input, String outUnit) {
    }

    public void poundForceToOther(double input, String outUnit) {
    }

    public void torrToOther(double input, String outUnit) {
    }

    public void mphToOther(double input, String outUnit) {
    }

    public void kphToOther(double input, String outUnit) {
    }

    public void mpsToOther(double input, String outUnit) {
    }

    public void fpsToOther(double input, String outUnit) {
    }

    public void knotToOther(double input, String outUnit) {
    }

    public void microgramToOther(double input, String outUnit) {
    }

    public void milligramToOther(double input, String outUnit) {
    }

    public void gramToOther(double input, String outUnit) {
    }

    public void kilogramToOther(double input, String outUnit) {
    }

    public void impTonToOther(double input, String outUnit) {
    }

    public void usTonToOther(double input, String outUnit) {
    }

    public void stoneToOther(double input, String outUnit) {
    }

    public void poundToOther(double input, String outUnit) {
    }

    public void ounceToOther(double input, String outUnit) {
    }

    public void hertzToOther(double input, String outUnit) {
    }

    public void kilohertzToOther(double input, String outUnit) {
    }

    public void megahertzToOther(double input, String outUnit) {
    }

    public void gigahertzToOther(double input, String outUnit) {
    }

    public void degreeToOther(double input, String outUnit) {
    }

    public void radianToOther(double input, String outUnit) {
    }

    public void milliradianToOther(double input, String outUnit) {
    }

    public void gradianToOther(double input, String outUnit) {
    }

    public void minuteOfArcToOther(double input, String outUnit) {
    }

    public void secondOfArcToOther(double input, String outUnit) {
    }

    public void usMpgToOther(double input, String outUnit) {
    }

    public void mpgToOther(double input, String outUnit) {
    }

    public void kplToOther(double input, String outUnit) {
    }

    public void litrePer100ToOther(double input, String outUnit) {
    }

    public void bitToOther(double input, String outUnit) {
    }

    public void kilobitToOther(double input, String outUnit) {
    }

    public void megabitToOther(double input, String outUnit) {
    }

    public void gigabitToOther(double input, String outUnit) {
    }

    public void terabitToOther(double input, String outUnit) {
    }

    public void petabitToOther(double input, String outUnit) {
    }

    public void byteToOther(double input, String outUnit) {
    }

    public void kilobyteToOther(double input, String outUnit) {
    }

    public void megabyteToOther(double input, String outUnit) {
    }

    public void gigabyteToOther(double input, String outUnit) {
    }

    public void terabyteToOther(double input, String outUnit) {
    }

    public void petabyteToOther(double input, String outUnit) {
    }

    public void bitPsToOther(double input, String outUnit) {
    }

    public void kilobitPsToOther(double input, String outUnit) {
    }

    public void kilobytePsToOther(double input, String outUnit) {
    }

    public void megabitPsToOther(double input, String outUnit) {
    }

    public void megabytePsToOther(double input, String outUnit) {
    }

    public void gigabitPsToOther(double input, String outUnit) {
    }

    public void gigabytePsToOther(double input, String outUnit) {
    }

    public void terabitPsToOther(double input, String outUnit) {
    }

    public void terabytePsToOther(double input, String outUnit) {
    }

}
