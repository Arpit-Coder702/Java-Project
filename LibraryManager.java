package manager;
import model.*;
import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<User> users=new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public void addUser(User user){
        users.add(user);
    }
    public ArrayList<User>getAllUsers(){
        return users;
    }
    //viewallbooks
    public void viewAllBooks(){
        if(books.isEmpty()){
           System.out.println("Sorry!No Books in the Library at the moment");   
        }
        else{
            for(Book book : books){
            System.out.println(book);
            }
        }
    }
    //getUserByIds
     public User getUserById(int id){
        for(User u : users){
            if(u.getId()==id){
                return u;
            }
        }
         return null;
     }
      public Book getBookById(int id){
        for(Book b : books){
            if(b.getId()==id){
                return b;
            }
        }
         return null;
     }
     public void searchBookByTitle(String keyword){
        boolean found=false;
        String k=keyword.toLowerCase();
        for(Book book:books){
         String bTitle=book.getTitle().toLowerCase();
         if(bTitle.contains(k)){
            System.out.println(book);
            found=true;
         }
        }
        if(found==false){
            System.out.println("No Books Found!");
        }
     }
     public void borrowBook(int bookId,int userId){
          User u=getUserById(userId);
          Book b=getBookById(bookId);
          if(u != null&& b != null && b.getAvailableCopies()>0){
            b.decreaseCopies();
            u.borrowBook(bookId);
            System.out.println("Yay! Book Borrowed Successfully");
          }
          else{
            System.out.println("Oh No! Unable to Borrow Book");
          }
     }
     public void returnBook(int bookId,int userId){
          User u=getUserById(userId);
          Book b=getBookById(bookId);
          if(u != null&& b != null && b.getAvailableCopies()>0){
            b.increaseCopies();
            u.returnBook(bookId);
            System.out.println("Awesome! Book Returned Successfully");
          }
          else{
            System.out.println("Oh No! Unable to Return Book");
          }
     }
     
}