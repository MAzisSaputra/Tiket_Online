package azisstudio.myapplication.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kita buat object handle yang delay
        val handler = Handler()

        //kita aktifkan fundelay
        handler.postDelayed(Runnable {
            //intent di aktifkan
            val intent = Intent(this,LoginActivity::class.java)
            //aktifkan Intent
            startActivity(intent)
        }, 5000)
    }

}
