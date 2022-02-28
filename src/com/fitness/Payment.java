package com.fitness;

import java.util.Date;

public class Payment {

  private double annualPayment;
  private double firstMonthPayment;
  private Date dateJoined;
  private double feesAmount;
  private Date firstInstallmentDue;


  public Payment(double annualPayment, double firstMonthPayment, Date dateJoined, double feesAmount,
      Date firstInstallmentDue) {
    this.annualPayment = annualPayment;
    this.firstMonthPayment = firstMonthPayment;
    this.dateJoined = dateJoined;
    this.feesAmount = feesAmount;
    this.firstInstallmentDue = firstInstallmentDue;
  }

  public double getAnnualPayment() {
    return annualPayment;
  }

  public double getFirstMonthPayment() {
    return firstMonthPayment;
  }

  public Date getDateJoined() {
    return dateJoined;
  }

  public double getdDAmount() {
    return feesAmount;
  }

  public Date getFirstInstallmentDue() {
    return firstInstallmentDue;
  }

}
