package com.example.firsttask.ui.activities.main

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.model.entity.ItemNote
import kotlinx.android.synthetic.main.item_layout.view.*



class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val headingTextView: TextView = itemView.findViewById(R.id.text_view_heading)
    private val contextTextView: TextView = itemView.findViewById(R.id.text_View_context)


    fun bindUI(item: ItemNote){

        headingTextView.text = item.Heading
        contextTextView.text = item.Context

    }


}



