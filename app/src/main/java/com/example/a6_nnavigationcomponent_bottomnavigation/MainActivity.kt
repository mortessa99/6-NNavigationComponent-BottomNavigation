package com.example.a6_nnavigationcomponent_bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a6_nnavigationcomponent_bottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    //نمایش و کنترل فرگمنت
    private lateinit var navController: NavController
    //

    //برای ایجاد دسترسی ها به appbar متل نام و عنوان و.
    private lateinit var appBarConfiguration:AppBarConfiguration
    //


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            //نمایش و کنترل فرگمنت
            navController = findNavController(R.id.navHost)
            //


            //برای ایجاد دسترسی ها به appbar متل نام و عنوان و.
            appBarConfiguration= AppBarConfiguration(setOf(R.id.addFragment,R.id.favoriteFragment,R.id.mainFragment,R.id.profileFragment,R.id.searchFragment))
            setupActionBarWithNavController(navController,appBarConfiguration)
            //


            //چسباندن  bottom navigation  به فرگمنت ها
            bottomNavigation.setupWithNavController(navController)



        }
    }


    //برای هندل کردن back در فرگمنت ها
    override fun onNavigateUp(): Boolean {
        return navController.navigateUp() || super.onNavigateUp()
    }
    //
}

