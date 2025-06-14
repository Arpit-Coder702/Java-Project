package model;

import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private String username;
    private String password;
    private boolean isAdmin;
    private ArrayList<Integer>borrowedBookIds=new ArrayList<>();
    //constructor
    public User(int userId,String name,String username,String password,boolean isAdmin){
        this.userId=userId;
        this.name=name;
        this.username=username;
        this.password=password;
        this.isAdmin=isAdmin;
    }
    //getters
    public int getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public boolean getIsAdmin(){
        return isAdmin;
    }
//borrowbook
public void borrowBook(int bookId){
    borrowedBookIds.add(bookId);
}
//returnbook
public void returnBook(int bookId){
    borrowedBookIds.remove(bookId);
}
public void showBorrowedBooks(){
    if(borrowedBookIds.isEmpty()){
        System.out.println("You have not Borrowed any Books");
    }
    else{
        System.out.println("Borrowed Book IDs:"+borrowedBookIds);
    }
}
}