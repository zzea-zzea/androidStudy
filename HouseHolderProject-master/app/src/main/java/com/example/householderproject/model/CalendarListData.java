package com.example.householderproject.model;

public class CalendarListData {

    private String date;
    private String credit;//edttext
    private String detail;//rdobutton
    private String category;//spinner
    private String location;

    //alert 에서 저장 할 생성자
    public CalendarListData(String date, String credit, String detail, String category, String location) {

        this.date = date;
        this.credit = credit;
        this.detail = detail;
        this.category = category;
        this.location = location;

    }

    //문자를 받아오면 저장 할 생성자
    public CalendarListData(String date, String credit, String detail, String location) {
        this.date = date;
        this.credit = credit;
        this.detail = detail;
        this.location = location;
    }

    public CalendarListData(String credit, String detail, String category) {
        this.credit = credit;
        this.detail = detail;
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
