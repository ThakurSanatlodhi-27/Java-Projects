import java.util.Scanner;

public class UnitConvertor{
    public static double kmToMiles(double km){
        return km*0.62137;
    }
    public static double milesToKm(double mile){
        return mile*1.6093;
    }
    public static double calTofrn(double cal){
        return (cal*9/5)+32;
    }
    public static double frnToCal(double frn){
        return (frn-32)*5/9;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("unit convertor");
        System.out.println("1. KiloMeter To Miles");
        System.out.println("2. Miles To Kilometer");
        System.out.println("3. Celsius To Fahrenheit");
        System.out.println("4. Fahrenheit To Celsius");
        System.out.print("choose conversion from (1-4): ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.print("Enter Kilomiter : ");
            double km=sc.nextDouble();
            System.out.printf("%.2f km = %.2f Miles ",km,kmToMiles(km));
            break;
            case 2:System.out.print("Enter miles : ");
            double mile=sc.nextDouble();
            System.out.printf("%.2f Miles= %.2f Kilometer",mile,milesToKm(mile));
            break;
            case 3:System.out.print("Enter Celsius : ");
            double cal=sc.nextDouble();
            System.out.printf("%.2f celsius = %.2f fahrenheit",cal,calTofrn(cal));
            break;
            case 4:System.out.print("Enter fahrenheit : ");
            double frn=sc.nextDouble();
            System.out.printf("%.2f fahrenheit = %.2f celsius",frn,frnToCal(frn));
            break;
            default:System.out.println("Invalid option");

        }
        sc.close();




    }

}