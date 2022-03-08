package com.example.task

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
var count = 7
class MainActivity : AppCompatActivity() {
    val list = ArrayList<Card>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add(Card("1",resources.getIdentifier("@drawable/favpng_joker_playing_card_suit_spades", "drawable",this.packageName),0))
        list.add(Card("2",resources.getIdentifier("@drawable/favpng_playing_card_suit_card_game_ace_clip_art", "drawable",this.packageName),1))
        list.add(Card("3",resources.getIdentifier("@drawable/favpng_joker_playing_card_stock_photography_royalty_free", "drawable",this.packageName),2))
        list.add(Card("4",resources.getIdentifier("@drawable/favpng_joker_playing_card_suit_spades", "drawable",this.packageName),3))
        list.add(Card("5",resources.getIdentifier("@drawable/favpng_joker_playing_card_stock_photography_royalty_free", "drawable",this.packageName),4))
        list.add(Card("6",resources.getIdentifier("@drawable/favpng_playing_card_suit_card_game_ace_clip_art", "drawable",this.packageName),5))

        title = "Cards"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CardsListAdapter(list)
        val manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager
        recyclerView.adapter = adapter

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener{
                val newCard = Card(count.toString(),resources.getIdentifier("@drawable/favpng_playing_card_suit_card_game_ace_clip_art", "drawable",this.packageName),count)
                list.add(newCard)
                count+=1
                adapter.notifyItemInserted(count)
        }
    }


}