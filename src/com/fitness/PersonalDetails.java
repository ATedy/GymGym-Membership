package com.fitness;

import java.util.Date;

public class PersonalDetails {

  private String title;
  private String fullName;
  private Date dateOfBirth;
  private String postCode;
  private String phone;
  private String workPhone;
  private String email;


  public PersonalDetails(String title, String fullName, Date dateOfBirth, String postCode, String phone,
      String workPhone, String email) {
    this.title = title;
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.postCode = postCode;
    this.phone = phone;
    this.workPhone = workPhone;
    this.email = email;
  }

  public String getTitle() {
    return title;
  }

  public String getFullName() {
    return fullName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public String getPostCode() {
    return postCode;
  }

  public String getPhone() {
    return phone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getEmail() {
    return email;
  }

}


