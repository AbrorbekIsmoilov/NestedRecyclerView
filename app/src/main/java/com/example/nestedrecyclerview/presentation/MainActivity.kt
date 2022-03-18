package com.example.nestedrecyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.adapter.CategoryAdapter
import com.example.nestedrecyclerview.model.CategoryModel
import com.example.nestedrecyclerview.model.ProductModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var category_list = arrayListOf<CategoryModel>()
    private lateinit var product_adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        category_rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        product_adapter = CategoryAdapter(this,category_list)
        category_rv.adapter = product_adapter

        val tv_list = arrayListOf<ProductModel>()
        tv_list.add(ProductModel("Artel (MAX)","Dunyoni oynadan ko'r",150))
        tv_list.add(ProductModel("Samsung (MAX)","Dunyoni oynadan ko'r",950))
        tv_list.add(ProductModel("HOCOs (MAX)","Dunyoni oynadan ko'r",200))
        tv_list.add(ProductModel("LG (MAX)","Dunyoni oynadan ko'r",350))
        tv_list.add(ProductModel("Huawei (MAX)","Dunyoni oynadan ko'r",450))
        tv_list.add(ProductModel("Artel (MAX)","Dunyoni oynadan ko'r",150))
        tv_list.add(ProductModel("Samsung (MAX)","Dunyoni oynadan ko'r",950))
        tv_list.add(ProductModel("HOCOs (MAX)","Dunyoni oynadan ko'r",200))
        tv_list.add(ProductModel("LG (MAX)","Dunyoni oynadan ko'r",350))
        tv_list.add(ProductModel("Huawei (MAX)","Dunyoni oynadan ko'r",450))

        val phone_list = arrayListOf<ProductModel>()
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",150))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",950))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",200))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",350))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",450))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",150))
        phone_list.add(ProductModel("Iphone (MAX)","Dunyoni oynadan ko'r",950))
        tv_list.add(ProductModel("HOCOs (MAX)","Dunyoni oynadan ko'r",200))
        tv_list.add(ProductModel("LG (MAX)","Dunyoni oynadan ko'r",350))
        tv_list.add(ProductModel("Huawei (MAX)","Dunyoni oynadan ko'r",450))

        val car_list = arrayListOf<ProductModel>()
        car_list.add(ProductModel("BMW (MAX)","Dunyoni oynadan ko'r",150))
        car_list.add(ProductModel("AMG (MAX)","Dunyoni oynadan ko'r",950))
        car_list.add(ProductModel("TESLA (MAX)","Dunyoni oynadan ko'r",200))
        car_list.add(ProductModel("BUGGATI (MAX)","Dunyoni oynadan ko'r",350))
        car_list.add(ProductModel("Lamborgini (MAX)","Dunyoni oynadan ko'r",450))
        car_list.add(ProductModel("Mustang (MAX)","Dunyoni oynadan ko'r",150))
        car_list.add(ProductModel("CAMARO (MAX)","Dunyoni oynadan ko'r",950))
        car_list.add(ProductModel("BMW (MAX)","Dunyoni oynadan ko'r",150))
        car_list.add(ProductModel("AMG (MAX)","Dunyoni oynadan ko'r",950))
        car_list.add(ProductModel("TESLA (MAX)","Dunyoni oynadan ko'r",200))
        car_list.add(ProductModel("BUGGATI (MAX)","Dunyoni oynadan ko'r",350))
        car_list.add(ProductModel("Lamborgini (MAX)","Dunyoni oynadan ko'r",450))
        car_list.add(ProductModel("Mustang (MAX)","Dunyoni oynadan ko'r",150))
        car_list.add(ProductModel("CAMARO (MAX)","Dunyoni oynadan ko'r",950))


        category_list.add(CategoryModel("Telev izor",tv_list))
        category_list.add(CategoryModel("Phone",phone_list))
        category_list.add(CategoryModel("Car Shop",car_list))
    }

}