package azisstudio.myapplication.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    //deklarasi
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //cara pertama
        btnLogin = findViewById(R.id.btn_login)

        //ketika tombol diklik
        btnLogin.setOnClickListener {

            //kita mau ngpain
            //munculkan notif
//            Toast.makeText( this, "Tombol telah di klik",Toast.LENGTH_SHORT).show()

            val linkToHome = Intent(this,HomeActivity::class.java)
            startActivity(linkToHome)
        }
    }
}
