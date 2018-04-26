package com.example.piusa.tayopius;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by piusa on 4/23/2018.
 */

public class TayoPius extends Application{
    @Override
    public void onCreate(){
        super.onCreate();

        if (FirebaseApp.getApps(this).isEmpty()){

            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
