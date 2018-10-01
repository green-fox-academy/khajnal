package com.greenfoxacademy.week09day1.models;

import java.util.List;

public class Entries {

  private List<Log> entries;
  private static int entryCount;

  public Entries() {
  }

  public Entries(List<Log> entries, int entryCount) {
    this.entries = entries;
    this.entryCount++;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }

  public void addLog(Log log) {
    entries.add(log);
  }
}