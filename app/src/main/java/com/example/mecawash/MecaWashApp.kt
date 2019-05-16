package com.example.mecawash

import com.androidnetworking.AndroidNetworking
import com.orm.SugarApp

class MecaWashApp : SugarApp(){
    override fun onCreate(){
        super.onCreate()
        AndroidNetworking.initialize(getApplicationContext())
    }
}