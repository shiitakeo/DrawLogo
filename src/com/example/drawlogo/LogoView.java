package com.example.drawlogo;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class LogoView extends View {
    public LogoView(Context context) {
        super(context);
        setBackgroundColor(Color.rgb(20, 20, 20));
    }

    @Override 
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();      
        paint.setAntiAlias(true);
        
        int _x, _y, _size;
        Character ch;
        String _nnt= "NNT!";
        Random rnd = new Random();        
        for(int i = 0; i < 300; i++){
            _x = rnd.nextInt(getWidth());
            _y = rnd.nextInt(getHeight());
            _size = rnd.nextInt(100);
            paint.setTextSize(_size);
            ch = _nnt.charAt(_size % 3);
            //using RGB
            //paint.setColor(Color.argb(160, rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
            //using HSV
            paint.setColor(Color.HSVToColor(160, new float[] {rnd.nextInt(360), 1, 1}));
        	canvas.drawText(ch.toString(), _x, _y, paint);
        }
    }
}