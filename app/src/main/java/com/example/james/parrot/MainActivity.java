package com.example.james.parrot;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.james.parrot.app.ParrotApplication;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Resources resources; // Reference get injected.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Injecting dependencies with Dagger 2.
        ((ParrotApplication) getApplication()).getComponent().inject(this);
    }
}
