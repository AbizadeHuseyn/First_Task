package com.example.firsttask.ui.activities.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.database.FakeDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExampleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeUI()
        configureRecyclerView()



    }

    private fun initializeUI(){
         recyclerView  = findViewById(R.id.recycler_view)
    }


    fun configureRecyclerView(){
        adapter = ExampleAdapter()

        recyclerView.adapter =adapter
        adapter.submitList(FakeDatabase.returnListOfNotes())


    }
}

