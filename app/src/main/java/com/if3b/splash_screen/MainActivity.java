package com.if3b.splash_screen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvIndomaret;
    private ArrayList<ModelIndomaret> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIndomaret = findViewById(R.id.rv_indomaret);
        rvIndomaret.setHasFixedSize(true);

        data.addAll(DataIndomaret.ambilDataIndomaret());
        tampilDataIndomaret();
    }

    private void tampilDataIndomaret(){
        AdapterIndomaret AP = new AdapterIndomaret(data, MainActivity.this);

        rvIndomaret.setLayoutManager(new LinearLayoutManager(this));
        rvIndomaret.setAdapter(AP);
    }

    private void tampilDataGrid(){
        AdapterGrid AG = new AdapterGrid(data, MainActivity.this);

        rvIndomaret.setLayoutManager(new GridLayoutManager(this, 2));
        rvIndomaret.setAdapter(AG);
    }

    private void tampilAbout(){
        about_card AC = new about_card();

        rvIndomaret.setLayoutManager(new LinearLayoutManager(this));
        rvIndomaret.setAdapter(AC);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tampilan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_card:
                tampilDataIndomaret();
                break;
            case R.id.menu_grid:
                tampilDataGrid();
                break;

            case R.id.menu_about:
                tampilAbout();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}