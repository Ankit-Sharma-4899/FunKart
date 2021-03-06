package com.example.funkart



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val context:Context,private val layouts:ArrayList<Int> )
    : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(LayoutInflater.from(parent.context).inflate(viewType,parent,false))
    }

    override fun getItemCount(): Int =layouts.size

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return  layouts[position]
    }

    inner class ViewPagerHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {

    }
}