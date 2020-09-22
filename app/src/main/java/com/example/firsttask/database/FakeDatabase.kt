package com.example.firsttask.database

import com.example.firsttask.model.entity.ItemNote

object FakeDatabase {

    fun returnListOfNotes(): List<ItemNote> {
        val listOfNotes = mutableListOf<ItemNote>()
        for (i in 0..10) {
            val itemNote = ItemNote(Heading = "Heading $i", Context = "Context $i")
            listOfNotes.add(itemNote)
        }
        return listOfNotes
    }

}