package com.fitness;

import java.util.Date;

public class Student{
  private int studentHoursConfirmation;
  private Date letterReceived;

  public Student() {
  }

  public Student( int studentHoursConfirmation, Date letterReceived) {

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
