package com.example.demo.beans;

public class Mensaje {
    private String message="";
    private String to="";
    private String from="";
    private int timeToLifeSec;
    private Mensaje(String message, String to, String from, int timeToLifeSec) {
        this.message = message;
        this.to = to;
        this.from = from;
        this.timeToLifeSec = timeToLifeSec;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getTimeToLifeSec() {
        return timeToLifeSec;
    }

    public void setTimeToLifeSec(int timeToLifeSec) {
        this.timeToLifeSec = timeToLifeSec;
    }
}
