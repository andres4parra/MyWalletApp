package com.andresparra.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;



public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> ListAccountRV = new ArrayList<>();
    private RecyclerView rvListAccount;
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount= findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(ListAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new linearLayoutManager(rvListAccount));



    }

    private void loadFakeData() {
    }

    private void loadFackeData(){
        Account myAccount1 = new Account("Bancolombia","Cuenta Corriente", 1000012.0,"https://centralesderiesgo.com/wp-content/uploads/logo-bancolombia-2-1.png");
        Account myAccount2 = new Account("Davivienda","Cuenta Ahorros", 1000012.0,"https://paseosanrafael.com/wp-content/uploads/2013/06/1200px-Davivienda_logo.svg.png");
        Account myAccount3 = new Account("Bogota","Cuenta Corriente", 1000012.0,"https://logosandtypes.com/wp-content/uploads/2020/06/banco-de-bogota.png");
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);
    }
}