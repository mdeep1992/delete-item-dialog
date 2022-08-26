package com.example.deleteitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> list;
    Adapter adapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        DoInitRecyclerview();

    }

    private void DoInitRecyclerview() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        adapter = new Adapter(MainActivity.this, list1());
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<Model> list1() {
        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model("Ram", "coimbatore", "android developer"));
        list.add(new Model("Anbu", "coimbatore", "web developer"));
        list.add(new Model("kishore", "Tirupur", "web developer"));
        list.add(new Model("kali", "Ramnad", "web developer"));
        list.add(new Model("Logu", "coimbatore", "web developer"));
        list.add(new Model("prakash", "Theni", "web developer"));
        list.add(new Model("Sathish", "salem", "full stack developer"));
        list.add(new Model("pradeep", "coimbatore", "android developer"));
        list.add(new Model("murugesh", "Trichy", "full stack developer"));
        list.add(new Model("pragadhesh", "sivagangai", "sales executive"));
        list.add(new Model("Gowtham", "trichy", "android developer"));
        list.add(new Model("Ragu", "coimbatore", "android developer"));
        list.add(new Model("Gopi", "coimbatore", "android developer"));
        return list;
    }
}