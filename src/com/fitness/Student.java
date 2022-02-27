package com.fitness;
import java.util.Date;

public class Student{
  private Boolean studentHoursConfirmation;
  private Date letterReceived;

  public Student( Boolean studentHoursConfirmation, Date letterReceived) {

    this.studentHoursConfirmation = studentHoursConfirmation;
    this.letterReceived = letterReceived;
  }

  public Boolean getStudentHoursConfirmation() {
    return studentHoursConfirmation;
  }

  public Date getLetterReceived() {
    return letterReceived;
  }
}
