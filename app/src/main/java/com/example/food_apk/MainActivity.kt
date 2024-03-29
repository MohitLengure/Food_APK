package com.example.food_apk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.food_apk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())


        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.bottom_home -> replaceFragment(Home())
                R.id.bottom_order -> replaceFragment(Order())
                R.id.bottom_offer -> replaceFragment(Offer())
                R.id.bottom_favorites -> replaceFragment(Favourite())
                R.id.bottom_cart -> replaceFragment(Cart())

                else -> {

                }


            }
            true
        }

       }



    private fun replaceFragment(fragment: Fragment)
    {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction =fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }

}