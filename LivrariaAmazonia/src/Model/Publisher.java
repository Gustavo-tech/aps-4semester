package Model;

public class Publisher {
    private int publisherId;
    private String name;
    private String url;

    public Publisher(int publisherId, String name, String url) {
        this.publisherId = publisherId;
        this.name = name;
        this.url = url;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
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
