package com.sample.core.bean;

public class Seminar {
  private SeminarDescription description;
  private String days;
  private String time;
  private int seminarID;
  private int slotsLeft;

  public Seminar(SeminarDescription description) {
    this.description = description;
  }
}
// getters and setters disini
