package com.fitness;

import java.util.Date;

public class Consent {
  private String signature;
  private Date date;

  public Consent() {
  }

  public Consent(String signature, Date date) {
    this.signature = signature;
    this.date = date;
  }

  public String getSignature() {
    return signature;
  }


  public Date getDate() {
    return date;
  }

}
