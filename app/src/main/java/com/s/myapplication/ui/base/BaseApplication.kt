package com.s.myapplication.ui.base

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.s.myapplication.di.component.ApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import net.gotev.uploadservice.UploadServiceConfig

abstract class BaseApplication : DaggerApplication() {

  /*  val CHANNEL = "SanketDocSign"
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
       // FontHelper.getInstance(getApplicationContext()).overrideFont()
   }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       *//*val component: ApplicationComponent = DaggerApplicationComponent.builder().application(this).build()
        component.inject(this)
        return component*//*
        */

    }


    private fun createNotificationChannel() {
       /* if (Build.VERSION.SDK_INT >= 26) {
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val channel = NotificationChannel(CHANNEL,
                "SanketDoc Sign Upload",
                NotificationManager.IMPORTANCE_LOW
            )
            notificationManager.createNotificationChannel(channel)
        }
    }*/
}