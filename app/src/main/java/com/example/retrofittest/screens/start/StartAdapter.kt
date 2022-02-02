package com.example.retrofittest.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittest.R
import com.example.retrofittest.model.cash.CashModelItem

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<CashModelItem>()

    inner class StartViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.item_name).text = listStart[position].ccy
        holder.itemView.findViewById<TextView>(R.id.item_buy).text = listStart[position].buy
        holder.itemView.findViewById<TextView>(R.id.item_sale).text = listStart[position].sale

    }

    override fun getItemCount(): Int = listStart.size


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<CashModelItem>){
        listStart= list
        notifyDataSetChanged()
    }
}