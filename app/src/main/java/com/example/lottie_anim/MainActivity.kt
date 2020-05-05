package com.example.lottie_anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lottie2.setAnimation("login2.json")// set the file to animation view
       lottie2.playAnimation()// to play animation //same as autoplay as we add in XMl animation
       lottie2.loop(true)// set the loop is true mean that animation play in a loop


    }
}
