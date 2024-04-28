package com.example.recyclerview_05;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        int Item = 0;
        List<Item>items = new ArrayList<>(Item);
        items.add(new Item("Juan Gonzalez","juan@gmail.com",R.drawable.imagen1));
        items.add(new Item("Luis Gonzalez","Luiz@gmail.com",R.drawable.imagen1));
        items.add(new Item("Emilio perez","emilio@gmail.com",R.drawable.imagen1));
        items.add(new Item("Maria Juana","maria@gmail.com",R.drawable.imagen1));
        items.add(new Item("Pedro Pablo","pedro@gmail.com",R.drawable.imagen1));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        
    }
}