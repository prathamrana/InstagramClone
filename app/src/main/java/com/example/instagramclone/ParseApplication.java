package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7fy7GeKAZZJ10JbmuzEKuE80fuJCWdMPSbFAjvjc")
                .clientKey("YqiVIXR1iwIqZEC6IG6COk1xLLcedmHRAFNew9Bl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
