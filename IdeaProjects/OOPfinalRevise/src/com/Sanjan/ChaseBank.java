package com.Sanjan;

/**
 * Created by sanja on 1/2/2017.
 */
class PncBank extends Bank{

    private String bankName;

    public PncBank(String name, Customer customer, String establisheddate, int totalEmployees, String bankName) {
        super(name, customer, establisheddate, totalEmployees);
        this.bankName = bankName;
    }


    public String getBankName() {
        return this.bankName;
    }
}





public class ChaseBank extends Bank {

    private String bankName;

    public ChaseBank(String name, Customer customer, String establisheddate, int totalEmployees) {
        super(name, customer, establisheddate, totalEmployees);
    }

    public String getBankName() {
        return this.bankName;
    }

}

class WellsFargoBank extends Bank {

    private String bankName;

    public WellsFargoBank(String name, Customer customer, String establisheddate, int totalEmployees) {
        super(name, customer, establisheddate, totalEmployees);
    }

    public String getBankName() {
        return this.bankName;
    }

}

