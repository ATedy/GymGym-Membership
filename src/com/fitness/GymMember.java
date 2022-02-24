package com.fitness;

public class GymMember {
  private String title;
  private String fullName;
  private int dateOfBirth;


  public GymMember(String title, String fullName, int dateOfBirth) {
    this.title = title;
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
  }


  public String getTitle() {
    return title;
  }

  public String getFullName() {
    return fullName;
  }

  public int getDateOfBirth() {
    return dateOfBirth;
  }
}
