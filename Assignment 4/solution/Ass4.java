// This is my way of doing it and there is many ways.

/*
Name: 
ID : 
Email: 
course number: CPCS 202
section number: 
assignment title: Jeddah National Hospital Administration
date: 26/11/2018
 */

import java.util.Scanner;

public class Ass4 {

    public static void displayMainMenu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("	Welcome to the Jeddah National Hospital Administration");
        System.out.println("----------------------------------------------------------------");
        System.out.println("	Enter \"Book\" to book a new appointment");
        System.out.println("	Enter \"Add\" to add a new patient");
        System.out.println("	Enter \"Exit\" to exit the program");
        System.out.print("Enter your Choice: ");
    }

    public static String readAndVerify() {
        Scanner input = new Scanner(System.in);
        while (true) {
            printMsg("DeptMenu");
            String DeptChoice = input.next();
            if (DeptChoice.equalsIgnoreCase("I")) {
                return "I";
            }
            if (DeptChoice.equalsIgnoreCase("R")) {
                return "R";
            }
            if (DeptChoice.equalsIgnoreCase("S")) {
                return "S";
            }
            if (DeptChoice.equalsIgnoreCase("D")) {
                return "D";
            } else {
                System.out.println("\n	Wrong Selection of clinic... try again!");
            }
        }
    }

    public static void printMsg(String menu) {
        switch (menu) {
            case "DeptMenu":
                System.out.println("\n	-------------------------------------------------");
                System.out.println("	DEPARTMENT: please select the correct department:");
                System.out.println("	-------------------------------------------------");
                System.out.println("	Enter I or i for ICU:");
                System.out.println("	Enter R or r for Radiology:");
                System.out.println("        Enter S or s for Surgery:");
                System.out.println("	Enter D or d for Dentistry:");
                System.out.print("Enter your Choice: ");
                break;
            case "DefaultMenu":
                System.out.println("\n	Wrong Selection of Service Type!\n");
                break;
            case "WrongChoice":
                System.out.println("\n	Wrong Selection of clinic... try again!");
                break;
            case "Redirect":
                System.out.println("\n---------------------------------------------------------------------------------------------------");
                System.out.println("---------------------------Redirect to the main menu-----------------------------------------------\n");
                break;
        }

    }

    public static void displayInfoBook(int id, String name, double Time, String Clinic, int fee) {

        System.out.println("\n			-------------------------------------------------");
        System.out.println("			    Information Details for Booking Appointment");
        System.out.println("			-------------------------------------------------\n");
        System.out.println("Name                    : " + name);
        System.out.println("National ID Number      : " + id);
        System.out.print("Clinic                  : ");

        if (Clinic.equalsIgnoreCase("i")) {
            System.out.println("ICU");
        } else if (Clinic.equalsIgnoreCase("r")) {
            System.out.println("RADIOLOGU");
        } else if (Clinic.equalsIgnoreCase("s")) {
            System.out.println("SURGERY");
        } else if (Clinic.equalsIgnoreCase("d")) {
            System.out.println("DENTISTRY");
        }

        System.out.print("Appointment Time        : ");
        // this method will convert the time from 24hrs to 12hrs.
        From24To12(Time);

        System.out.println("Appointment fee         : " + fee + " SR\n");

        printMsg("Redirect");

    }

    public static void displayInfoAdd(int id, String name, int age, String Phone, String Clinic, double Weight, double Height) {
        System.out.println("\n			-------------------------------------------------");
        System.out.println("			    Information Details for Booking Appointment");
        System.out.println("			-------------------------------------------------\n");
        System.out.println("Name                    : " + name);
        System.out.println("National ID Number      : " + id);
        System.out.print("Clinic                  : ");

        if (Clinic.equalsIgnoreCase("i")) {
            System.out.println("ICU");
        } else if (Clinic.equalsIgnoreCase("r")) {
            System.out.println("RADIOLOGU");
        } else if (Clinic.equalsIgnoreCase("s")) {
            System.out.println("SURGERY");
        } else if (Clinic.equalsIgnoreCase("d")) {
            System.out.println("DENTISTRY");
        }

        System.out.println("Age                    : " + age);
        System.out.println("Phone number           : " + Phone);

        // calculate the bmi
        double BMI = (Weight / ((Height / 100) * (Height / 100)));
        
        if (BMI <= 18.5) {
            System.out.println("BMI                   : Underweight");
        } else if (BMI > 18.5 && BMI <= 25) {
            System.out.println("BMI                   : Normal");
        } else if (BMI > 25 && BMI <= 30) {
            System.out.println("BMI                   : Overweight");
        } else if (BMI > 30) {
            System.out.println("BMI                   : Obese");

        }
        System.out.println("Weight:                : " + Weight + " kg");
        System.out.println("Height:                : " + Height + " cm");

        printMsg("Redirect");

    }

    public static void From24To12(double HrsIn24hrs) {
        // in This method i'm just gonna convert the time from Int to String With AM and PM 
        if (HrsIn24hrs == 8) {
            System.out.println("8:00 AM");
        } else if (HrsIn24hrs == 9) {
            System.out.println("9:00 AM");
        } else if (HrsIn24hrs == 10) {
            System.out.println("10:00 AM");
        } else if (HrsIn24hrs == 11) {
            System.out.println("11:00 AM");
        } else if (HrsIn24hrs == 12) {
            System.out.println("12:00 PM");
        } else if (HrsIn24hrs == 13) {
            System.out.println("1:00 PM");
        } else if (HrsIn24hrs == 14) {
            System.out.println("2:00 PM");
        } else if (HrsIn24hrs == 15) {
            System.out.println("3:00 PM");
        } else if (HrsIn24hrs == 16) {
            System.out.println("4:00 PM");
        } else if (HrsIn24hrs == 17) {
            System.out.println("5:00 PM");
        } else if (HrsIn24hrs == 18) {
            System.out.println("6:00 PM");
        } else if (HrsIn24hrs == 9.5) {
            System.out.println("9:30 AM");
        } else if (HrsIn24hrs == 10.5) {
            System.out.println("10:30 AM");
        } else if (HrsIn24hrs == 11.5) {
            System.out.println("11:30 AM");
        } else if (HrsIn24hrs == 12.5) {
            System.out.println("12:30 PM");
        } else if (HrsIn24hrs == 13.5) {
            System.out.println("1:30 PM");
        } else if (HrsIn24hrs == 14.5) {
            System.out.println("2:30 PM");
        } else if (HrsIn24hrs == 15.5) {
            System.out.println("3:30 PM");
        } else if (HrsIn24hrs == 16.5) {
            System.out.println("4:30 PM");
        } else if (HrsIn24hrs == 17.5) {
            System.out.println("5:30 PM");
        } else if (HrsIn24hrs == 18.5) {
            System.out.println("6:30 PM");
        } else if (HrsIn24hrs == 19.5) {
            System.out.println("7:30 PM");
        } else if (HrsIn24hrs == 20.5) {
            System.out.println("8:30 PM");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ICU from 8 am till 6 pm
        int ICUstart = 8;
        int ICUend = 18;
        // Rad from 9 am till 5 pm
        int Radstart = 9;
        int RadEnd = 17;
        // Surgey from 9:30 am till 8:30 pm
        double SurgeryStart = 9.5;
        double SurgeryEnd = 20.5;
        // Dentistry from 10 am till 4 pm
        int DenisryStart = 10;
        int DenisryEnd = 16;

        while (true) { // >>>>>>> 1- The Main Loop
            String Name = null;
            int NationalId = 0;
            int fee = 0;
            int Confimaion;

            displayMainMenu();
            String MenuChoice = input.next();

            switch (MenuChoice.toUpperCase()) {
                case "BOOK":
                    BookLoop:
                    while (true) {
                        String BookChoice = readAndVerify();
                        System.out.print("	Enter the name (first and last): ");
                        Name = input.nextLine();
                        Name = input.nextLine();
                        System.out.print("	Enter the national ID number: ");
                        NationalId = input.nextInt();
                        System.out.print("	The appointment will be at ");

                        // first i will take the first free time in 24hrs format then i will convert it to 12hrs and print it.
                        
                        //  ** and if there is no available appointment it will also print a msg for that. *** 
                        // In the pdf and output file, there was no mention of such case, what i decided to do is print a msg that the dept. is full and return the user the main menu
                        double Time = 0;
                        switch (BookChoice.toUpperCase()) {
                            case "I":
                                if (ICUstart > ICUend) {
                                    System.out.println("\n\n    >  Sorry this department is fully booked today! <\n");
                                    break BookLoop;
                                }
                                Time = ICUstart;
                                From24To12(Time);
                                break;

                            case "R":
                                if (Radstart > RadEnd) {
                                    System.out.println("\n\n    >  Sorry this department is fully booked today! <\n");
                                    break BookLoop;
                                }
                                Time = Radstart;
                                From24To12(Time);
                                break;

                            case "S":
                                if (SurgeryStart > SurgeryEnd) {
                                    System.out.println("\n\n    >  Sorry this department is fully booked today! <\n");
                                    break BookLoop;
                                }
                                Time = SurgeryStart;
                                From24To12(Time);
                                break;

                            case "D":
                                if (DenisryStart > DenisryEnd) {
                                    System.out.println("\n\n    >  Sorry this department is fully booked today! <\n");
                                    break BookLoop;
                                }
                                Time = DenisryStart;
                                From24To12(Time);
                                break;
                        }

                        System.out.print("	Press 1 to confirm, 2 to cancel : ");
                        Confimaion = input.nextInt();
                        switch (Confimaion) {
                            case 1:
                                // The first appointment is taken so i will increase the depatment start time with one.
                                if (BookChoice.equalsIgnoreCase("i")) {
                                    ICUstart++;
                                } else if (BookChoice.equalsIgnoreCase("r")) {
                                    Radstart++;
                                } else if (BookChoice.equalsIgnoreCase("s")) {
                                    SurgeryStart++;
                                } else if (BookChoice.equalsIgnoreCase("d")) {
                                    DenisryStart++;
                                }

                                // the fee cost for each department                                    
                                if (BookChoice.equalsIgnoreCase("i")) {
                                    fee = 1000;
                                } else if (BookChoice.equalsIgnoreCase("r")) {
                                    fee = 200;
                                } else if (BookChoice.equalsIgnoreCase("s")) {
                                    fee = 3000;
                                } else if (BookChoice.equalsIgnoreCase("d")) {
                                    fee = 150;
                                }
                                displayInfoBook(NationalId, Name, Time, BookChoice, fee);
                                break;

                            // if he cancel the appointment.
                            case 2:
                                printMsg("Redirect");
                                break;
                            default:
                                System.out.println("Wrong input, Please try again!");
                                break;
                        }
                        break;
                    }
                    break;

                case "ADD":
                    while (true) {
                        String AddChoice = readAndVerify();
                        // *** Quick Note *** - in the PDF file its only saying ICU, Radiology and Surgery clinic for add method so thats why i'm removing Dentistry,
                        // if the PDF is wrong please just remove the five lines below this (317,318,319,320,312)
                        if (AddChoice.equals("D")) {
                            System.out.println("Sorry Dentistry is not availabe for add .");
                            printMsg("Redirect");
                            break;
                        }

                        System.out.print("\n	Enter the name (first and last): ");
                        Name = input.nextLine();
                        Name = input.nextLine();
                        System.out.print("	Enter the national ID number: ");
                        NationalId = input.nextInt();
                        System.out.print("        Enter your age: ");
                        int AGE = input.nextInt();
                        System.out.print("        Enter your mobile number (###-###-####): ");
                        String PhoneNumber = input.next();
                        System.out.print("        Enter your weight in Kilogram: ");
                        double Weight = input.nextDouble();
                        System.out.print("        Enter your height in Centimeter: ");
                        double Height = input.nextDouble();

                        displayInfoAdd(NationalId, Name, AGE, PhoneNumber, AddChoice, Weight, Height);
                        break;
                    }

                    continue;

                case "EXIT":
                    System.exit(0);
                    break;

                default:
                    printMsg("DefaultMenu");

            }
        }
    }
}
