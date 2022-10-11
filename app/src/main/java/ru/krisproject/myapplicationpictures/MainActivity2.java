package ru.krisproject.myapplicationpictures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import ru.krisproject.myapplicationpictures.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] level_name = {"Уровень 1", "Уровень 2", "Уровень 3", "Уровень 4", "Уровень 5", "Уровень 6", "Уровень 7",
                "Уровень 8", "Уровень 9", "Уровень 10"};
        int[] image = {R.drawable.level_image_question, R.drawable.level_image_question, R.drawable.level_image_question,
                R.drawable.level_image_question, R.drawable.level_image_question, R.drawable.level_image_question,
                R.drawable.level_image_question, R.drawable.level_image_question, R.drawable.level_image_question,
                R.drawable.level_image_question};

        GridAdapter gridAdapter = new GridAdapter(MainActivity2.this, level_name, image);
        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity2.this, "Нажатие на " + level_name[position] + " уровень", Toast.LENGTH_SHORT);

            }
        });
    }
}