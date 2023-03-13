package com.example.lista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val items = listOf(
        Item("Item 1"),
        Item("Item 2"),
        Item("Item 3"),
        Item("Item 4"),
        Item("Item 5"),
        Item("Item 6"),
        Item("Item 7"),
        Item("Item 8"),
        Item("Item 9"),
        Item("Item 10")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ItemAdapter(items)
        adapter.onItemClickListener = { item ->
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", item.name)
            startActivity(intent)
        }
        recyclerView.adapter = adapter


    }



}