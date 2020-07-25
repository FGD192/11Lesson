package es.fgd192.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.spnr as spnr1

private var spinner: Spinner? = null
private var recyclerView: RecyclerView? = null
private var recyclerView2: RecyclerView? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        spinnerAdapter()
        SpinnerLayout()
    }
    private fun setupView(){
        spinner = findViewById(R.id.spnr)
        var button = findViewById<Button>(R.id.button)
        recyclerView = findViewById(R.id.ReVi)
        recyclerView2 = findViewById(R.id.ReVi2)
    }
    private fun spinnerAdapter(){
        var adapter = SpinnerAdapter(applicationContext, R.id.TeVi,getData())
        spinner?.adapter = adapter
        var GridAdapter = GridAdapter(getData())
        recyclerView?.layoutManager = GridLayoutManager(applicationContext,2)
        var Linearadapter = LinearAdapter(getData())
        recyclerView2?.layoutManager = LinearLayoutManager(applicationContext)
    }

            private fun getData(): ArrayList<CustomDataClass> {
        var data = arrayListOf<CustomDataClass>()
            data.add(CustomDataClass(1,"Linear"))
            data.add(CustomDataClass(2,"Grid"))
        return data
        }
    private fun SpinnerLayout(){
    }
    }