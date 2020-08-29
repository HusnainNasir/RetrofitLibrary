package com.example.retrofitlibrary.Model;

public class Posts {
    private int id;

    private String title;

    private String body;

    private int userId;

    public Posts(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public Integer getId ()
    {
        return id;
    }

    public void setId (Integer id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public int getUserId ()
    {
        return userId;
    }

    public void setUserId (int userId)
    {
        this.userId = userId;
    }

}
