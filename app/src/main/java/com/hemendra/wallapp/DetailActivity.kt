package com.hemendra.wallapp

import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.quickaccesswallet.WalletCard
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var imgarray = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10)

        var position:Int = intent.getIntExtra("pos",0)

        detail_imgview.setImageResource(imgarray[position])

//        btn_set_wall.setOnClickListener {
//
//             var wallpaperManager:WallpaperManager = WallpaperManager.getInstance(this@DetailActivity)
//
//             wallpaperManager.setResource(imgarray[position])
//
//             Toast.makeText(this@DetailActivity,"Set Wallpaper Successfully...!",Toast.LENGTH_SHORT).show()
//
//
//        }
    }
}