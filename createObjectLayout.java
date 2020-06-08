package com.example.digitaldesign;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;


public class createObjectLayout extends View {

    Bitmap tshirt;
    Bitmap fromGal;

    public createObjectLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.wall);
        tshirt = BitmapFactory.decodeResource(getResources(),R.drawable.tshirt);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect trect = new Rect();
        trect.set(50,50,1050,1350 );
        canvas.drawBitmap(tshirt,null,trect,null);
    }
}
