
package it2e.corro.ta;

import java.util.Scanner;


public class IT2ECORROTA {

    public void addbooking(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Customer Name: ");
        String name = sc.next();
        System.out.print("Destination: ");
        String destination = sc.next();
        System.out.print("Departure Date: ");
        String departure = sc.next();
        System.out.print("Return Date: ");
        String preturn = sc.next();
         System.out.print("Number of Travelers: ");
        String travelers = sc.next();
        System.out.print("Payment Status: ");
        String payment = sc.next();
        String sql = "INSERT INTO tbl_booking (customer_name, destination, departure_date, return_date, number_travelers, payment_status) VALUES (?, ?, ?, ?, ?, ?)";


        conf.addRecord(sql, name, destination, departure, preturn, travelers, payment);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        config  conf = new config();
        
        
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter action: ");
        int action = sc.nextInt();
        
        switch(action){
            case 1: 
                IT2ECORROTA test = new IT2ECORROTA();
                test.addbooking();
    }
    
}

   
}