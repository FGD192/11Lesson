package es.fgd192.lesson11

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class SpinnerAdapter(context: Context,resources: Int,private var objects:List<CustomDataClass>):
    ArrayAdapter<CustomDataClass>(context,resources,objects) {
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent,false)
        var TeVi = view.findViewById<TextView>(R.id.TeVi)
        TeVi.text = objects[position].title
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent,false)
        var TeVi = view.findViewById<TextView>(R.id.TeVi)
        TeVi.text = objects[position].title
        return view
    }
}