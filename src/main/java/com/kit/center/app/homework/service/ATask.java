package com.kit.center.app.homework.service;

public abstract class ATask extends AProgram{

  {
    super.name = "* Program name: ";
    super.description = "* Description: ";
  }

  @Override
  public void run() {
    super.run();
    System.out.println();
  }
}
