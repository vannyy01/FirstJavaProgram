package com.company;

public class Patient {
    private int id = 0;
    private String name = "";
    private String poBatkovi = "";
    private String adress = "";
    private String phone = "";
    private long medCardNumber = 0;
    private String illness = "";
    private String prizvizhe = "";

    public Patient(String name, String poBatkovi,
                   String adress, String phone, long medCardNumber, String illness, String prizvizhe) {
        this.name = name;
        this.poBatkovi = poBatkovi;
        this.adress = adress;
        this.phone = phone;
        this.medCardNumber = medCardNumber;
        this.illness = illness;
        this.prizvizhe = prizvizhe;
    }

    public Patient() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPrizvizhe() {
        return prizvizhe;
    }

    public void setPrizvizhe(String prizvizhe) {
        this.prizvizhe = prizvizhe;
    }


    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public long getMedCardNumber() {

        return medCardNumber;
    }

    public void setMedCardNumber(long medCardNumber) {
        this.medCardNumber = medCardNumber;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {

        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPoBatkovi() {

        return poBatkovi;
    }

    public void setPoBatkovi(String poBatkovi) {
        this.poBatkovi = poBatkovi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
