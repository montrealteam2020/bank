package com.pnc.ibm.models;

public class Transactions {

    Long id;
    private  String accountNumber;
    private  Long transactionTs;
    private  String type;
    private  double amount;

    public Transactions(Long id,String accountNumber,Long transactionTs,String type,double amount){
        this.id=id;
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.transactionTs=transactionTs;
        this.type=type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getTransactionTs() {
        return transactionTs;
    }

    public void setTransactionTs(Long transactionTs) {
        this.transactionTs = transactionTs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
