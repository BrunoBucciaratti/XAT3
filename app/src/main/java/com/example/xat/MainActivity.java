package com.example.xat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.xat.Adapter.CategoryAdapter;
import com.example.xat.Adapter.Types2Adapter;
import com.example.xat.Adapter.TypesAdapter;
import com.example.xat.Constructor.Category;
import com.example.xat.Constructor.Types;
import com.example.xat.Constructor.Types2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, typesRecycler, types2Recycler;
    CategoryAdapter categoryAdapter;
    TypesAdapter typesAdapter;
    Types2Adapter types2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Заказы", "purple_500"));
        categoryList.add(new Category(2, "Доставка", "purple_500"));
        categoryList.add(new Category(3, "Оплата", "purple_500"));
        categoryList.add(new Category(4, "Отзыв", "purple_500"));
        setCategoryRecycler(categoryList);

        List<Types> typesList = new ArrayList<>();
        typesList.add(new Types(1, "pizza_svgrepo_com__1_", "Пицца", ""));
        typesList.add(new Types(2, "burger", "Бургеры",""));
        typesList.add(new Types(3, "sushi", "Суши",""));
        typesList.add(new Types(4, "soup", "Супы",""));
        setTypesRecycler(typesList);


        List<Types2> types2List = new ArrayList<>();
        types2List.add(new Types2(1, "salad", "Салаты",""));
        types2List.add(new Types2(2, "drink", "Напитки",""));
        types2List.add(new Types2(3, "dessert", "Десерты",""));
        types2List.add(new Types2(4, "fries", "Закуски",""));
        setTypes2Recycler(types2List);

    }



    private void setTypesRecycler(List<Types> typesList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        typesRecycler = findViewById(R.id.typesRecycler);
        typesRecycler.setLayoutManager(layoutManager);

        typesAdapter = new TypesAdapter(this, typesList);
        typesRecycler.setAdapter(typesAdapter);

    }

    private void setTypes2Recycler(List<Types2> types2List) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        types2Recycler = findViewById(R.id.types2Recycler);
        types2Recycler.setLayoutManager(layoutManager);

        types2Adapter = new Types2Adapter(this, types2List);
        types2Recycler.setAdapter(types2Adapter);

    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }
}