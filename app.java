import src.*;
import java.util.Scanner;
public class app{
        
    public static void main(String[]args){
        String customer, location, destination;
        int choice, weight, distance;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name = ");
        customer = scan.next();
        System.out.print("Input location = ");
        location = scan.next();
        System.out.println("\f");
        System.out.print("===========\nTaxi Bike\n===========");
        System.out.print("\n1. Ride\n2.Send\n\nInput your Choice = ");
        choice = scan.nextInt();
        System.out.println("\f");
        switch(choice){
            case 1:
                System.out.println("===========\nRide Menu\n===========");
                System.out.print("Input destination = ");
                destination = scan.next();
                System.out.print("Input distance = ");
                distance = scan.nextInt();
                System.out.print("\f");
                ride ride1 = new ride(customer, location, destination, distance);
                ride1.payment();
            break;
            case 2:
                System.out.println("===========\nSend Menu\n===========");
                System.out.print("Input destination = ");
                destination = scan.next();
                System.out.print("Input distance = ");
                distance = scan.nextInt();
                System.out.print("Input weight = ");
                weight = scan.nextInt();
                System.out.print("\f");
                send send1 = new send(customer, location, destination, distance, weight);
                send1.payment();
            break;
        }

    }
    
  

}
