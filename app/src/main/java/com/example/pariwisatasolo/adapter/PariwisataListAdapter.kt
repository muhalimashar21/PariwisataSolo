package com.example.pariwisatasolo.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pariwisatasolo.R
import com.example.pariwisatasolo.activity.DetailActivity
import com.example.pariwisatasolo.model.ResponsePariwisata

class PariwisataListAdapter(val context:Context, val dataPariwisata: List<ResponsePariwisata?>?):
    RecyclerView.Adapter<PariwisataListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_pariwisata,parent,false))
    }

    override fun getItemCount(): Int = dataPariwisata?.count()!!

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataPariwisata?.get(position))

        holder.itemView.setOnClickListener{
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("MV_ID",dataPariwisata?.get(position)?)
            intent.putExtra("nama",dataPariwisata?.get(position)?.namamurid)
            intent.putExtra("jeniskelamin",dataPariwisata?.get(position)?.jeniskelamin)
            intent.putExtra("umur",dataPariwisata?.get(position)?)
            context.startActivity(intent)
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(pariwisata: ResponsePariwisata?){
            itemView.txt1.text = murid?.namamurid
        }

    }
}