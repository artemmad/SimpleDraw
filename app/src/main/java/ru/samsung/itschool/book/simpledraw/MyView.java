package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import task.Task;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    int N = 100;
    float[] x = new float[N];
    float[] y = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];

    Paint paint = new Paint ();

    boolean started;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Эту строку нужно удалить
        Task.showMessage(getContext(), "Добавьте в метод onDraw() класса MyView команды рисования");

        //Здесь располагаются команды рисования
        ///...

        for(int i = 0; i<N; i++){
            canvas.drawCircle(x[i], y[i], 20 ,paint);
        }//drawing circles on canvas

        for(int i = 0; i<N;i++)
        {
            x[i]+= vx[i];
            y[i]+= vy[i];
        }


        if(!started){
            for(int i = 0; i<N;i++)
            {
                x[i] = (float) (Math.random()*500);
                y[i] = (float) (Math.random()*500);
                vx[i] = (float) (Math.random()*6-3);
                x[i] = (float) (Math.random()*6-3);

            }
            //заполнение массива
            started = true;
        }

        invalidate();// Ставим задачу на перерисовку
    }
}
