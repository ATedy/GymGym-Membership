package com.fitness;
import java.util.Date;

public class Student{
  private Boolean isHoursConfirmed;
  private Date letterReceived;

  public Student( Boolean isHoursConfirmed, Date letterReceived) {

    this.isHoursConfirmed = isHoursConfirmed;
    this.letterReceived = letterReceived;
  }

  public Boolean getStudentHoursConfirmation() {
    return isHoursConfirmed;
  }

  public Date getLetterReceived() {
    return letterReceived;
  }
}
