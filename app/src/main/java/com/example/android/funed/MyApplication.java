package com.example.android.funed;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;
/**
 * Created by Jenna on 6/24/2017.
 */

public class MyApplication extends Application {

    Realm realm;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .schemaVersion(1)
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

        realm = Realm.getDefaultInstance();


    }


}
