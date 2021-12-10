package com.aymen.tit;

public class Profile {
    private int id;
    private String code;
    private String libele;

    private static int number = 1;

    public Profile(String code, String libele) {
        this.id = number++;
        this.code = code;
        this.libele = libele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Profile.number = number;
    }
}
