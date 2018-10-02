package com.greenfoxacademy.space.models;

public class Clothes {
  private Long id;
  private String item_name;
  private String manufacturer;
  private String category;
  private String size;
  private double unit_price;

  public Clothes() {
  }

  public Clothes(Long id, String item_name, String manufacturer, String category, String size, double unit_price) {
    this.id = id;
    this.item_name = item_name;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unit_price = unit_price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getItem_name() {
    return item_name;
  }

  public void setItem_name(String item_name) {
    this.item_name = item_name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public double getUnit_price() {
    return unit_price;
  }

  public void setUnit_price(double unit_price) {
    this.unit_price = unit_price;
  }
}
