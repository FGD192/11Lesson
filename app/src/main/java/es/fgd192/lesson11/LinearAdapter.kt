package es.fgd192.lesson11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LinearAdapter(var list: ArrayList<CustomDataClass>) : RecyclerView.Adapter<LinearAdapter.LinearViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.linear,parent,false)
        return LinearViewHolder(view)
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {

    }
    class LinearViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}