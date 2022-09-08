package com.example.mrpotato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setEye(v: View){
        var check = findViewById<CheckBox>(R.id.eyes)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView6)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView6)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setNose(v: View){
        var check = findViewById<CheckBox>(R.id.nose)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView8)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView8)
            image.setVisibility(View.INVISIBLE)
        }

    }

    fun setMouth(v: View){
        var check = findViewById<CheckBox>(R.id.mouth)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView10)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView10)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setEyebrow(v: View){
        var check = findViewById<CheckBox>(R.id.eyebrow)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView9)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView9)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setHnads(v: View){
        var check = findViewById<CheckBox>(R.id.hands)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView3)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView3)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setGlasses(v: View){
        var check = findViewById<CheckBox>(R.id.glasses)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView7)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView7)
            image.setVisibility(View.INVISIBLE)
        }

    }



    fun setMosh(v: View){
        var check = findViewById<CheckBox>(R.id.mosh)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView11)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView11)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setshoe(v: View){
        var check = findViewById<CheckBox>(R.id.Shoe)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView2)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView2)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setHat(v: View){
        var check = findViewById<CheckBox>(R.id.hat)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView5)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView5)
            image.setVisibility(View.INVISIBLE)
        }

    }


    fun setEar(v: View){
        var check = findViewById<CheckBox>(R.id.ear)
        if(check.isChecked){
            var image = findViewById<ImageView>(R.id.imageView4)
            image.visibility = View.VISIBLE
        }
        else{
            var image = findViewById<ImageView>(R.id.imageView4)
            image.setVisibility(View.INVISIBLE)
        }

    }




}