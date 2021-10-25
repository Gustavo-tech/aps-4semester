package Model;

public class Author {
  private Integer id;
  private String name;
  private String fName;

  public Author(String name, String fName) {
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
}