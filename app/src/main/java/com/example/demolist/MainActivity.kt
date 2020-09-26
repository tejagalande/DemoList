package com.example.demolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val values = arrayListOf("Item one","Item Two","Item Three","Item Four","Item Five","Item Six","Item Seven","Item Eight","Item Nine","Item Ten","Item Eleven","Item Twelve","Item Thirteen")

        val mListView = findViewById<ListView>(R.id.lv_Show)

        // adapter
        val Custome_adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values)

        // set adapter
        mListView.adapter = Custome_adapter

        //List item click listener
        mListView.setOnItemClickListener { parent, view, position, id ->
            if (position == 0){
                Toast.makeText(this,"Item One clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 1){
                Toast.makeText(this,"Item Two clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 2){
                Toast.makeText(this,"Item Three clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 3){
                Toast.makeText(this,"Item Four clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 4){
                Toast.makeText(this,"Item Five clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 5){
                Toast.makeText(this,"Item Six clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 6){
                Toast.makeText(this,"Item Seven clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 7){
                Toast.makeText(this,"Item Eight clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 8){
                Toast.makeText(this,"Item Nine clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 9){
            Toast.makeText(this,"Item Ten clicked",Toast.LENGTH_SHORT).show()
             }
            if (position == 10){
                Toast.makeText(this,"Item Eleven clicked",Toast.LENGTH_SHORT).show()
            }
            if (position == 11){
                Toast.makeText(this,"Item Twelve clicked",Toast.LENGTH_SHORT).show()
            }

        }



    }
}