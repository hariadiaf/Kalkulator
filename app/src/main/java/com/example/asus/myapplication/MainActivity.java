package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Bil1, Bil2;
    Button Tambah, Kurang, Bagi, Kali;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bil1 = (EditText) findViewById(R.id.edtBil1);
        Bil2 = (EditText) findViewById(R.id.edtBil2);
        Tambah = (Button) findViewById(R.id.btnTambah);
        Kurang = (Button) findViewById(R.id.btnKurang);
        Kali = (Button) findViewById(R.id.btnKali);
        Bagi = (Button) findViewById(R.id.btnBagi);
        Hasil = (TextView) findViewById(R.id.txtHasil);
    }

    public void Plus(View view) {
        String txtBil1 = Bil1.getText().toString();
        String txtBil2 = Bil2.getText().toString();
       double bil1 = Double.parseDouble(txtBil1);
       double bil2 = Double.parseDouble(txtBil2);
        Double hasil = bil1+bil2;
        Hasil.setText(Double.toString(hasil));
        Bil1.setText("");
        Bil2.setText("");
    }

    public void Minus(View view) {

        String txtBil1 = Bil1.getText().toString();
        String txtBil2 = Bil2.getText().toString();
        double bil1 = Double.parseDouble(txtBil1);
        double bil2 = Double.parseDouble(txtBil2);
        double hasil = bil1-bil2;
        Hasil.setText(Double.toString(hasil));
        Bil1.setText("");
        Bil2.setText("");
    }

    public void Times(View view) {
        Bil1.setText("");
        Bil2.setText("");
        String txtBil1 = Bil1.getText().toString();
        String txtBil2 = Bil2.getText().toString();
        double bil1 = Double.parseDouble(txtBil1);
        double bil2 = Double.parseDouble(txtBil2);
        double hasil = bil1*bil2;
        Hasil.setText(Double.toString(hasil));
        Bil1.setText("");
        Bil2.setText("");
    }

    public void Divide(View view) {
        Bil1.setText("");
        Bil2.setText("");
        String txtBil1 = Bil1.getText().toString();
        String txtBil2 = Bil2.getText().toString();
        double bil1 = Double.parseDouble(txtBil1);
        double bil2 = Double.parseDouble(txtBil2);
        double hasil = bil1/bil2;
        Hasil.setText(Double.toString(hasil));
        Bil1.setText("");
        Bil2.setText("");
    }
}
