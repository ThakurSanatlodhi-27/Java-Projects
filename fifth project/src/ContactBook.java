import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private ArrayList<Contact> contacts=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void start() {
        int choice;
        do {
            System.out.println("WELCOME TO 👏👏👏....📞 CONTACT BOOK MENU 📞");
            System.out.println("1. ADD CONTACT");
            System.out.println("2. VIEW CONTACT");
            System.out.println("3. SEARCH CONTACT");
            System.out.println("4. DELETE CONTACT");
            System.out.println("5. EXIT");
            System.out.println("enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addContact();

                case 2 -> viewContact();

                case 3 -> searchContact();

                case 4 -> deleteContact();

                case 5 -> System.out.println("Exiting contact .....");

                default -> System.out.println("invalid choice ! ");

            }


        } while (choice!=5);

        }
        private void addContact(){
        System.out.println("enter the name: ");
        String name=sc.nextLine();
        System.out.println("enter phoneNumber: ");
        String phoneNumber=sc.nextLine();
        System.out.println("enter the email: ");
        String email=sc.nextLine();
        contacts.add(new Contact(name,phoneNumber,email));
        System.out.println("new Contact Added: ");
    }
    private void viewContact(){
        if(contacts.isEmpty()){
            System.out.println("no contact found");
        }else{
            contacts.forEach(System.out::println);
        }

    }
    private void searchContact(){
        System.out.println("enter name to search the contact");
        String name=sc.nextLine();
        contacts.stream().filter(c->c.getName().equalsIgnoreCase(name)).forEach(System.out::println);

    }
    private void deleteContact(){
        System.out.println("enter name to delete the contact:");
        String name=sc.nextLine();
        contacts.removeIf(contact->contact.getName().equalsIgnoreCase(name));
        System.out.println("contact deleted if existed");

    }
}
