package com.example.nestedrecyclerview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.adapter.CategoryAdapter.ViewHolder
import com.example.nestedrecyclerview.model.CategoryModel
import kotlinx.android.synthetic.main.category_item.view.*

@SuppressLint("StaticFieldLeak")

private var root : View? = null

class CategoryAdapter(private val context: Context,private var arrayList: ArrayList<CategoryModel>) :
    RecyclerView.Adapter<ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        root = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false)
        return ViewHolder(root!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = arrayList[position]
        holder.itemView.category_name.text = data.categoryName
        var product_list = data.arrayList

        val productAdapter = ProductAdapter(context,product_list)
        holder.itemView.product_rv.layoutManager = LinearLayoutManager(context)
        holder.itemView.product_rv.adapter = productAdapter

    }

    override fun getItemCount(): Int = arrayList.size
}