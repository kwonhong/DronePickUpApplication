package com.example.james.parrot.app;

import android.app.Application;

import com.example.james.parrot.modules.AppModule;


public class ParrotApplication extends Application {
    private ParrotComponent parrotComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Building the dependency graph with Dagger 2.
        this.parrotComponent= DaggerParrotComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public ParrotComponent getComponent() {
        return parrotComponent;
    }
}
