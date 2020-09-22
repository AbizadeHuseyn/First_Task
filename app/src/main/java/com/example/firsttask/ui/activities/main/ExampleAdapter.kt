package com.example.firsttask.ui.activities.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.model.entity.ItemNote

// You should build your adapter class with ListAdapter and DiffCallback
class ExampleAdapter : RecyclerView.Adapter<NoteViewHolder>() {

    private val givenListOfNotes = mutableListOf<ItemNote>() // val

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val rootView: View = inflater.inflate(R.layout.item_layout, parent, false)
        return NoteViewHolder(rootView)
    }

    override fun getItemCount(): Int = givenListOfNotes.size // directly return style

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bindUI(givenListOfNotes[position])
    }

    fun submitList(notes: List<ItemNote>) {
        /*
            In this method we SHOULD DO this:
                this.givenListOfNotes.clear()
                this.givenListOfNotes.addAll(notes)

            NOT this:
                this.givenListOfNotes = notes
        */
        this.givenListOfNotes.clear()
        this.givenListOfNotes.addAll(notes)
        /*
            A little pro tip. DON'T code like this:
                this.givenListOfNotes.clear()
                this.givenListOfNotes.addAll(notes)

            DO this (Search about Kotlin higher order functions) :
                with(givenListOfNotes) {
                    clear()
                    addAll(notes)
                }
         */
    }

}