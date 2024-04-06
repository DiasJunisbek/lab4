package com.example.wineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.wineshop.databinding.ActivityMainBinding
import com.example.wineshop.model.UserModel
import com.example.wineshop.typswine.WineAdapter

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: WineAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        MAIN = this
    }


    private fun initial(){
        recyclerView = binding.recyclerview
        adapter = WineAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myWine())

    }

    fun myWine(): ArrayList<UserModel>{
        val wineList = ArrayList<UserModel>()

        val wine = UserModel("White","Gruzia")
        wineList.add(wine)

        val wine1 = UserModel("Red","France")
        wineList.add(wine1)

        val wine2 = UserModel("White","Germany")
        wineList.add(wine2)

        val wine3 = UserModel("Red","Spain")
        wineList.add(wine3)

        val wine4 = UserModel("White","Turkey")
        wineList.add(wine4)

        return wineList
    }
}