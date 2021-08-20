package com.ripalay.lesson_31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<Country> countries = new ArrayList<>();


        Country russia = new Country(R.drawable.ic_ru, "Россия", "Москва");
        Country belarus = new Country(R.drawable.ic_be, "Беларусь", "Минск");

        Country deutsch = new Country(R.drawable.ic_de_3x, "Германия", "Берлин");
        Country olkrain = new Country(R.drawable.ic_ua, "Украина", "Киев");

        Country kyrgyzstan = new Country(R.drawable.ic_ky, "Кыргызстан", "Бишкек");
        Country chill = new Country(R.drawable.ic_chill, "Чилли", "Сантьяго");

        Country usa = new Country(R.drawable.ic_us, "Америка", "Вашингтон");

        Country kazakhstan = new Country(R.drawable.ic_kz, "Казахстан", "Астана");

        Country korea = new Country(R.drawable.ic_korea, "Корея", "Сеул");

        Country british = new Country(R.drawable.ic_br, "Англия", "Лондон");

        Country portugal = new Country(R.drawable.ic_portugal, "Португалия", "Лиссабон");
        Country brazilia = new Country(R.drawable.ic_brazilia, "Бразилия", "Бразилиа");

        Country belgium = new Country(R.drawable.ic_bel, "Бельгия", "Брюссель");
        Country spanish = new Country(R.drawable.ic_spain, "Испания", "Мадрид");
        Country gruzia = new Country(R.drawable.ic_gruzin, "Грузия", "Тбилиси");






        countries.add(russia);
        countries.add(belarus);
        countries.add(deutsch);
        countries.add(olkrain);
        countries.add(kyrgyzstan);
        countries.add(usa);
        countries.add(kazakhstan);
        countries.add(korea);
        countries.add(portugal);
        countries.add(brazilia);
        countries.add(british);


        countries.add(gruzia);
        countries.add(belgium);
        countries.add(spanish);
        countries.add(chill);

        adapter = new CountryAdapter();
        adapter.setData(countries);
        recyclerView.setAdapter(adapter);

    }
}