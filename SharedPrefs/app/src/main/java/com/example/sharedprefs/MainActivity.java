package com.example.sharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPrefs.init(getContext);
        SharedPrefs.write("isLoggedIn",false);
        SharedPrefs.write("numberOfUsage",0);
        SharedPrefs.readMap("isLoggedIn",false);
        SharedPrefs.remove("numberOfUsage");

        /* ToPrint SharedPrefs XML file path */
        File f = getDatabasePath("sharedPrefsName");
        if (f != null)   Log.i("OsOs", f.getAbsolutePath());
    }
}
