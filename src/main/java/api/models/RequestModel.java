package api.models;

import java.sql.Date;

public class RequestModel {
    private int id; 
    private String name;
    private Date date;
    private String description;
    private String type;
    public RequestModel() {
    }
    public RequestModel(int id, String name, Date date, String description, String type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.description = description;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}


