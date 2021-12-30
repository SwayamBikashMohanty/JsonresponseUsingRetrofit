package com.example.practiceretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progresBar);

        getCountry();

    }

    public void getCountry() {
        APIInterface api = RetrofitClient.getRetrofitInstance().create(APIInterface.class);
        Call<List<Pojo>> call = api.getcountrydata();
        call.enqueue(new Callback<List<Pojo>>() {
            @Override
            public void onResponse(Call<List<Pojo>> call, Response<List<Pojo>> response) {
                List<Pojo> data = response.body();
                if (data.equals(null)) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.INVISIBLE);
                    for (int i = 0; i < data.size(); i++) {
                        textView.append("\n Country:" + data.get(i).getCountry() + " \n Cases:" + data.get(i).getCases() +
                                "\n continent:" + data.get(i).getContinent() + "\n Active:" + data.get(i).getActive() +
                                "\n Critical:" + data.get(i).getCritical() + "\n Recovered:" + data.get(i).getRecovered() +
                                "\n\n\n");
                    }

                }

            }

            @Override
            public void onFailure(Call<List<Pojo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}