package com.andresparra.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> ListAccountRV = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
    }

    private void loadFackeData(){
        Account myAccount1 = new Account("Bancolombia","Cuenta Corriente", 1000012.0);
        Account myAccount2 = new Account("Davivienda","Cuenta Ahorros", 1000012.0);
        Account myAccount3 = new Account("Bogota","Cuenta Corriente", 1000012.0);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}