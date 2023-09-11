package com.example.trekking

import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import javax.xml.transform.ErrorListener

class MyAdapter(var  newList : ArrayList<Montagna>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    //private lateinit var mListener: onItemClickListener

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var link = " "
        val titleImage : ImageView = itemView.findViewById(R.id.fotoMontagna)
        val trekkingname : TextView = itemView.findViewById(R.id.nomeSentiero)
        val trekkingduration : TextView = itemView.findViewById(R.id.ore)
        val trekkingstartingpoint : TextView = itemView.findViewById(R.id.citta)
        var type = ""
        //init {
        //    itemView.setOnClickListener{
        //        listener.onItemClick(adapterPosition)
        //    }
        //}
    }

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun onItemClickListener(listener: onItemClickListener){
        //mListener = listener
    }

    fun setFilteredList(mList: ArrayList<Montagna>){
        this.newList = mList
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curretItem = newList[position]
        holder.trekkingname.text = curretItem.Sentiero
        holder.trekkingduration.text = curretItem.Ore
        holder.trekkingstartingpoint.text = curretItem.Partenza
        holder.titleImage.setImageResource(curretItem.Image)
        holder.link = curretItem.Link


    }



    override fun getItemCount(): Int {
        return newList.size
    }




}