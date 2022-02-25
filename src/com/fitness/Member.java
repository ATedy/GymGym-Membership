package com.fitness;

public class Member extends GymMember{
  private int memberShipNumber;

  public Member(String title, String fullName, int dateOfBirth, int memberShipNumber) {
    super(title, fullName, dateOfBirth);
    this.memberShipNumber = memberShipNumber;
  }


  public int getMemberShipNumber() {
    return memberShipNumber;
  }
}
