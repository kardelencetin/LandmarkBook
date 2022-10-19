package com.kardelencetin.landmarkbook;

// import static com.kardelencetin.landmarkbook.MainActivity.chosenLandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kardelencetin.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // binding.countryText.setText("Test");

        Intent intent = getIntent();


        // Casting
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        // Landmark selectedLandmark = chosenLandmark;

        // Singleton singleton = Singleton.getInstance();
        // Landmark selectedLandmark = singleton.getSentLandmark();

        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}