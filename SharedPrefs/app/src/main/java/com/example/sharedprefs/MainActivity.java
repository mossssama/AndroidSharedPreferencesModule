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

        SharedPrefs sharedPrefs =new SharedPrefs(getApplicationContext(),"sharedPrefsName");
        sharedPrefs.write("isLoggedIn",false);
        sharedPrefs.write("numberOfUsage",0);
        sharedPrefs.readMap("isLoggedIn",false);

        /* ToPrint SharedPrefs XML file path */
        File f = getDatabasePath("sharedPrefsName");
        if (f != null)   Log.i("OsOs", f.getAbsolutePath());
    }
}