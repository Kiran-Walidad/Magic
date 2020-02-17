package dev.crew.magichouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDesignActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_design);

        imageView=findViewById(R.id.designImage);

        Uri selectedImgUri = getIntent().getData();
        if (selectedImgUri != null) {
            imageView.setImageURI(selectedImgUri);
        }



    }
}
