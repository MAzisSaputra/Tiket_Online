package azisstudio.myapplication.com

import android.util.Log

class Manusia : Adam(){

    public var nama = ""
    private var jeniskelamin = ""

    fun salam():String{
        return "Selamat Pagi"
    }
    fun berbicara(ucapan :String):String{
        return ucapan
    }
    fun memendamRasa():Unit{
        Log.d("info", "kagum")
    }
}