package com.example.task
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CardsListAdapter(val list:ArrayList<Card>):
    RecyclerView.Adapter<CardsListAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var number1 = itemView.findViewById<TextView>(R.id.textView)
        var number2 = itemView.findViewById<TextView>(R.id.textView3)
        var image= itemView.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_jocker_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val card = list[position]
        holder.number1.text = card.number
        holder.number2.text = card.number
        holder.image.setImageResource(card.image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}


