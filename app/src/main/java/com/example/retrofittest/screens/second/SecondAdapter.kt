package com.example.retrofittest.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittest.R
import com.example.retrofittest.model.cash.CashModelItem
import com.example.retrofittest.model.cashless.CashlessModelItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<CashlessModelItem>()

    inner class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.item_name).text = listSecond[position].ccy
        holder.itemView.findViewById<TextView>(R.id.item_buy).text = listSecond[position].buy
        holder.itemView.findViewById<TextView>(R.id.item_sale).text = listSecond[position].sale

    }

    override fun getItemCount(): Int = listSecond.size


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashlessModelItem>) {
        listSecond = list
        notifyDataSetChanged()
    }
}