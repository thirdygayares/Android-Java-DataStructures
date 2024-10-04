package com.thirdygayares.android_java_datastructures.datastructure.list;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.thirdygayares.android_java_datastructures.R;

import java.util.ArrayList;
import java.util.List;

public class ImplementList extends AppCompatActivity {

    EditText etItems, etDeleteItem;
    Button btnSubmit, btnDeleteAll, btnDeleteIndex;
    TextView txt_output;

    List<String> shopping_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_implement_list);

        etItems = findViewById(R.id.et_items);
        btnSubmit = findViewById(R.id.btn_submit);
        txt_output = findViewById(R.id.txt_output);
        btnDeleteAll = findViewById(R.id.btn_all);
        etDeleteItem = findViewById(R.id.et_delete_item);
        btnDeleteIndex = findViewById(R.id.btn_delete_index);

        btnSubmit.setOnClickListener(v -> {
            String items = etItems.getText().toString();
            shopping_list.add(items);
            Log.d("TAG", "My Shoppint list is" + shopping_list);

            txt_output.setText("My Shoppint list is" + shopping_list);
        });

        btnDeleteAll.setOnClickListener(v -> {
            shopping_list.clear();
            Log.d("TAG", "My Shoppint list is" + shopping_list);
            txt_output.setText("My Shoppint list is" + shopping_list);
        });

        //remove item
        btnDeleteIndex.setOnClickListener(v -> {
            int item = Integer.parseInt(etDeleteItem.getText().toString());
            shopping_list.remove(item);
            Log.d("TAG", "My shopping List after deleting are" + shopping_list);
            txt_output.setText("My Shoppint list is" + shopping_list);
        });

    }
}