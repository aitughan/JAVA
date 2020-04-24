package com.company;



public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    private String password;
    private String date;
    private String gender;
    private static int i = 0;
    public User(String f, String l, int a, String g, String p, String d) {
        setFirstName(f);
        setLastName(l);
        setAge(a);
        setGender(g);
        setPassword(p);
        setDate(d);
        setId(i);
        i++;
    }
    public void setFirstName(String fname) {
        firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lname) {
        lastName = lname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age){
       this.age=age;
    }
    public int getAge(){
        return age;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void checkPassword(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void checkId(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void checkDate(){

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printAll() {
        System.out.println("Firstname: "+getFirstName());
        System.out.println("Secondtname: "+getLastName());
        System.out.println("ID: "+getId());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Password: "+getPassword());
        System.out.println("Birth date: "+getDate());
    }
}