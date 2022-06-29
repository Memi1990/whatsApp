package com.example.whatsapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.chat

class chatAdapter {
    class chatAdapter(private val chatlist:List<chat>) : RecyclerView.Adapter<chatViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            return chatViewHolder(layoutInflater.inflate(R.layout.item_chat, parent, false))
        }

        override fun onBindViewHolder(holder: chatViewHolder, position: Int) {
            val item = chatlist[position]
            holder.render(item)
        }

        override fun getItemCount(): Int = chatlist.size
    }
}