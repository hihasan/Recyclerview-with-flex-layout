package com.hihasan.flex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.hihasan.flex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    var dataModel: ArrayList<DataModel> = ArrayList()
    lateinit var dataAdapter: DataAdapter

    var dataModels = arrayListOf(
        DataModel("Tv Shows"),
        DataModel("fridge"),
        DataModel("Sony"),
        DataModel("Samsung Tv"),
        DataModel("Lorem Ipsum this a test"),
        DataModel("Coca Cola"),
        DataModel("Pepsi"),
        DataModel("7-up")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        initViews()


    }

    private fun initViews() {

        val linearLayoutManager = FlexboxLayoutManager(applicationContext)
        linearLayoutManager.flexDirection = FlexDirection.ROW
        dataAdapter = DataAdapter(dataModels, applicationContext)

        binding.content.dataRv.apply {
            layoutManager = linearLayoutManager
            adapter = dataAdapter
        }
    }

}