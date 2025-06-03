package com.micserv.microservice1_userservice.model;

public class bookinfo {

    Long id;
    String bookname;
    int copiesavailable;
    int price;
    String category;

    public bookinfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getCopiesavailable() {
        return copiesavailable;
    }

    public void setCopiesavailable(int copiesavailable) {
        this.copiesavailable = copiesavailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
