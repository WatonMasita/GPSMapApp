package com.example.gpsmapapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonMostrarUbicacion;
    Button buttonGoogleMap;
    Button buttonDescargarImagen;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botón para mostrar la ubicación actual (En emulador sera simulado entonces puede aparecer en el mar o en estados unidos.
        // si lo ejecuta en su dispositivo fisico le mostrara su ubicacion actual, en mi caso fue en mi domicilio.
        buttonMostrarUbicacion = findViewById(R.id.button);
        buttonMostrarUbicacion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, map.class);
            startActivity(intent);
        });

        // Botón para mostrar el mapa con ubicación predefinida (Santo Tomas)
        buttonGoogleMap = findViewById(R.id.button2);
        buttonGoogleMap.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapaLugar.class);
            startActivity(intent);
        });

        // Botón y ImageView para descargar imagen
        buttonDescargarImagen = findViewById(R.id.buttonDescargarImagen);
        imageView = findViewById(R.id.imageView);

        buttonDescargarImagen.setOnClickListener(v -> {
            String urlImagen = "https://i.imgur.com/8iI8rbA.png";

            // Hilo secundario para descargar la imagen
            new Thread(() -> {
                try {
                    java.net.URL url = new java.net.URL(urlImagen);
                    final Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());

                    // Actualiza la ImageView en el hilo principal
                    runOnUiThread(() -> imageView.setImageBitmap(bitmap));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        });
    }
}
