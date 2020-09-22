package com.example.firsttask.ui.activities.main

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.model.entity.ItemNote

class ExampleAdapter : RecyclerView.Adapter<NoteViewHolder>(){

    private var givenListOfNotes : List<ItemNote> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val rootView : View = inflater.inflate(R.layout.item_layout, parent, false)
        return NoteViewHolder(rootView)

    }

    override fun getItemCount(): Int {

        return givenListOfNotes.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bindUI(givenListOfNotes[position])

    }

    fun submitList(notes : List<ItemNote>){
        this.givenListOfNotes = notes

    }


}