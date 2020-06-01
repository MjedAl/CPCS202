// This is my way of doing it and there is many ways.

/*
Name: 
ID : 
Email: 
course number: CPCS 202
section number: 
assignment title: Red Sea Logistics
date: 24/10/2018
 */

import java.util.Scanner;

public class Ass2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("		Welcome to Red Sea Logistics Cargo Rate System");
        System.out.println("------------------------------------------------------------");
        System.out.println("	Enter \"Nat\" for National Cargo");
        System.out.println("	Enter \"Int\" for International  Cargo");
        System.out.println("	Enter \"Exit\" for Exiting the Program");
        System.out.print("Enter the Choice: ");
        String Choise = input.next().toLowerCase();
        System.out.println("************************");

        String Name1 = null, Name2 = null, Address = null, freightChoice = null,ContactN = null;
        double cost = 0, insurancePrice = 0, CargoWeight = 0, tax = 0, TotalCost = 0, Container = 0;

        /*
        First i used Switch for the three main choices
        National, International, Exit
         */
        switch (Choise) {
// First case is NATIONAL Shipment
            case "nat":
                System.out.println("Enter personal details : \n");
                System.out.print("	Enter the name (first and last): ");
                Name1 = input.next();
                Name2 = input.next();
                System.out.print("	Enter Your Contact Number: ");
                ContactN = input.next();
                System.out.print("	Enter Your Address: ");
                Address = input.next();
                System.out.println("************************");
                System.out.println("Select Freight type\n");
                System.out.println("	Press R or r for Road freight");
                System.out.println("	Press A or a for Air freight");

                System.out.print("Enter the choice: ");
                freightChoice = input.next().toLowerCase();
                /*
                    Here i used another Switch for the two Freight type. (Road and Air) 
                    This switch is inside the (if statment) so if the input is not a,A or R,r it will not enter
                 */
                switch (freightChoice) {
                    // NATIONAL Road freight and the detailed report for it. 
                    case "r":
                        System.out.print("Enter the weight for cargo : ");
                        CargoWeight = input.nextInt();
                        if (CargoWeight <= 0) {
                            System.out.println("	Wrong input... Weight should be greater than zero");
                            System.exit(0);
                        } else if (CargoWeight >= 1 && CargoWeight <= 5) {
                            cost = CargoWeight * 10.0;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 5 && CargoWeight <= 10) {
                            cost = CargoWeight * 8.5;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 10 && CargoWeight <= 50) {
                            cost = CargoWeight * 5.5;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 50) {
                            cost = CargoWeight * 2.5;
                            insurancePrice = 15;
                            tax = 0.05 * cost;
                        }
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("			    Information Details for NATIONAL Shipment");
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("\n===========================================================================================================================");
                        System.out.printf("Name                    : %S %S               Contact Number: %s      Address:      %s", Name1, Name2, ContactN, Address);
                        System.out.println("\n\nFreight Type            : ROAD FREIGHT");
                        System.out.printf("\n\t\t\t\t\tWeight                 %11.1f KGs", CargoWeight);
                        System.out.printf("\n\t\t\t\t\tShipment Cost          %12.2f", cost);
                        System.out.printf("\n\t\t\t\t\tTax                    %11.2f", tax);
                        System.out.printf("\n\t\t\t\t\tInsurance              %10.1f", insurancePrice);
                        System.out.println("\n					------------------------------------");
                        TotalCost = (cost + tax + insurancePrice);
                        System.out.printf("\t\t\t\t\tTotal Cost             %9.0f SAR\n\n", TotalCost);
                        System.out.println("==========================================================================================================================");
                        System.out.println("			      *** Thank you for using this Application ***");
                        break;

                    // NATIONAL Air freight and the detailed report for it. 
                    case "a":
                        System.out.print("Enter the weight for cargo : ");
                        CargoWeight = input.nextDouble();
                        if (CargoWeight <= 0) {
                            System.out.println("	Wrong input... Weight should be greater than zero");
                            System.exit(0);
                        } else if (CargoWeight >= 1 && CargoWeight <= 5) {
                            cost = CargoWeight * 16;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 5 && CargoWeight <= 10) {
                            cost = CargoWeight * 13.5;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 10 && CargoWeight <= 50) {
                            cost = CargoWeight * 10.5;
                            insurancePrice = 8;
                            tax = 0.05 * cost;
                        } else if (CargoWeight > 50) {
                            System.out.println("\n	Sorry! National Air freight is not available for more than 50KGs!");
                            System.exit(0);
                        }
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("			    Information Details for NATIONAL Shipment");
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("\n===========================================================================================================================");
                        System.out.printf("Name                    : %S %S               Contact Number: %s      Address:      %s", Name1, Name2, ContactN, Address);
                        System.out.println("\n\nFreight Type            : AIR FREIGHT");
                        System.out.printf("\n\t\t\t\t\tWeight                 %11.1f KGs", CargoWeight);
                        System.out.printf("\n\t\t\t\t\tShipment Cost          %12.2f", cost);
                        System.out.printf("\n\t\t\t\t\tTax                    %11.2f", tax);
                        System.out.printf("\n\t\t\t\t\tInsurance              %10.1f", insurancePrice);
                        System.out.println("\n					------------------------------------");
                        TotalCost = (cost + tax + insurancePrice);
                        System.out.printf("\t\t\t\t\tTotal Cost             %9.0f SAR\n\n", TotalCost);
                        System.out.println("==========================================================================================================================");
                        System.out.println("			      *** Thank you for using this Application ***");
                        break;

                    default:
                        System.out.println("	Wrong Selection of Freight type!");
                        System.exit(0);
                }
                break;

// sedcond case is International Shipment
            case "int":
                System.out.println("Enter personal details : \n");
                System.out.print("	Enter the name (first and last): ");
                Name1 = input.next();
                Name2 = input.next();
                System.out.print("	Enter Your Contact Number: ");
                ContactN = input.next();
                System.out.print("	Enter Your Address: ");
                Address = input.next();
                System.out.println("************************");
                System.out.println("Select Freight type\n");
                System.out.println("	Press S or s for Sea freight");
                System.out.println("	Press A or a for Air freight");
                System.out.print("Enter the choice: ");
                freightChoice = input.next().toLowerCase();
                switch (freightChoice) {
                    // International Sea freight and the detailed report for it. 
                    case "s":
                        System.out.print("Enter the weight for cargo : ");
                        CargoWeight = input.nextDouble();
                        if (CargoWeight <= 0) {
                            System.out.println("	Wrong input... Weight should be greater than zero");
                            System.exit(0);
                        } else if (CargoWeight >= 1 && CargoWeight <= 100) {
                            cost = CargoWeight * 5.5;
                            insurancePrice = 50;
                            tax = 0.065 * cost;
                        } else if (CargoWeight > 100 && CargoWeight <= 1000) {
                            cost = CargoWeight * 4;
                            insurancePrice = 50;
                            tax = 0.065 * cost;
                        } else if (CargoWeight > 1000) {
                            Container = Math.ceil(CargoWeight / 25000);
                            cost = 6250;
                            insurancePrice = 450;
                            tax = 0.08 * cost;
                        }
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("			    Information Details for INTERNATIONAL Shipment");
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("\n===========================================================================================================================");
                        System.out.printf("Name                    : %S %S               Contact Number: %s      Address:      %s", Name1, Name2, ContactN, Address);
                        System.out.println("\n\nFreight Type            : SEA FREIGHT");
                        System.out.printf("\n\t\t\t\t\tWeight                 %12.1f KGs", CargoWeight);
                        System.out.printf("\n\t\t\t\t\tShipment Cost          %12.2f", cost);
                        System.out.printf("\n\t\t\t\t\tTax                    %11.2f", tax);
                        System.out.printf("\n\t\t\t\t\tInsurance              %10.1f", insurancePrice);
                        /*
                            Over here i did this so if the cargo weight is more than 1000
                            it will print extra line in the report detailing the number of containers
                            and calcutaing the total cost
                         */
                        if (Container > 0) {
                            System.out.printf("\n\t\t\t\t\tNo of container(s) %13.2f", Container);
                            TotalCost = (cost + tax + insurancePrice) * (Container);
                        } else {
                            TotalCost = (cost + tax + insurancePrice);
                        }
                        System.out.println("\n					------------------------------------");
                        System.out.printf("\t\t\t\t\tTotal Cost             %9.0f SAR\n\n", TotalCost);
                        System.out.println("==========================================================================================================================");
                        System.out.println("			      *** Thank you for using this Application ***");
                        break;

                    // International Air freight and the detailed report for it. 
                    case "a":
                        System.out.print("Enter the weight for cargo : ");
                        CargoWeight = input.nextInt();
                        if (CargoWeight <= 0) {
                            System.out.println("	Wrong input... Weight should be greater than zero");
                            System.exit(0);
                        } else if (CargoWeight >= 1 && CargoWeight <= 100) {
                            cost = CargoWeight * 12.5;
                            insurancePrice = 50;
                            tax = 0.065 * cost;
                        } else if (CargoWeight > 100) {
                            System.out.println("\n	Sorry! International Air freight is not available for more than 100KGs!");
                            System.exit(0);
                        }
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("			    Information Details for INTERNATIONAL Shipment");
                        System.out.println("			---------------------------------------------------------");
                        System.out.println("\n===========================================================================================================================");
                        System.out.printf("Name                    : %S %S               Contact Number: %s      Address:      %s", Name1, Name2, ContactN, Address);
                        System.out.println("\n\nFreight Type            : AIR FREIGHT");
                        System.out.printf("\n\t\t\t\t\tWeight                 %11.1f KGs", CargoWeight);
                        System.out.printf("\n\t\t\t\t\tShipment Cost          %12.2f", cost);
                        System.out.printf("\n\t\t\t\t\tTax                    %11.2f", tax);
                        System.out.printf("\n\t\t\t\t\tInsurance              %10.1f", insurancePrice);
                        System.out.println("\n					------------------------------------");
                        TotalCost = (cost + tax + insurancePrice);
                        System.out.printf("\t\t\t\t\tTotal Cost             %9.0f SAR\n\n", TotalCost);
                        System.out.println("==========================================================================================================================");
                        System.out.println("			      *** Thank you for using this Application ***");
                        break;

                    default:
                        System.out.println("	Wrong Selection of Freight type!");
                        System.exit(0);
                }
                break;

            // EXIT
            case "exit":
                System.out.println("			      *** Thank you for using this Application ***");
                System.exit(0);
                break;

            // default for the big switch, if the user input something other than ( nat , int , exit )
            default:
                System.out.println("	Wrong Selection of shipment scope! ");
                System.exit(0);
        }
    }
}
