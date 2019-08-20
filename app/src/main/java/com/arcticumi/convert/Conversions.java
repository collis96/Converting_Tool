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
    private String integer;

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
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                strOutput = String.valueOf(input);
                break;
            case "Minute":
                bigConv = new BigDecimal(60);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Hour":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Day":
                bigConv = new BigDecimal(86400);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Week":
                bigConv = new BigDecimal(604800);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Month":
                bigConv = new BigDecimal(2628000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Year":
                bigConv = new BigDecimal(31540000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void minuteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(60);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                strOutput = String.valueOf(input);
                break;
            case "Hour":
                bigConv = new BigDecimal(60);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Day":
                bigConv = new BigDecimal(1440);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Week":
                bigConv = new BigDecimal(10080);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Month":
                bigConv = new BigDecimal(43800.048);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Year":
                bigConv = new BigDecimal(525600);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void hourToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                bigConv = new BigDecimal(60);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Hour":
                strOutput = String.valueOf(input);
                break;
            case "Day":
                bigConv = new BigDecimal(24);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Week":
                bigConv = new BigDecimal(168);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Month":
                bigConv = new BigDecimal(730.001);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Year":
                bigConv = new BigDecimal(8760);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void dayToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(86400);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                bigConv = new BigDecimal(1440);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Hour":
                bigConv = new BigDecimal(24);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Day":
                strOutput = String.valueOf(input);
                break;
            case "Week":
                bigConv = new BigDecimal(7);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Month":
                bigConv = new BigDecimal(30.417);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Year":
                bigConv = new BigDecimal(365);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void weekToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(604800);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                bigConv = new BigDecimal(10080);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Hour":
                bigConv = new BigDecimal(168);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Day":
                bigConv = new BigDecimal(7);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Week":
                strOutput = String.valueOf(input);
                break;
            case "Month":
                bigConv = new BigDecimal(4.345);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Year":
                bigConv = new BigDecimal(52.143);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void monthToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(2628000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                bigConv = new BigDecimal(43800.048);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Hour":
                bigConv = new BigDecimal(730.001);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Day":
                bigConv = new BigDecimal(30.417);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Week":
                bigConv = new BigDecimal(4.345);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Month":
                strOutput = String.valueOf(input);
                break;
            case "Year":
                bigConv = new BigDecimal(12);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void yearToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Second":
                bigConv = new BigDecimal(31540000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Minute":
                bigConv = new BigDecimal(525600);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Hour":
                bigConv = new BigDecimal(8760);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Day":
                bigConv = new BigDecimal(365);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Week":
                bigConv = new BigDecimal(52.143);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Month":
                bigConv = new BigDecimal(12);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Year":
                break;
        }
    }

    public void jouleToOther(double input, String outUnit) {
        String inputtest = String.valueOf(input);
        bigInput = new BigDecimal(inputtest);
        switch (outUnit) {
            case "Joule":
                strOutput = String.valueOf(input);
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(4.184);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(4184);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(3600000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "6242000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(1055.056);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(105500000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(1.356);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kilojouleToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                strOutput = String.valueOf(input);
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(239.006);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(4.184);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(3.6);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "6242000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(1.055);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(105480.4);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(737.562);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void gramCalorieToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(4.184);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(239.006);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gram calorie":
                strOutput = String.valueOf(input);
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(860.421);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(860420.65);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "26110000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(252.164);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(25210000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(3.086);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void kilocalorieToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(4184);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(4.184);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                strOutput = String.valueOf(input);
                break;
            case "Watt hour":
                bigConv = new BigDecimal(1.162);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(860.421);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "26110000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(3.966);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(25210.421);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(3085.96);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void wattHourToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(3.6);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(860.421);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(1.162);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                strOutput = String.valueOf(input);
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "22470000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(3.412);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(29300.111);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(2655.224);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void kilowattHourToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(3600000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(3600);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(860420.65);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(860.421);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilowatt hour":
                strOutput = String.valueOf(input);
                break;
            case "Electronvolt":
                String conv = "22470000000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(3412.142);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(29.3);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(2655000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void electronvoltToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        String conv;
        switch (outUnit) {
            case "Joule":
                conv = "6242000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilojoule":
                conv = "6242000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gram calorie":
                conv = "26110000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilocalorie":
                conv = "26110000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                conv = "22470000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                conv = "22470000000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                strOutput = String.valueOf(input);
                break;
            case "British thermal unit":
                conv = "6585000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US therm":
                conv = "658400000000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                conv = "8462000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void britishThermalUnitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(1055.056);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(1.055);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(252.164);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(3.966);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(3.412);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(3412.142);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "6585000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                strOutput = String.valueOf(input);
                break;
            case "US therm":
                bigConv = new BigDecimal(99976.129);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(778.169);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usThermToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(105500000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(105480.4);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(25210000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(25210.421);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(29300.111);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(29.3);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Electronvolt":
                String conv = "658400000000000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(99976.129);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "US therm":
                strOutput = String.valueOf(input);
                break;
            case "Foot-pound":
                bigConv = new BigDecimal(77800000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void footPoundToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Joule":
                bigConv = new BigDecimal(1.356);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilojoule":
                bigConv = new BigDecimal(737.562);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gram calorie":
                bigConv = new BigDecimal(3.086);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilocalorie":
                bigConv = new BigDecimal(3085.96);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Watt hour":
                bigConv = new BigDecimal(2655.224);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilowatt hour":
                bigConv = new BigDecimal(2655000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Electronvolt":
                String conv = "8462000000000000000";
                bigConv = new BigDecimal(conv);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "British thermal unit":
                bigConv = new BigDecimal(778.169);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US therm":
                bigConv = new BigDecimal(77800000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot-pound":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void atmosphereToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Atmosphere":
                strOutput = String.valueOf(input);
                break;
            case "Bar":
                bigConv = new BigDecimal(1.013);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pascal":
                bigConv = new BigDecimal(101325);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound-force per square inch":
                bigConv = new BigDecimal(14.696);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Torr":
                bigConv = new BigDecimal(760);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void barToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Atmosphere":
                bigConv = new BigDecimal(1.013);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Bar":
                strOutput = String.valueOf(input);
                break;
            case "Pascal":
                bigConv = new BigDecimal(100000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound-force per square inch":
                bigConv = new BigDecimal(14.504);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Torr":
                bigConv = new BigDecimal(750.062);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void pascalToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Atmosphere":
                bigConv = new BigDecimal(101325);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Bar":
                bigConv = new BigDecimal(100000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pascal":
                strOutput = String.valueOf(input);
                break;
            case "Pound-force per square inch":
                bigConv = new BigDecimal(6894.757);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Torr":
                bigConv = new BigDecimal(133.322);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void poundForceToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Atmosphere":
                bigConv = new BigDecimal(14.696);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Bar":
                bigConv = new BigDecimal(14.504);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pascal":
                bigConv = new BigDecimal(6894.757);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound-force per square inch":
                strOutput = String.valueOf(input);
                break;
            case "Torr":
                bigConv = new BigDecimal(51.715);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void torrToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Atmosphere":
                bigConv = new BigDecimal(760);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Bar":
                bigConv = new BigDecimal(750.062);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pascal":
                bigConv = new BigDecimal(133.322);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound-force per square inch":
                bigConv = new BigDecimal(51.715);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Torr":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void mphToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Miles per hour":
                strOutput = String.valueOf(input);
                break;
            case "Kilometre per hour":
                bigConv = new BigDecimal(1.609);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Metre per second":
                bigConv = new BigDecimal(2.237);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot per second":
                bigConv = new BigDecimal(1.467);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Knot":
                bigConv = new BigDecimal(1.151);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kphToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Miles per hour":
                bigConv = new BigDecimal(1.609);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilometre per hour":
                strOutput = String.valueOf(input);
                break;
            case "Metre per second":
                bigConv = new BigDecimal(3.6);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot per second":
                bigConv = new BigDecimal(1.097);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Knot":
                bigConv = new BigDecimal(1.852);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void mpsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Miles per hour":
                bigConv = new BigDecimal(2.237);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilometre per hour":
                bigConv = new BigDecimal(3.6);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Metre per second":
                strOutput = String.valueOf(input);
                break;
            case "Foot per second":
                bigConv = new BigDecimal(3.281);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Knot":
                bigConv = new BigDecimal(1.944);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void fpsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Miles per hour":
                bigConv = new BigDecimal(1.467);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilometre per hour":
                bigConv = new BigDecimal(1.097);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Metre per second":
                bigConv = new BigDecimal(3.281);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot per second":
                strOutput = String.valueOf(input);
                break;
            case "Knot":
                bigConv = new BigDecimal(1.688);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void knotToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Miles per hour":
                bigConv = new BigDecimal(1.151);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilometre per hour":
                bigConv = new BigDecimal(1.852);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Metre per second":
                bigConv = new BigDecimal(1.944);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Foot per second":
                bigConv = new BigDecimal(1.688);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Knot":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void microgramToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                strOutput = String.valueOf(input);
                break;
            case "Milligram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Tonne":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                integer = "1016000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                integer = "907200000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                integer = "6350000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                integer = "453600000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Ounce":
                integer = "28350000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void milligramToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                strOutput = String.valueOf(input);
                break;
            case "Gram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(1016000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(907200000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(6350000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(453592.37);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(28349.523);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void gramToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                strOutput = String.valueOf(input);
                break;
            case "Kilogram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(1016000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(907184.74);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(6350.293);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(453.592);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(28.35);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kilogramToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                strOutput = String.valueOf(input);
                break;
            case "Tonne":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(1016.047);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(907.185);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(6.35);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(2.205);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(35.274);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void tonneToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Tonne":
                strOutput = String.valueOf(input);
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(1.016);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(1.102);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(157.473);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(2204.623);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(35273.962);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void impTonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                integer = "1016000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(1016000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(1016000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(1016.047);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(1.016);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Imperial ton":
                strOutput = String.valueOf(input);
                break;
            case "US ton":
                bigConv = new BigDecimal(1.12);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(160);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(2240);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(35840);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void usTonToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                integer = "907200000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(907200000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(907184.74);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(907.185);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(1.102);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(1.12);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                strOutput = String.valueOf(input);
                break;
            case "Stone":
                bigConv = new BigDecimal(142.857);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(2000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(32000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void stoneToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                integer = "6350000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(6350000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(6350.293);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(6.35);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(157.473);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(160);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(142.857);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                strOutput = String.valueOf(input);
                break;
            case "Pound":
                bigConv = new BigDecimal(14);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Ounce":
                bigConv = new BigDecimal(224);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void poundToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                bigConv = new BigDecimal(453600000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(453592.37);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(453.592);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(2.205);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(2204.623);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(2240);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(2000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(14);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                strOutput = String.valueOf(input);
                break;
            case "Ounce":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
        }
    }

    public void ounceToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Microgram":
                bigConv = new BigDecimal(28350000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Milligram":
                bigConv = new BigDecimal(28349.523);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gram":
                bigConv = new BigDecimal(28.35);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilogram":
                bigConv = new BigDecimal(35.274);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Tonne":
                bigConv = new BigDecimal(35273.962);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Imperial ton":
                bigConv = new BigDecimal(35840);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "US ton":
                bigConv = new BigDecimal(32000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Stone":
                bigConv = new BigDecimal(224);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Pound":
                bigConv = new BigDecimal(16);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Ounce":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void hertzToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Hertz":
                strOutput = String.valueOf(input);
                break;
            case "Kilohertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megahertz":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigahertz":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kilohertzToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Hertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilohertz":
                strOutput = String.valueOf(input);
                break;
            case "Megahertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigahertz":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void megahertzToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Hertz":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilohertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megahertz":
                strOutput = String.valueOf(input);
                break;
            case "Gigahertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void gigahertzToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Hertz":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilohertz":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megahertz":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigahertz":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void degreeToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                strOutput = String.valueOf(input);
                break;
            case "Radian":
                break;
            case "Milliradian":
                break;
            case "Gradian":
                break;
            case "Minute of arc":
                break;
            case "Second of arc":
                break;
        }
    }

    public void radianToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                break;
            case "Radian":
                strOutput = String.valueOf(input);
                break;
            case "Milliradian":
                break;
            case "Gradian":
                break;
            case "Minute of arc":
                break;
            case "Second of arc":
                break;
        }
    }

    public void milliradianToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                break;
            case "Radian":
                break;
            case "Milliradian":
                strOutput = String.valueOf(input);
                break;
            case "Gradian":
                break;
            case "Minute of arc":
                break;
            case "Second of arc":
                break;
        }
    }

    public void gradianToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                break;
            case "Radian":
                break;
            case "Milliradian":
                break;
            case "Gradian":
                strOutput = String.valueOf(input);
                break;
            case "Minute of arc":
                break;
            case "Second of arc":
                break;
        }
    }

    public void minuteOfArcToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                break;
            case "Radian":
                break;
            case "Milliradian":
                break;
            case "Gradian":
                break;
            case "Minute of arc":
                strOutput = String.valueOf(input);
                break;
            case "Second of arc":
                break;
        }
    }

    public void secondOfArcToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Degree":
                break;
            case "Radian":
                break;
            case "Milliradian":
                break;
            case "Gradian":
                break;
            case "Minute of arc":
                break;
            case "Second of arc":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void usMpgToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "US Miles per gallon":
                strOutput = String.valueOf(input);
                break;
            case "Miles per gallon":
                break;
            case "Kilometre per litre":
                break;
            case "Litre per 100 kilometres":
                break;
        }
    }

    public void mpgToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "US Miles per gallon":
                break;
            case "Miles per gallon":
                strOutput = String.valueOf(input);
                break;
            case "Kilometre per litre":
                break;
            case "Litre per 100 kilometres":
                break;
        }
    }

    public void kplToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "US Miles per gallon":
                break;
            case "Miles per gallon":
                break;
            case "Kilometre per litre":
                strOutput = String.valueOf(input);
                break;
            case "Litre per 100 kilometres":
                break;
        }
    }

    public void litrePer100ToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "US Miles per gallon":
                break;
            case "Miles per gallon":
                break;
            case "Kilometre per litre":
                break;
            case "Litre per 100 kilometres":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void bitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                strOutput = String.valueOf(input);
                break;
            case "Kilobit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                integer = "1000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabyte":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                integer = "8000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                integer = "8000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kilobitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                strOutput = String.valueOf(input);
                break;
            case "Megabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                integer = "8000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void megabitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                strOutput = String.valueOf(input);
                break;
            case "Gigabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void gigabitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                strOutput = String.valueOf(input);
                break;
            case "Terabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                integer = "125000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void terabitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                integer = "1000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabit":
                strOutput = String.valueOf(input);
                break;
            case "Petabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                integer = "125000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                integer = "125000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void petabitToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                integer = "1000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                integer = "1000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Petabit":
                strOutput = String.valueOf(input);
                break;
            case "Byte":
                integer = "125000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                integer = "125000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                integer = "125000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Petabyte":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void byteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(125000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                integer = "125000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                integer = "125000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                strOutput = String.valueOf(input);
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                integer = "1000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void kilobyteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(125000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                integer = "125000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                strOutput = String.valueOf(input);
                break;
            case "Megabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void megabyteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(125000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                strOutput = String.valueOf(input);
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void gigabyteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(125000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                bigConv = new BigDecimal(1000000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                strOutput = String.valueOf(input);
                break;
            case "Terabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Petabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void terabyteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                integer = "8000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(125);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
            case "Byte":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                integer = "1000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabyte":
                strOutput = String.valueOf(input);
                break;
            case "Petabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.divide(bigConv, 2, RoundingMode.HALF_UP).toString();
                break;
        }
    }

    public void petabyteToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                integer = "8000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobit":
                integer = "8000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabit":
                integer = "8000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabit":
                bigConv = new BigDecimal(8000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabit":
                bigConv = new BigDecimal(8000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Petabit":
                bigConv = new BigDecimal(8);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Byte":
                integer = "1000000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Kilobyte":
                integer = "1000000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Megabyte":
                integer = "1000000000";
                bigConv = new BigDecimal(integer);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Gigabyte":
                bigConv = new BigDecimal(1000000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Terabyte":
                bigConv = new BigDecimal(1000);
                strOutput = bigInput.multiply(bigConv).toString();
                break;
            case "Petabyte":
                strOutput = String.valueOf(input);
                break;
        }
    }

    public void bitPsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                strOutput = String.valueOf(input);
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void kilobitPsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                strOutput = String.valueOf(input);
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void kilobytePsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                strOutput = String.valueOf(input);
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void megabitPsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                strOutput = String.valueOf(input);
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void megabytePsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                strOutput = String.valueOf(input);
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void gigabitPsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                strOutput = String.valueOf(input);
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void gigabytePsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                strOutput = String.valueOf(input);
                break;
            case "Terabit":
                break;
            case "Terabyte":
                break;
        }
    }

    public void terabitPsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                strOutput = String.valueOf(input);
                break;
            case "Terabyte":
                break;
        }
    }

    public void terabytePsToOther(double input, String outUnit) {
        bigInput = new BigDecimal(input);
        switch (outUnit) {
            case "Bit":
                break;
            case "Kilobit":
                break;
            case "Kilobyte":
                break;
            case "Megabit":
                break;
            case "Megabyte":
                break;
            case "Gigabit":
                break;
            case "Gigabyte":
                break;
            case "Terabit":
                break;
            case "Terabyte":
                strOutput = String.valueOf(input);
                break;
        }
    }

}
