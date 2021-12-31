package src;
import java.util.Scanner;
public class menu {
   //Deklarasi Variabel
   static String customer, location, destination;
   static int choice, weight, distance;

   //Membuat object Scanner
   static Scanner scan = new Scanner(System.in);

   public menu(){ 
   
   System.out.print("Input name = ");
   customer = scan.next();
   System.out.print("Input location = ");
   location = scan.next();
   System.out.print("===========\nTaxi Bike\n===========");
   System.out.print("\n1. Ride\n2.Send\n\nInput your Choice = ");
   choice = scan.nextInt();
   //Pengkondisian
   switch(choice){
      case 1:
         rideMenu();
      break;
      case 2:
         sendMenu();
      break;
   }
}
    //Method Ride Menu
    static void rideMenu(){
        System.out.println("===========\nRide Menu\n===========");
        System.out.print("Input destination = ");
        destination = scan.next();
       System.out.print("Input distance = ");
        distance = scan.nextInt();
        ride ride1 = new ride(customer, location, destination, distance);
        ride1.payment();

    }
    //Method Send Menu
    static void sendMenu(){
        System.out.println("===========\nSend Menu\n===========");
        System.out.print("Input destination = ");
        destination = scan.next();
        System.out.print("Input distance = ");
        distance = scan.nextInt();
        System.out.print("Input weight = ");
        weight = scan.nextInt();
        send send1 = new send(customer, location, destination, distance, weight);
        send1.payment();

    }

} 
