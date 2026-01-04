import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String args[]){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int number=rand.nextInt(100)+1;
        int attemp=0;
        int maxAttemp=7;
        System.out.println("guess the number between 1 to 100");
        while(attemp<maxAttemp){
            System.out.print("Attemp"+(attemp+1)+": enter your guess :");
            try{
                int guess=Integer.parseInt(sc.nextLine());
                attemp++;
                if(guess==number){
                    System.out.println("correct sannu you gussesd it finally");
                    break;
                }else if(guess>number){
                    System.out.println("you guessed  large number");

                }else{
                    System.out.println("you guessed  small number");
                }
            }catch(NumberFormatException e){
                System.out.println("plese enter a valid number");
            }

        }if(attemp==maxAttemp){
            System.out.println("out of attemp the number was"+number);
        }
         sc.close();
    }
}