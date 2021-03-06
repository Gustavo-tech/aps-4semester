package model.bean;

public class Author {
  private Integer id;
  private String name;
  private String fName;

  public Author() {
      
  }
  
  public Author(String name, String fName) { 
    this.name = name;
    this.fName = fName;
  }
  
  public Author(Integer id, String name, String fName) {
      this.id = id;
      this.name = name;
      this.fName = fName;
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFName() {
    return this.fName;
  }

  public void setFName(String fName) {
    this.fName = fName;
  }
  
  public void setId (Integer id) {
    this.id = id;
  }

    @Override
    public String toString() {
        return getName() + " " + getFName(); //To change body of generated methods, choose Tools | Templates.
    }
  
  
}