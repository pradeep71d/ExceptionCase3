package com.example.javaaademos3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            System.out.println("A");
            int num = 98 / 0;
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } catch (Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
        System.out.println("F");
    }// o/p:ACEF
}
