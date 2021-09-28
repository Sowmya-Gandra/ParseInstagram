package com.codepath.parseinstagram;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3xQ7EJtlw7PuoSCzKOCCgc4yFinRlLAaRCEMwwx9")
                .clientKey("v9kzTIJ1cSDAH7gqUOyLihY7hMbFInvCNQ5ekGoK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
