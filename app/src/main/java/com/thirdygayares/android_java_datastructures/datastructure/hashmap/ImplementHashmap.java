package com.thirdygayares.android_java_datastructures.datastructure.hashmap;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.thirdygayares.android_java_datastructures.R;

import java.util.HashMap;

public class ImplementHashmap extends AppCompatActivity {

    EditText etStudentId, etStudentName, etCourse, etSection;
    Button btnSubmit;
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implement_hashmap);
        etStudentId= findViewById(R.id.et_student_id);
        etStudentName= findViewById(R.id.et_student_name);
        etCourse = findViewById(R.id.et_course);
        etSection = findViewById(R.id.et_section);
        btnSubmit = findViewById(R.id.btn_submit);
        txtOutput = findViewById(R.id.txt_output);

        HashMap<String, String> student_hashmap = new HashMap<>();

        btnSubmit.setOnClickListener(v->{

            String studentId = etStudentId.getText().toString();
            String studentName = etStudentName.getText().toString();
            String course = etCourse.getText().toString();
            String section = etSection.getText().toString();

            student_hashmap.put("id", studentId);
            student_hashmap.put("name", studentName);
            student_hashmap.put("course", course);
            student_hashmap.put("section", section);

            Log.d("TAG", "Student Data" + student_hashmap);
            txtOutput.setText("Student Data" + student_hashmap);
        });

    }
}