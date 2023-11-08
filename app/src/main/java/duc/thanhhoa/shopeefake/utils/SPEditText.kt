package duc.thanhhoa.shopeefake.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class SPEditText(context: Context, attributeSet: AttributeSet): AppCompatEditText(context,attributeSet) {

    init{
        applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"OpenSans-Bold.ttf")
        setTypeface(typeface)
    }
}