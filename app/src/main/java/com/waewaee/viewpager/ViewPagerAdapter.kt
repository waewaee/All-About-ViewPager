package com.waewaee.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_holder.view.*

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerAdapter.PagerVH>(){
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )
    class PagerVH(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false))
    }

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        if (position == 0) {
            holder.itemView.tvTitle.text = "ViewPager2"
            holder.itemView.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.itemView.ivImage.setImageResource(R.drawable.pic)
            holder.itemView.container.setBackgroundResource(colors[position])
        }
        if (position == 1) {
            holder.itemView.tvTitle.text = "ViewPager2"
            holder.itemView.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.itemView.ivImage.setImageResource(R.drawable.pic)
            holder.itemView.container.setBackgroundResource(colors[position])
        }
        if (position == 2) {
            holder.itemView.tvTitle.text = "ViewPager2"
            holder.itemView.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.itemView.ivImage.setImageResource(R.drawable.pic)
            holder.itemView.container.setBackgroundResource(colors[position])
        }
        if (position == 3) {
            holder.itemView.tvTitle.text = "ViewPager2"
            holder.itemView.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.itemView.ivImage.setImageResource(R.drawable.pic)
            holder.itemView.container.setBackgroundResource(colors[position])
        }
    }

    override fun getItemCount(): Int {
        return 4
    }
}