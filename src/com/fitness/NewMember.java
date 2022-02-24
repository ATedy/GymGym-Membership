package com.fitness;

public class NewMember extends GymMember{
  private int memberShipNumber;

  public NewMember(String title, String fullName, int dateOfBirth, int memberShipNumber) {
    super(title, fullName, dateOfBirth);
    this.memberShipNumber = memberShipNumber;
  }


  public int getMemberShipNumber() {
    return memberShipNumber;
  }
}
