package com.andresparra.mywalletapp;

public class Account {

    private String name;
    private String typeAccount;
    private Double currentValue;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String imageUrl;


    public Account(String name, String typeAccount, Double currentValue, String imageUrl) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
