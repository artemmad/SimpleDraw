package ru.samsung.itschool.book.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import task.Task;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Эту строку нужно удалить
        Task.showMessage(getContext(), "Добавьте в метод onDraw() класса MyView команды рисования");

        //Здесь располагаются команды рисования
        ///...
    }
}
