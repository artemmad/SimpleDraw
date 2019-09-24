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

    Paint paint = new Paint ();
    float x = 0;
    long lastTime = System.currentTimeMillis();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Эту строку нужно удалить
        Task.showMessage(getContext(), "Добавьте в метод onDraw() класса MyView команды рисования");

        //Здесь располагаются команды рисования
        ///...

        canvas.drawCircle(x, 300,20,paint);
        long nowTime = System.currentTimeMillis();
        x+=0.001f*(nowTime - lastTime);
        lastTime=nowTime;

        invalidate();// Ставим задачу на перерисовку
    }
}
