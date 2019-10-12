package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    private EditText edtLambat, edtHadir;
    private Button btnHitung;
    private TextView txtGaji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        // kenalkan komponen-komponen yang ada di layout activity_main
        edtLambat = (EditText) findViewById(R.id.edt_lambat);
        edtHadir = (EditText) findViewById(R.id.edt_hadir);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtGaji = (TextView) findViewById(R.id.txt_gaji);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        // berikan action button hitung untuk menghitung hasil
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lambat, hadir;
                lambat = edtLambat.getText().toString();
                hadir = edtHadir.getText().toString();
                // TextUtils berfungsi supaya ketika EditText nya tidak terisi (Kosong) Maka
                // nanti akan muncul notifikasi "tidak boleh kosong"
                if (TextUtils.isEmpty(lambat)) {
                    edtLambat.setError("Tidak Boleh Kosong!!!");
                    edtLambat.requestFocus();
                } else if (TextUtils.isEmpty(hadir)) {
                    edtHadir.setError("Tidak Boleh Kosong!!!");
                    edtHadir.requestFocus();
                } else {
                    // Masukan Rumus untuk menghitung Panjang dan juga lebar nya
                    int l = Integer.parseInt(lambat);
                    int h = Integer.parseInt(hadir);
                    int g = 4000000;
                    int p = 200000;
                    int t = 300000;
                    int m = 300000;
                    int hasil = g + t + m - p - (l * 50000) - (h * 75000);
                    // Kemudian Hasil di tampilkan di TextView
                    txtGaji.setText("Hasil Gaji  : Rp " + hasil+",00");
                }

            }
        });
    }

}
