package com.example.myapplication9;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView profileImage;
    public EditText matriculeInput, nomInput, prenomInput;
    public Button ajouterButton, supprimerButton, chercherButton, afficherTousButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        profileImage = findViewById(R.id.profile_image);
        matriculeInput = findViewById(R.id.matricule_input);
        nomInput = findViewById(R.id.nom_input);
        prenomInput = findViewById(R.id.prenom_input);
        ajouterButton = findViewById(R.id.ajouter_button);
        supprimerButton = findViewById(R.id.supprimer_button);
        chercherButton = findViewById(R.id.charcher_button);
        afficherTousButton = findViewById(R.id.afficher_button);

        // Set onClickListeners for buttons
        ajouterButton.setOnClickListener(v -> {
            String matricule = matriculeInput.getText().toString();
            String nom = nomInput.getText().toString();
            String prenom = prenomInput.getText().toString();

            // Add data handling logic here
            Toast.makeText(this, "Added: " + matricule + ", " + nom + ", " + prenom, Toast.LENGTH_SHORT).show();
        });

        supprimerButton.setOnClickListener(v -> {
            // Add delete logic here
            Toast.makeText(this, "Deleted entry", Toast.LENGTH_SHORT).show();
        });

        chercherButton.setOnClickListener(v -> {
            // Add search logic here
            String matricule = matriculeInput.getText().toString();
            Toast.makeText(this, "Searching for: " + matricule, Toast.LENGTH_SHORT).show();
        });

        afficherTousButton.setOnClickListener(v -> {
            // Add display all logic here
            Toast.makeText(this, "Displaying all entries", Toast.LENGTH_SHORT).show();
        });
    }
}

