package com.fitness;

import java.util.Date;

public class Student extends GymMember{
  private int studentHoursConfirmation;
  private Date letterReceived;

  public Student(String title, String fullName, int dateOfBirth, int studentHoursConfirmation,
      Date letterReceived) {
    super(title, fullName, dateOfBirth);
    this.studentHoursConfirmation = studentHoursConfirmation;
    this.letterReceived = letterReceived;
  }


  public int getStudentHoursConfirmation() {
    return studentHoursConfirmation;
  }

  public Date getLetterReceived() {
    return letterReceived;
  }
}
