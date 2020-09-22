package com.example.firsttask.ui.activities.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firsttask.R
import com.example.firsttask.database.FakeDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = ExampleAdapter() // in Kotlin we can declare objects simple kind of classes in one line

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureRecyclerView()
    }

    private fun configureRecyclerView() { // this kind of methods should be private
        recycler_view.adapter = adapter // in this line, recycler_view is the id of RecyclerView in activity_main.xml. You can call it directly from kotlin file
        adapter.submitList(FakeDatabase.returnListOfNotes())
    }

}

