package com.fitness;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {

  private BigDecimal annualPayment;
  private  BigDecimal firstMonthPayment;
  private Date dateJoined;
  private BigDecimal dDAmount;
  private Date firstInstallmentDue;

  public Payment() {
  }

  public Payment(BigDecimal annualPayment, BigDecimal firstMonthPayment, Date dateJoined, BigDecimal dDAmount,
      Date firstInstallmentDue) {
    this.annualPayment = annualPayment;
    this.firstMonthPayment = firstMonthPayment;
    this.dateJoined = dateJoined;
    this.dDAmount = dDAmount;
    this.firstInstallmentDue = firstInstallmentDue;
  }


  public BigDecimal getAnnualPayment() {
    return annualPayment;
  }

  public BigDecimal getFirstMonthPayment() {
    return firstMonthPayment;
  }

  public Date getDateJoined() {
    return dateJoined;
  }

  public BigDecimal getdDAmount() {
    return dDAmount;
  }

  public Date getFirstInstallmentDue() {
    return firstInstallmentDue;
  }

}
