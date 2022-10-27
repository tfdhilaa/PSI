package com.example.psi_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.psi_recyclerview.ItemsViewModel
import com.example.psi_recyclerview.Nama

class CustomAdapter(private val data: ArrayList<Nama>): RecyclerView.Adapter<ItemsViewModel>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewModel {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return ItemsViewModel(inflater, parent)
    }

    override fun onBindViewHolder(holder: ItemsViewModel, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.psi_recyclerview.ItemsViewModel
//import com.example.psi_recyclerview.R
//
//class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ListViewHolder>() {
//    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var Nama : TextView = itemView.findViewById(R.id.nama)
//        var Nim : TextView = itemView.findViewById(R.id.nim)
//        var Kelas : TextView = itemView.findViewById(R.id.kelas)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
//        return CustomAdapter.ListViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val x = mList[position]
//        holder.Nama.text = x.Nama
//        holder.Nim.text = x.NIM
//        holder.Kelas.text = x.Kelas
//    }
//
//    override fun getItemCount() = mList.size
//}
