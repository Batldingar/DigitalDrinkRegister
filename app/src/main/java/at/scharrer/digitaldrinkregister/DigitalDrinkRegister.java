package at.scharrer.digitaldrinkregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DigitalDrinkRegister extends AppCompatActivity {

    private static final String TAG = "[DigitalDrinkRegister]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Log.d(TAG, "Hello world!");
    }
}
