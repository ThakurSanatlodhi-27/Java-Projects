import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    static List<Book> books=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            System.out.println("LIBRARY MENU : ");
            System.out.println("1. add Book");
            System.out.println("2. view all books");
            System.out.println("3. Issue book");
            System.out.println("4. return book");
            System.out.println("EXIT");
            System.out.print("choose an option : ");
            int chose=sc.nextInt();
            sc.nextLine();

            switch(chose){
                case 1-> addBook();
                case 2->viewBook();
                case 3->issueBook();
                case 4->returnBook();
                case 5->{
                    System.out.println("existing......");

                return;}
                default->System.out.println("invalid choice");
            }



        }
    }
    static void addBook(){
        System.out.println("enter book title: ");
        String title=sc.nextLine();
        System.out.println("enter author name");
        String author=sc.nextLine();
        books.add(new Book(title,author));
        System.out.println("BOOK ADDED SUCESSFULLY");

    }

    static void viewBook(){
        if(books.isEmpty()){
            System.out.println("no books in library");
            return;
        }
        System.out.println("Book list: ");
        for(Book b:books){
            System.out.println(b);
        }
    }

    static void issueBook(){
        System.out.println("enter book title to issue: ");
        String title=sc.nextLine();
        for(Book b:books){
            if(b.title.equalsIgnoreCase(title)&&!b.isIssued){
                b.isIssued=true;
                System.out.println("book is issued.");
                return;
            }
        }
        System.out.println("book not available or already issued");
    }

    static void returnBook(){
        System.out.println("enter book titile to return book: ");
        String title=sc.nextLine();
        for(Book b:books){
            if(b.title.equalsIgnoreCase(title)&&b.isIssued){
                b.isIssued=false;
                System.out.println("book returned");
                return;
            }

        }
        System.out.println("book not find or not issued");
    }
}
