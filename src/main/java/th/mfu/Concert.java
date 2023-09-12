package th.mfu;

import java.util.Date;

public class Concert {

    // private static int nextId = 1;

    private int id;
    private String title;
    private String performer;
    private Date date;
    private String description;

    public Concert() {
        // this.id = nextId++;
    }

    public Concert(String title, String description) {
        // this();
        this.title = title;
        this.description = description;
    }

    // Getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public void put(int nextId2, Concert concert) {
    // }
}
