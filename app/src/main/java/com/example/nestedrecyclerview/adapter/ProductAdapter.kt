package com.example.nestedrecyclerview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.ProductModel
import kotlinx.android.synthetic.main.product_item.view.*

@SuppressLint("StaticFieldLeak")

private var  root : View? = null

class ProductAdapter(private val context: Context, private var arrayList: ArrayList<ProductModel>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        root = LayoutInflater.from(context).inflate(R.layout.product_item,parent,false)
        return ViewHolder(root!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = arrayList[position]
        holder.itemView.product_name.text = "${data.productName}"
        holder.itemView.product_detail.text = "${data.productDetails}"
        holder.itemView.product_price.text = "${data.productPrice} $"

    }

    override fun getItemCount(): Int = arrayList.size
}