package com.fitness;

public class Consent {

  private Boolean consent;

  public Consent(Boolean consent) {
    this.consent = consent;

  }
  public Boolean getIsAgreed() {
    return consent;
  }

  public void setIsAgreed(Boolean consent) {
    this.consent = consent;
  }



}
