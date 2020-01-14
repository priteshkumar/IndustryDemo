package com.upgrad.industrydemo;

public class ProductV2 extends StorableWebObject {

  private String name;
  private BrandV2 brand;
  private String description;

  public ProductV2(BrandV2 brand, String name) {
    super(name);
    this.name = name;
    this.brand = brand;
    generateUUID();
  }
  
  public String getName() {
    return name;
  }

  public BrandV2 getBrand() {
    return brand;
  }
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /** Overriding the implementation of generateUUID **/
  @Override
  protected void generateUUID() {
    //System.out.println("generateUUID of subclass called");
    if(this.uuid == null) {
      super.generateUUID();
    }
    if (this.brand != null) {
      this.uuid = this.brand.getUUID() + "-" + this.uuid;
    }
  }

  @Override
  public void preUpdate() {
    super.generateUUID();
    super.updateLastUpdated();
  }

  @Override
  public void preInsert() {
    super.generateUUID();
    super.updateLastUpdated();
  }
}
