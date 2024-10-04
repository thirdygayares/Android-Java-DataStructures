Data structures are important for organizing and managing data efficiently in software development. When studying Android development using Java, understanding key data structures like `HashMap` and `List` (specifically `ArrayList`) is hard. This topic highlights why these structures are important and how they can enhance Android applications.

#### 1\. **Efficient Data Management with HashMap**

`HashMap` is a key-value pair data structure that allows for quick data retrieval. It’s particularly useful in scenarios where fast access to data is needed.

* **Fast Lookups:** `HashMap` provides average time complexity of O(1) for lookups, meaning you can quickly find data based on a key. This is essential in applications where speed is critical, such as when fetching user details or settings.
    
* **Example Scenario:** In a messaging app, you can store user information (like usernames and profile pictures) in a `HashMap`, where the username serves as the key. This allows quick access to user data without searching through a list.
    

#### 2\. **Dynamic Data Storage with List (ArrayList)**

`ArrayList` is a flexible data structure that allows for dynamic storage of data. It can grow or shrink as needed, making it ideal for managing collections of items.

* **Easy Insertion and Deletion:** `ArrayList` allows for easy addition and removal of items. Though inserting at the end is O(1), inserting or deleting at specific positions can take O(n) time. However, its flexibility makes it suitable for many use cases in Android apps.
    
* **Example Scenario:** An e-commerce application can use `ArrayList` to manage a dynamic shopping cart. Users can add or remove items from their cart, and the `ArrayList` can easily accommodate these changes.
    

#### 3\. **Combining HashMap and List for Enhanced Functionality**

In many cases, using both `HashMap` and `ArrayList` together can provide powerful solutions:

* **Data Organization:** For instance, you could use a `HashMap` to map categories of products to an `ArrayList` of products within each category. This combination allows for fast access to all products in a specific category while keeping the product list dynamic.
    
* **Example Scenario:** In a social media app, you might store user posts in an `ArrayList` and use a `HashMap` to keep track of likes or comments associated with each post. This way, you can efficiently manage and display interactions with posts.
    

#### 4\. **Problem-Solving and Code Quality**

Understanding how to use `HashMap` and `ArrayList` improves problem-solving skills and enhances code quality.

* **Clearer Code:** Using appropriate data structures makes code easier to read and maintain. For example, if you use a `HashMap` to store user settings, other developers can quickly understand how to access and modify those settings.
    

Mastering data structures like `HashMap` and `List` (ArrayList) is essential for anyone studying Android development with Java. These data structures enhance data management, improve application performance, and foster better coding practices. By investing time in understanding how to use `HashMap` and `ArrayList`, you will be better equipped to build efficient and robust Android applications.

## Example of LIST Data Structure in Android:  
  
XML:

```java
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:padding="20dp"
    tools:context=".datastructure.list.ImplementList">

    
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="SHOPPING PAGE"
            android:textSize="20sp"
            />
        
        
        <EditText
            android:id="@+id/et_items"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:background="@android:color/darker_gray"
            android:hint="Enter Items"
            android:textColor="@color/white"
            android:textColorHint="@color/white"
            android:textSize="30sp"
            android:layout_marginVertical="20dp"
            />

        <Button
            android:id="@+id/btn_submit"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="SUBMIT"
            />

        <Button
            android:id="@+id/btn_all"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="DELETE ALL"
            />


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Check logs for output"
            android:textSize="20sp"
            android:layout_marginVertical="20dp"
            />

        <TextView
            android:id="@+id/txt_output"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Output"
            android:textSize="30sp"
            android:layout_marginVertical="20dp"
            />



        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Type index to delete"
            android:textSize="20sp"
            android:layout_marginVertical="20dp"
            />


        <EditText
            android:id="@+id/et_delete_item"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:background="@android:color/darker_gray"
            android:hint="Enter Index"
            android:textColor="@color/white"
            android:textColorHint="@color/white"
            android:textSize="30sp"
            android:inputType="number"
            android:layout_marginVertical="20dp"
            />

        <Button
        android:id="@+id/btn_delete_index"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="SUBMIT"
        />

        
    </LinearLayout>
        
  
    
    
    

</RelativeLayout>
```

## JAVA

```java
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
```

* **Use of** `ArrayList`:
    
    * The app uses an `ArrayList<String>` named `shopping_list` to store the names of items added by the user. An `ArrayList` is a resizable array implementation that allows dynamic storage of elements.
        
* **Dynamic Sizing**:
    
    * As users add items to the shopping list using the `etItems` input field and the submit button, the `ArrayList` automatically resizes to accommodate new entries. This is a key advantage of using an `ArrayList` over a traditional array, which has a fixed size.
        
* **Efficient Access and Modification**:
    
    * The app allows for efficient access to the list of items. When an item is added, it is appended to the end of the list with `shopping_list.add(items);`. This operation is generally O(1) (constant time), making it efficient.
        
    * The app also enables deletion of items. When a user specifies an index in `etDeleteItem`, the corresponding item is removed from the list using `shopping_list.remove(item);`. This operation takes O(n) time in the worst case, as it may involve shifting elements in the array, but it is still manageable for small to moderate lists.
        
