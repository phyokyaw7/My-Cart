package com.p7k.mycart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.p7k.mycart.Adaptor.ProductAdapter
import com.p7k.mycart.Item.Brand
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var brandArray = ArrayList<Brand>()

        brandArray.add(Brand(R.drawable.sugar,"Fine Sugar",20,1))
        brandArray.add(Brand(R.drawable.rice,"Dawat Rice",20,3))
        brandArray.add(Brand(R.drawable.peanut,"Peanuts",80,2))

        var productadapter = ProductAdapter(brandArray)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = productadapter
    }
}