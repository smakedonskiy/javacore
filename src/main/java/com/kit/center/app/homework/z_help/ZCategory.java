package com.kit.center.app.homework.z_help;

import java.util.ArrayList;


public class ZCategory {
  private String name;
  private ArrayList<ZLine> lines = new ArrayList<>();

  public ZCategory(String name) {
    this.name = name;
  }

  public void createLine(String lineName, int phoneNumber){
    lines.add(new ZLine(lineName, phoneNumber));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<ZLine> getLines() {
    return lines;
  }

  public void setLines(ArrayList<ZLine> lines) {
    this.lines = lines;
  }

  public void showHelp() {
    String helpMessage = "\nZCategory \"" + name + "\"\n" +
            "0 - exit\n" +
            "1 - list of contacts\n" +
            "2 - create contact\n" +
            "3 - ";
    System.out.println(helpMessage);
  }
}