* **Displaying the List**:
    
    * The current contents of the `ArrayList` are displayed in a `TextView` (`txt_output`). Whenever the list is modified (an item is added or removed), the output is updated to reflect the current state of the `shopping_list`. This direct feedback helps users understand the changes they are making.
        
* **Clear Functionality**:
    
    * The app provides a method to clear the entire list with the `btnDeleteAll` button. This is achieved using `shopping_list.clear();`, which removes all elements efficiently.
        

**OUTPUT**

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1728031807135/e546faed-d915-4b17-abc5-a8c1cc874bad.gif)

## Example of HASHMAP Data Structure in Android:

## XML CODE

```java
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".datastructure.hashmap.ImplementHashmap">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Student Data"
            android:textSize="20sp"
          />

        <EditText
            android:id="@+id/et_student_id"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:padding="20dp"
            android:layout_margin="10dp"
            android:hint="Enter Student ID"
            />



        <EditText
            android:id="@+id/et_student_name"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:padding="20dp"
            android:layout_margin="10dp"
            android:hint="Enter Student Name"
            />

        <EditText
            android:id="@+id/et_course"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:padding="20dp"
            android:layout_margin="10dp"
            android:hint="Enter Course"
            />

        <EditText
            android:id="@+id/et_section"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:padding="20dp"
            android:layout_margin="10dp"
            android:hint="Enter Section"
            />

        <Button
            android:id="@+id/btn_submit"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="20dp"
            android:text="SUBMIT"
            />

        <TextView
            android:id="@+id/txt_output"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Output"
            android:textSize="30sp"
            android:padding="20dp"
            android:layout_margin="10dp"

            />


    </LinearLayout>


</RelativeLayout>
```

##   
  
JAVA CODE

```java
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
```

1. **Use of** `HashMap`:
    
    * The application utilizes a `HashMap<String, String>` called `student_hashmap` to store student details. In this context, the keys are strings that represent different attributes (like "id", "name", "course", and "section"), and the values are the corresponding data entered by the user.
        
2. **Key-Value Pairs**:
    
    * Each student's information is stored as key-value pairs:
        
        * `"id"` → Student's ID
            
        * `"name"` → Student's Name
            
        * `"course"` → Student's Course
            
        * `"section"` → Student's Section
            
    * This structure allows for easy retrieval of student information based on specific attributes.
        
3. **Dynamic Data Storage**:
    
    * The `HashMap` allows the application to store multiple students’ data dynamically. Each time the user submits the form, the latest student details are added to the `student_hashmap`.
        
4. **Efficient Data Access**:
    
    * `HashMap` provides constant time complexity (O(1)) for retrieval operations on average. This means that once data is stored, it can be accessed very quickly based on its key.
        
5. **Logging and Display**:
    
    * When the user clicks the submit button, the application logs the current state of the `student_hashmap` using `Log.d`, and it updates the `TextView` (`txtOutput`) to display the stored student data. This helps in providing instant feedback to the user about the information they just entered.
        

### Benefits of Using `HashMap` in This App

* **Fast Lookups**: Using a `HashMap` allows for quick retrieval of student data based on keys. This is particularly useful when you need to access specific information about a student efficiently.
    
* **Ease of Use**: The `HashMap` API is straightforward, allowing developers to easily add and retrieve entries without worrying about the underlying complexities of data storage.
    
* **Flexibility**: A `HashMap` can dynamically resize as needed, making it suitable for applications that require adding or updating data frequently.
    
* **Organized Data**: By using keys for different attributes, the data is well-organized and easily understandable. This structure makes it clear what each piece of data represents.
    

### Example Scenario

If a user enters:

* Student ID: "123"
    
* Student Name: "John Doe"
    
* Course: "Computer Science"
    
* Section: "A"
    

The `student_hashmap` would then store:

```java
{
  "id" : "1",
  "name" : "Thirdy",
  "course" : "Computer Science",
  "section" : "CDS"
}
```

the `HashMap` is effectively used in this Android application to manage and store student information.

Its ability to handle key-value pairs allows for organized and efficient data management, which enhances the application's functionality and user experience. Understanding how to use `HashMap` is essential for developing applications that require quick access to various attributes of complex data objects.

## **HASHMAP OUTPUT**

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1728032076367/c6dafabe-aeb2-4aa2-870b-fd69af02fef0.gif)

### References for Further Reading

1. [HashMap in Java - GeeksforGeeks](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/#:~:text=HashMap%20in%20Java%20stores%20the%20data#:~:text=HashMap%20in%20Java%20stores%20the%20data)
    
2. [**GeeksforGeeks: ArrayList in**](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/#:~:text=HashMap%20in%20Java%20stores%20the%20data#:~:text=HashMap%20in%20Java%20stores%20the%20data) **Java**  
    GeeksforGeeks - ArrayList
    
3. **Android Developers: Data Storage**  
    [Android Developers](https://developer.android.com/training/data-storage)
