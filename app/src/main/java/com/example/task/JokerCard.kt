package com.example.task

import android.content.Context
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class JokerCard@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_jocker_card, this, true)
        orientation = VERTICAL
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it,
                R.styleable.joker_card_attrs, 0, 0)

            val number = resources.getText(typedArray
                .getResourceId(R.styleable
                    .joker_card_attrs_card_number,
                    R.string.number))
            val text1=findViewById<TextView>(R.id.textView)
            text1.text = number
            val text2 = findViewById<TextView>(R.id.textView3)
            text2.text =number

            val image  = findViewById<ImageView>(R.id.imageView)

            image.setImageResource(typedArray.getResourceId(R.styleable.joker_card_attrs_card_image,-1))

            typedArray.recycle()
        }
    }
}