package com.hemendra.wallapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.grid_item.view.*

class GridAdapter(var ctx:Context) : BaseAdapter()
{
    var imgarray = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10)
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var inflater = LayoutInflater.from(ctx)
        var view = inflater.inflate(R.layout.grid_item,p2, false)
        view.imgview.setImageResource(imgarray[position])
      return view
    }


    override fun getCount(): Int {

        return imgarray.size

    }

    override fun getItem(p0: Int): Any {

        return 0

    }

    override fun getItemId(p0: Int): Long {
        return 0
    }


}