package id.ignitech.rapochinki.Material;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by alenovan on 5/29/17.
 */

public class TextTitle extends android.support.v7.widget.AppCompatTextView {

    public TextTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextTitle(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "avenir.otf");
            setTypeface(tf);
        }
    }

}

