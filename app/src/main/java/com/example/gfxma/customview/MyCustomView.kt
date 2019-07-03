
package com.example.gfxma.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast


class MyCustomView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    protected lateinit var image : ImageView

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.activity_custom_view, this, true)

        image = view.findViewById(R.id.imageView)

        image.setOnClickListener {
            Toast.makeText(context, "Its toast!", Toast.LENGTH_SHORT).show()
        }
    }
}
