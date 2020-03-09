package com.p7k.mycart.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.mycart.Item.Brand
import com.p7k.mycart.R
import kotlinx.android.synthetic.main.cart_item.view.*

class ProductAdapter(var productlist : ArrayList<Brand>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(var view: View) :
        RecyclerView.ViewHolder(view) {

        fun bindProduct(brand: Brand) {

            view.image.setImageResource(brand.image)
            view.txtName.text = brand.name
            view.price.text = brand.price.toString()
            view.gram.text= brand.gram.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        var view1 = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)

        return ProductViewHolder(view1)
    }

    override fun getItemCount(): Int {
        return productlist.size
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {

        holder.bindProduct(productlist.get(position))

    }

}