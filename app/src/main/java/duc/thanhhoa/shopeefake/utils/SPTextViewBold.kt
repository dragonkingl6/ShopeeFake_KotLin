package duc.thanhhoa.shopeefake.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class SPTextViewBold(context: Context, attr:AttributeSet) : AppCompatTextView(context, attr){
    init {
        applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface= Typeface.createFromAsset(context.assets,"OpenSans-Bold.ttf")
        setTypeface(typeface)
    }
}