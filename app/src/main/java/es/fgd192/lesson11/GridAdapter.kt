package es.fgd192.lesson11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GridAdapter(var list: ArrayList<CustomDataClass>): RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.grid,parent,false)
        return GridViewHolder(view)
    }
    override fun getItemCount():Int = list.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

    }

    class GridViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}