package model;

public class Publisher {
    private int id;
    private String name;
    private String url;
    
    public Publisher(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Publisher(int publisherId, String name, String url) {
        this.id = publisherId;
        this.name = name;
        this.url = url;
    }
    
    public Publisher() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int publisherId) {
        this.id = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
