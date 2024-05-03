package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    private List<Book> booksList;
    private Context context;
    public BookAdapter(Context context, List<Book> booksList) {
        super(context, 0, booksList);
        this.booksList = booksList;
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Получаем объект Book для текущей позиции
        Book book = getItem(position);


        // Проверяем, если view переиспользуется, если нет, создаем новый
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_book, parent, false);
        }

        // Находим все необходимые View в макете элемента списка
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView titleTextView = convertView.findViewById(R.id.book_name_list);
        TextView authorTextView = convertView.findViewById(R.id.author_name_list);

        // Устанавливаем данные книги в соответствующие View
        titleTextView.setText(book.getBook_name());
        authorTextView.setText(book.getId_author());


        // Загружаем изображение с помощью библиотеки Glide (если у вас используется URL изображения)
        Glide.with(context).load(book.getImage()).into(imageView);
        return convertView;
    }
}
