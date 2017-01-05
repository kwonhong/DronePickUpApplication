package com.example.james.parrot.app;

import com.example.james.parrot.MainActivity;
import com.example.james.parrot.modules.AppModule;
import com.example.james.parrot.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface ParrotComponent {
    void inject(MainActivity activity);

}
