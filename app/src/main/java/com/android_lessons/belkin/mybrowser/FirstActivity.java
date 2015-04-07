package com.android_lessons.belkin.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Belkin on 07.04.2015.
 */
public class FirstActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void toBrowserButtonOnClick(View view) {
        Intent intent = new Intent("ru.alexanderklimov.Browser");
        intent.setData(Uri.parse("http://developer.alexanderklimov.ru/android/"));
        startActivity(intent);
    }
}
