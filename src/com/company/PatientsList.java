package com.company;

public class PatientsList {
    private Patient[] patientsList;
    private int counter;
    private int idCounter = 0;

    public PatientsList(int max) {
        this.patientsList = new Patient[max];
        this.counter = 0;
    }

    public void Insert(String name, String poBatkovi,
                       String adress, String phone, long medCardNumber, String illness, String prizvizhe) {
        if (this.counter < this.patientsList.length) {
            this.patientsList[counter] = new Patient();
            this.patientsList[counter].setId(++this.idCounter);
            this.patientsList[counter].setName(name);
            this.patientsList[counter].setPoBatkovi(poBatkovi);
            this.patientsList[counter].setPrizvizhe(prizvizhe);
            this.patientsList[counter].setAdress(adress);
            this.patientsList[counter].setPhone(phone);
            this.patientsList[counter].setMedCardNumber(medCardNumber);
            this.patientsList[counter].setIllness(illness);
            this.counter++;
        } else {
            throw new ArrayStoreException("A little bit number of arguments");
        }
    }

    public void getPatientsList() {
        System.out.println("Список пацієнтів: ");
        for (Patient patient :
                this.patientsList) {
            System.out.println(patient.getId() + " " + patient.getName() + " " + patient.getPoBatkovi() + " " + patient.getPrizvizhe());
        }
    }
}
