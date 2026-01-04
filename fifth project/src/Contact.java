public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name,String phoneNumber,String email){
        this.name=name;

        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    @Override
    public String toString(){
        return "Name: "+name+"phoneNumber: "+phoneNumber+"Email: "+email;
    }
}
