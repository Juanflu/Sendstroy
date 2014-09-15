package me.juanflores.sendstroy;

import android.app.Application;

import com.parse.Parse;

public class SendstroyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "sYjPZg9OIK7nd4RRivdkuFdRPWHfHjgB92E6237e", "LHHCGYJNHJhwnH4kTeaPjmTghqX7X6zSkafQycMX");

    }
}
