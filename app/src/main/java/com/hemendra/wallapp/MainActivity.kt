package com.hemendra.wallapp

import android.app.WallpaperManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var imgarray = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10)
    var pos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gv_images.adapter = GridAdapter(this@MainActivity)

        gv_images.setOnItemClickListener(object :AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, postion: Int, p3: Long) {
                   pos = postion
                fullimg.setImageResource(imgarray[postion])
//              var i = Intent(this@MainActivity,DetailActivity::class.java)
//                i.putExtra("pos",postion)
//                startActivity(i)
            }

        })

        btn_set_wall.setOnClickListener {

            var wallpaperManager: WallpaperManager = WallpaperManager.getInstance(this@MainActivity)

            wallpaperManager.setResource(imgarray[pos])

            Toast.makeText(this@MainActivity,"Set Wallpaper Successfully...!", Toast.LENGTH_SHORT).show()


        }
    }
}