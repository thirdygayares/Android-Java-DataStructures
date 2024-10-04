package com.thirdygayares.android_java_datastructures;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.thirdygayares.android_java_datastructures.datastructure.hashmap.ImplementHashmap;
import com.thirdygayares.android_java_datastructures.datastructure.list.ImplementList;


public class MainActivity extends AppCompatActivity {

    Button btnArrayList, btnHashmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArrayList = findViewById(R.id.btn_arraylist);
        btnHashmap = findViewById(R.id.btn_hashmap);

        btnArrayList.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImplementList.class);
            startActivity(intent);
        });

        btnHashmap.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, ImplementHashmap.class);
            startActivity(intent);
        });

        
    }
}