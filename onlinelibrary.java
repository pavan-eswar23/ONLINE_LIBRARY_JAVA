import java.util.Scanner;
class library{
     String[] books;
     int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    public void Issuebook(String book){
       for(int i=0;i<this.books.length;i++) {
        if(this.books[i].equals(book)){
            System.out.println("the Book has Been Issued!");
            this.books[i]=null;
            return;
        }  
       }
       System.out.println("this book doesn't exists");
    }
    public void Returnbook(){
        System.out.print("Returning the book....");
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"Has been added");
    }
    void showavaialblebooks(){
        System.out.println("The Available Books are:");
       for (String book :this.books) {
        if(book==null){
            break;
        }
        System.out.println(" * "+book);
        
       }
    }
}
public class onlinelibrary {
    public static void main(String[] args) {
        library centrallibrary=new library();
        centrallibrary.addbook("OfF MICE AND MEN");
        centrallibrary.addbook("Algorithms");
        centrallibrary.addbook("C++");
        centrallibrary.showavaialblebooks();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name:");
        String book=sc.next();
centrallibrary.Issuebook(book);
    }
    
}
