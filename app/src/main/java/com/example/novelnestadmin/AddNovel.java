package com.example.novelnestadmin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class AddNovel extends AppCompatActivity {
    private TextInputEditText novelTitle_input, novelAuthor_input, novelLanguage_input, novelPublishDate_input, novelIsbn_input, novelGenre_input, novelPublisher_input, novelDescription_input;
    private ImageView imageViewAdd, imageViewShow;
    private Button buttonAddNovel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_novell);

        novelTitle_input = findViewById(R.id.novelTitle_input);
        novelAuthor_input = findViewById(R.id.novelAuthor_input);
        novelLanguage_input = findViewById(R.id.novelLanguage_input);
        novelPublishDate_input = findViewById(R.id.novelPublishDate_input);
        novelIsbn_input = findViewById(R.id.novelIsbn_input);
        novelGenre_input = findViewById(R.id.novelGenre_input);
        novelPublisher_input = findViewById(R.id.novelPublisher_input);
        novelDescription_input = findViewById(R.id.novelDescription_input);
        imageViewAdd = findViewById(R.id.imageViewAdd);
        imageViewShow = findViewById(R.id.imageViewShow);
        buttonAddNovel = findViewById(R.id.buttonAddNovel);


    }
}