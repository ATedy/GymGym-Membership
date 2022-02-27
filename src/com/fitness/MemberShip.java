package com.fitness;

public class MemberShip {
  private int memberShipNumber;
  private Boolean isStudent = false;
  private Boolean isMember = false;


  public int setMemberShipNumber(int memberShipNumber) {
    this.memberShipNumber = memberShipNumber;

    return 1;
  }

  // Checking for a member
  public int memberShipSetter() {

     if(isMember){
       return getMemberShipNumber();

     }
     // new member
     else{
      return setMemberShipNumber(memberShipNumber);
     }
  }

  public int getMemberShipNumber() {
    return memberShipNumber;
  }

  public Boolean getIsStudent() {
    return isStudent;
  }

  public void setIsStudent(Boolean isStudent) {
    this.isStudent = isStudent;
  }

  public Boolean getMember() {
    return isMember;
  }

  public void setMember(Boolean member) {
    isMember = member;
  }
}
