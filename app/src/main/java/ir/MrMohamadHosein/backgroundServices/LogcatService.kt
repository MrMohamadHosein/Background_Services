package ir.MrMohamadHosein.backgroundServices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class LogcatService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // doYourJob()
        return START_STICKY
    }
    override fun onCreate() {
        super.onCreate()
    }
    override fun onDestroy() {
        super.onDestroy()
    }
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    private fun doYourJob() {

        for (i in 0..1000000) {
            Log.v("testMyService" , "number $i")
        }

    }

}