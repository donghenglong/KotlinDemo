package com.p.kotlinwanandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n  = 5
        var message = "n = $n"
        Log.e("kt",message)
        var b:String? = null
        var len = b?.length
        Log.e("kt","b length = $len")
       // Log.e("kt","b length = $len")
    }
}
