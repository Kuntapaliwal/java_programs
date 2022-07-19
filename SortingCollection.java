package java_programs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java_programs.MyClassData.Data;

interface Clients {
    double getCharges();

    double calculatePayment(Date invoiceDate);

    void sendEmail(double payment);

}

class Customers implements Clients {
    int id;
    String name;
    String email;
    double charges;
    Date dateOfAgreement;

    public Customers(int id, String name, String email, double charges) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public Date getDateOfAgreement() {
        return dateOfAgreement;
    }

    public void setDateOfAgreement(Date dateOfAgreement) {
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharges() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculatePayment(Date invoiceDate) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void sendEmail(double payment) {
        // TODO Auto-generated method stub

    }

}

class Bussiness implements Clients {
    int id;
    String name;
    String email;
    double charges;
    double gstRate;
    Date dateOfAgreement;

    public Bussiness(int id, String name, String email, double charges, double gstRate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.gstRate = gstRate;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public String toString() {
        return "Bussiness [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double getGstRate() {
        return gstRate;
    }

    public void setGstRate(double gstRate) {
        this.gstRate = gstRate;
    }

    public Date getDateOfAgreement() {
        return dateOfAgreement;
    }

    public void setDateOfAgreement(Date dateOfAgreement) {
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharges() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculatePayment(Date invoiceDate) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void sendEmail(double payment) {
        // TODO Auto-generated method stub

    }

}

public class SortingCollection {

    public static void main(String[] args) {

        Clients customerClient1 = new Customers(001, "jack", "jack@gmail.com", 50000);
        Clients customerClient2 = new Customers(002, "jack", "jack@gmail.com", 50000);

        Clients bussinessClient1 = new Bussiness(0001, "john", "john@gmail.com", 500, 12);
        Clients businessClient2 = new Bussiness(0002, "jack", "jack@gmail.com", 50000, 18);

        List<Clients> customers = new ArrayList<>(Arrays.asList(customerClient1, customerClient2));

        customers.stream().map(e -> e.calculatePayment(new Date(31, 03, 2022))).forEach(System.out::println);

    }

}