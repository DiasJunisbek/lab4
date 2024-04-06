package com.example.wineshop.typswine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wineshop.R
import com.example.wineshop.databinding.ActivityMainBinding
import com.example.wineshop.model.UserModel


class WineAdapter : RecyclerView.Adapter<WineAdapter.WineViewHolder>() {

    private var wineList = emptyList<UserModel>()

    class WineViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = itemView.findViewById(R.id.wine_name)
        val from: TextView = itemView.findViewById(R.id.wine_from)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wine_layout, parent, false)

        return WineViewHolder(view)
    }

    override fun onBindViewHolder(holder: WineViewHolder, position: Int) {
        holder.name.text = wineList[position].wineName
        holder.from.text = wineList[position].wineFrom
    }

    override fun getItemCount(): Int {
        return wineList.size

    }


    fun setList(list: List<UserModel>) {
        wineList = list
        notifyDataSetChanged()
    }
}

