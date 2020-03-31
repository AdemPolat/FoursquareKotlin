package com.example.foursquarekotlin

import android.app.Application
import com.parse.Parse

class StarterApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("ec6TqXj98KPJBDp5Rg3UlSoeRmQ33ylddquRDNuP")
            .clientKey("4e70TfJgpQ73Wbef3ANVJfHHjLK6YBCkF6AeL1Bn")
            .server("https://parseapi.back4app.com/")
            .build())
    }



}