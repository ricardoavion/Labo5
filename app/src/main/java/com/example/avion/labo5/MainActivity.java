package com.example.avion.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Planetas> planetasList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llenando la lista de planetas
        planetasList = fillList();

        //setting the recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager()


    }
    private ArrayList<Planetas> fillList(){
        ArrayList<Planetas> l = new ArrayList<>();
        String desc = "Esto es una descripci[on ejemplo para los cardviews de la practica de laboratorio de dispositivos moviles";
        l.add(new Planetas(1,"Ella", desc));
        return l;
    }
}
