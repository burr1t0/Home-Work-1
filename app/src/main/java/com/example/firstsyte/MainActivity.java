package com.example.firstsyte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int cash = 312;

    private int coat = 70;
    private int coatDiscount = 23;

    private int hat = 25;
    private int hatDiscount = 63;

    private int suit = 53;
    private int suitDiscount = 56;

    private int shirt = 19;

    private int shoes = 41;
    private int shoesDiscount = 68;

    public boolean canBuy() {
        float result;

        result = (coat * coatDiscount + hat * hatDiscount +
                suit * suitDiscount + shirt +
                shoes * shoesDiscount) / 100;
        result = cash - result;
        if (result < 0) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

       boolean flag = canBuy();
        if (flag == true) {
            txt.setText("я могу это купить!");
        } else {
            txt.setText("надо добавить, тебе не хватает!");
        }
    }
}