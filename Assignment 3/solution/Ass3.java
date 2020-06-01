// This is my way of doing it and there is many ways.
// This assignment was a nightmare my code is working but it will be difficult to understand :)

/*
Name: 
ID : 
Email: 
course number: CPCS 202
section number: 
assignment title: Numbring Systems Conversion Quiz for High School Students
date: 7/11/2018
 */

import java.util.Scanner;

public class Ass3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("		************************************************");
        System.out.println("		Welcome to the Numbering System Conversion Quiz!");
        System.out.println("		************************************************\n");
        System.out.println("The quiz consists of 8 random questions on converting between Decimal, Binary, and Hexadecimal numbers.\nYou have a maximum number of 3 trials per question.");

        while (true) {
            // the start time and points 
            long startT = System.currentTimeMillis();
            double Points = 0;

            System.out.print("\nPlease enter 1 to start the quiz or 0 to exit: ");
            int Choice = input.nextInt();
            switch (Choice) {
                case 0:
                    System.out.println("\n			      *** Thank you for using this Application ***");
                    System.exit(0);
                    break;
                case 1:
                    // the hexa digits, we gonna need it later.
                    String Digits_Hexa = "0123456789ABCDEF";
                    int RandomNumber,
                     FinalNumber;
                    String DetailedReport = "";
                     { // *** First two Qustions. Decimal to Hexadicimal ***
                        for (int i = 0; i < 2; i++) {
                            String RandomNumber_Answer = "0";
                            String TrueAnswer1_Hexa = "";

                            // Generate Random Decimal number between 0 and 255
                            RandomNumber = (int) ((Math.random()) * 255) + 1;
                                                                         //^^ i added 1 because i dont want the chance of getteing 0
                            // Store the random Number to print it later.
                            FinalNumber = RandomNumber;

                            // Converte that number to Hexadecimal with while loop
                            while (RandomNumber > 0) {
                                int HexaTemp = RandomNumber % 16;
                                TrueAnswer1_Hexa = Digits_Hexa.charAt(HexaTemp) + TrueAnswer1_Hexa;
                                RandomNumber = RandomNumber / 16;
                            }

                            // Now we gonna take the answer from the user and see if its true or false. Inside a loop so he can have 3 trials.
                            for (int n = 0; n < 3; n++) {
                                System.out.print("Please enter the equivalent Hexadecimal number of " + FinalNumber + " : ");
                                RandomNumber_Answer = input.next().toUpperCase();
                                
                                // first if the answer is correct it will print correct and add points then exit the loop.
                                if (TrueAnswer1_Hexa.equals(RandomNumber_Answer)) {
                                    System.out.println("\n	Correct Answer!\n");
                                    Points = Points + 2;
                                    break;
                                }
                                if (n == 2) {
                                    System.out.println("	\nSorry, you have exceeded the maximum number of trials for this question!\n");
                                } else {
                                    System.out.println("\n	Wrong Answer! Please try again! \n");
                                }
                            }
                            // Storing the result in the DetailedReport string to print it later.
                            DetailedReport += "	The equivalent Hexadecimal number of " + FinalNumber + " is " + RandomNumber_Answer + ":" + (TrueAnswer1_Hexa.equals(RandomNumber_Answer) ? " correct\n" : " wrong\n");
                        }
                    } // *** End of Qustion 1 and 2 *** 

                     { // *** Start of Qustion 3 and 4 , Decimal to Bianry ***
                        for (int i = 0; i < 2; i++) {
                            String RandomNumber_Answer = "";
                            String TrueAnswer_Binary = "";
                            RandomNumber = (int) ((Math.random()) * 255) + 1;
                            FinalNumber = RandomNumber;

                            //  Converte the random number to Binary
                            while (RandomNumber >= 1) {
                                if (RandomNumber % 2 == 0) {
                                    TrueAnswer_Binary = "0" + TrueAnswer_Binary;
                                    RandomNumber = RandomNumber / 2;
                                } else if (RandomNumber % 2 != 0) {
                                    TrueAnswer_Binary = "1" + TrueAnswer_Binary;
                                    RandomNumber = RandomNumber / 2;
                                }
                            }

                            for (int n = 0; n < 3; n++) {
                                System.out.print("Please enter the equivalent Binary number of " + FinalNumber + " : ");
                                RandomNumber_Answer = input.next();
                                if (TrueAnswer_Binary.equals(RandomNumber_Answer)) {
                                    System.out.println("\n	Correct Answer!\n");
                                    Points = Points + 2;
                                    break;
                                }
                                if (n == 2) {
                                    System.out.println("	\nSorry, you have exceeded the maximum number of trials for this question!\n");
                                } else {
                                    System.out.println("\n	Wrong Answer! Please try again! \n");
                                }
                            }
                            DetailedReport += "	The equivalent Binary number of " + FinalNumber + " is " + RandomNumber_Answer + ":" + (TrueAnswer_Binary.equals(RandomNumber_Answer) ? " correct\n" : " wrong\n");
                        }
                    } // *** End of Qustion 3 and 4 ***

                     { // *** Qustion 5 and 6 , Hexadecimal to decimal. ***
                        for (int i = 0; i < 2; i++) {
                            int RandomNumber_Answer = 0;
                            String RandomHexa = "";
                            // Generate Random Decimal number between 0 and 255      
                            int RandomDecimal_N = (int) ((Math.random()) * 255) + 1;
                            int RandomDecimal_Ntemp = RandomDecimal_N;
                            // **Convert the decimal number to hexadecimal**
                            while (RandomDecimal_N > 0) {
                                int HexaTemp = RandomDecimal_N % 16;
                                RandomHexa = Digits_Hexa.charAt(HexaTemp) + RandomHexa;
                                RandomDecimal_N = RandomDecimal_N / 16;
                            }
                            
                            for (int n = 0; n < 3; n++) {
                                System.out.print("Please enter the equivalent Decimal number of " + RandomHexa + " : ");
                                RandomNumber_Answer = input.nextInt();
                                if (RandomNumber_Answer == RandomDecimal_Ntemp) {
                                    System.out.println("\n	Correct Answer!\n");
                                    Points = Points + 2;
                                    break;
                                } else {
                                    if (n == 2) {
                                        System.out.println("	\nSorry, you have exceeded the maximum number of trials for this question!\n");
                                    } else {
                                        System.out.println("\n	Wrong Answer! Please try again! \n");
                                    }
                                }
                            }
                            DetailedReport += "	The equivalent Decimal number of " + RandomHexa + " is " + RandomNumber_Answer + ":" + ((RandomNumber_Answer == (RandomDecimal_Ntemp)) ? " correct\n" : " wrong\n");
                        }
                    } // *** End of Qustion 5 and 6 ***

                     { // *** Start of Qustion 7 and 8 , Binary to Decimal. ***
                        for (int i = 0; i < 2; i++) {
                            String RandomBinaryNumber = "";
                            String BinaryAnswer = "";
                            int RandomBinaryNumber_Answer = 0;
                            int RDManswer = 0;
                            
                            // First i'm gonna generate a random 8 digit binary number using this loop
                            for (int x = 0; x < 8; x++) {
                                int Digit = (int) (Math.random() * 2);
                                RandomBinaryNumber += Digit;
                            }
                            // there is a chance of getting all zeros, and there is no fun in solving that, so i'm excluding that chance.
                            if (RandomBinaryNumber.equals("00000000")) {
                                RandomBinaryNumber = "00000001";
                            }
                            String RandomBinaryNumberP = RandomBinaryNumber;
                            // here i want to remove the zeros on the left so it will be easier to compare later.
                            {
                                int X = RandomBinaryNumber.indexOf("1");
                                RandomBinaryNumber = RandomBinaryNumber.substring(X);
                            }

                            for (int n = 0; n < 3; n++) {
                                System.out.print("Please enter the equivalent Decimal number of " + RandomBinaryNumberP + " : ");
                                RandomBinaryNumber_Answer = input.nextInt();
                                RDManswer = RandomBinaryNumber_Answer;
                                // now i'm gonna convert the bianry to decimal 
                                String BinaryinDecimalTemp = "";
                                while (RandomBinaryNumber_Answer >= 1) {
                                    if (RandomBinaryNumber_Answer % 2 == 0) {
                                        BinaryinDecimalTemp += "0";
                                        RandomBinaryNumber_Answer = RandomBinaryNumber_Answer / 2;
                                    } else if (RandomBinaryNumber_Answer % 2 != 0) {
                                        BinaryinDecimalTemp += "1";
                                        RandomBinaryNumber_Answer = RandomBinaryNumber_Answer / 2;
                                    }
                                }
                                BinaryAnswer = "";
                                int length = BinaryinDecimalTemp.length();
                                for (int x = length - 1; x >= 0; x--) {
                                    BinaryAnswer = BinaryAnswer + BinaryinDecimalTemp.charAt(x);
                                }
                                if (BinaryAnswer.equals(RandomBinaryNumber)) {
                                    System.out.println("\n	Correct Answer!\n");
                                    Points = Points + 2;
                                    break;
                                } else {
                                    if (n == 2) {
                                        System.out.println("	\nSorry, you have exceeded the maximum number of trials for this question!\n");
                                    } else {
                                        System.out.println("\n	Wrong Answer! Please try again! \n");
                                    }
                                }
                            }
                            DetailedReport += "	The equivalent Decimal number of " + RandomBinaryNumberP + " is " + RDManswer + ":" + ((BinaryAnswer.equals(RandomBinaryNumber)) ? " correct\n" : " wrong\n");

                        }
                    } // *** End of Qustion 7 and 8 ***

                    // *** The detailed report. ***
                    System.out.println("\n		************************************");
                    System.out.print("		Time taken to complete the quiz: ");
                    long Ftime = System.currentTimeMillis();
                    double QuizTime = ((Ftime - startT) / 1000.00 / 60.00);

                    System.out.printf("%.1f minutes \n", QuizTime);
                    double FinalScore = (Points / 16) * 100;
                    System.out.println("		Score is: " + FinalScore + "%");
                    if (FinalScore >= 60) {
                        System.out.println("		Congratulations, you have passed!");
                    } else {
                        System.out.println("		Sorry, You didn't pass the quiz!");
                    }
                    System.out.println("		************************************");

                    System.out.println("\n        Detailed Results:");
                    System.out.println("        ---------------------------");
                    System.out.println(DetailedReport);

                    System.out.print("		>> Do you want to contiune for another trial quiz (Y/N): ");
                    String FChoice = input.next().toUpperCase();
                    switch (FChoice) {
                        case "Y":
                            break;
                        case "N":
                            System.out.println("\n\n			      *** Thank you for using this Application ***");
                            System.exit(0);
                            break;
                    }
                    break;

                default:
                    System.out.println("Wrong choice!! Please try again..");

            }
        }
    }
}
