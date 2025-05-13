package com.ayushsabharwal.android_library

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class AndroidLibrary @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : AppCompatTextView(context, attrs, defStyle) {

    init {
        applyStyle()
    }

    private fun applyStyle() {
        try {
            typeface = Typeface.createFromAsset(context.assets, "fonts/fancy_font.ttf")
        } catch (e: Exception) {
            e.printStackTrace()
        }

        textSize = 25f
    }
}