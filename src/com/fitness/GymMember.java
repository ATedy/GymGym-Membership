package com.fitness;

import java.util.Date;

public class GymMember extends MemberShip{
  private PersonalDetails personalDetails;
  private Payment payment;
  private Consent consent;
  private Student student;

  public PersonalDetails getPersonalDetails() {
    personalDetails = new PersonalDetails("Mr", "ABCD", new Date(), "1234", "123456789", "123456789", "abcd@gmail.com");
    return personalDetails;

  }
  public Payment getPayment(){
    payment = new Payment(500.00, 25, new Date(), 100, new Date());
    return payment;
  }

  public Consent consent(){
    consent = new Consent(true);
    return consent;
  }

  public Student student(){
    if(getIsStudent()){
      student = new Student(true, new Date());
    }
    return student;
  }

  public void createMember(){
    // for creating a student member
    if(getIsStudent()){
      System.out.println("Student gym member created");

    }
    // for a regular member
    System.out.println("Gym Member created");
  }

}
