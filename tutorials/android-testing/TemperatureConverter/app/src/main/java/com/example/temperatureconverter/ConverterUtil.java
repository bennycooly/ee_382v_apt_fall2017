package com.example.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class ConverterUtil extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        EditText text = (EditText) findViewById(R.id.tempResult);

        String scale = getIntent().getStringExtra("scale");
        float temp = getIntent().getFloatExtra("temperature", 0);

        float result = 0;
        if (scale.equals("celsius")) {
            result = convertCelsiusToFahrenheit(temp);
            text.setText(String.valueOf(result) + " fahrenheit");
        }

        else if (scale.equals("fahrenheit")) {
            result = convertFahrenheitToCelsius(temp);
            text.setText(String.valueOf(result) + " celsius");
        }




    }
    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
