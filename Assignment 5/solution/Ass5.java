// This is my way of doing it and there is many ways.

/*
Name: 
ID : 
Email: 
course number: CPCS 202
section number: 
assignment title: The Game of Hangman
date: 5/12/2018
 */

import java.util.Scanner;

public class Ass5 {

    public static void intro() {
        System.out.println("Hangman Game!");
        System.out.println("I will think of a random word.");
        System.out.println("You'll try to guess its letters.");
        System.out.println("Try guess correctly to avoid loses!");
    }

    public static String getSecretWord() {
        String[] word_list = {"ruby", "python", "java", "fortran", "html", "php"};
        // to return random string, first i'm gonna create a random number between 0 - to the length of the array , then take the index of that number from the array.
        int TakeMe = (int) (Math.random() * word_list.length);
        String RandomWord = word_list[TakeMe];
        return RandomWord;
    }

    public static boolean playOneGame(String secret_word, char[] secret_letter) {
        // You can enable cheat mode by removing the two slashes in the line below :)
       // System.out.println("*** Cheat mode is ON :D secret word is : *** - " + secret_word + " - ***");
        Scanner input = new Scanner(System.in);
        int NumTrialLeft = 5;
        int CorrectGuess = 0;
        int WrongGuess = 0;
        String WrongMsg = "Misses: ";
        boolean DidHeGuessedIt = false;
        
        while (NumTrialLeft > 0 && DidHeGuessedIt == false) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("You have " + NumTrialLeft + " trials left.");

            // if a place at the array is empty it will print "-" and if its not it will print that letter
            System.out.print("Word: ");
            for (int i = 0; i < secret_word.length(); i++) {
                char TestMe = secret_word.charAt(i);
                if (TestMe == secret_letter[i]) {
                    System.out.print(" " + secret_letter[i]);
                } else {
                    System.out.print(" - ");
                }
            }

            System.out.print("\nEnter your Guess Letter: ");
            char guessLetter = input.next().charAt(0);
            guessLetter = Character.toLowerCase(guessLetter);
            if (correctGuess(secret_word, secret_letter, guessLetter) == true) {
                CorrectGuess++;
                switch (winningState(secret_letter)) {
                    case 0:
                        DidHeGuessedIt = true;
                        break;
                    case 1:
                        break;
                }
            } else {
                WrongMsg += " " + guessLetter;
                System.out.println(WrongMsg);
                WrongGuess++;
                NumTrialLeft--;
            }
        }
        
        System.out.println("************************************");
        System.out.println("Your Attempt Status: ");
        System.out.println("_____________________");
        System.out.println(" number of wrong guess is = " + WrongGuess);
        System.out.println(" number of correct guess is = " + CorrectGuess);
        System.out.println("************************************\n\n");
        if (DidHeGuessedIt == true) {
            System.out.println("You did it right :) , the word is: " + secret_word);
            return true;
        } else {
            System.out.println("Wrong :( ,The word was..." + secret_word);
            return false;
        }
    }

    public static boolean correctGuess(String secret_word, char[] secret_letter, char guessLetter) {
        boolean Match = false;
        for (int i = 0; i < secret_word.length(); i++) {
            if (guessLetter == secret_word.charAt(i)){
                Match = true;
                secret_letter[i] = guessLetter;
            }    
        }
        return Match;
    }

    public static int winningState(char[] secret_letter) {
        // 0 done , 1 still needs filling.
        boolean Status = false;
        // if a place at arary equals \u0000 (empty), that means it still need filling.
        for (int i = 0; i < secret_letter.length; i++) {
            if (secret_letter[i] == '\u0000') {
                Status = false;
                break;
            } else {
                Status = true;
            }
        }
        if (Status == true) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void getStat(int[] game_stat) {
        // Sorry i didnt use (int index) here because i really didn't understand the use for it !! and its working 100% without it :)
        int total_won = game_stat[0];
        int total_loss = game_stat[1];
        int total_games = game_stat[2];

        System.out.println("------------------");
        System.out.println("Your final Profile status:");
        System.out.println("_______________");
        System.out.println("total number of Hangman games played  = " + total_games);
        System.out.println("total number of won games = " + total_won);
        System.out.println("total number of loss games = " + total_loss);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        intro();

        // in this Array i will store the number of games, win, and looses.
        int[] getStat = new int[3];
        // at [2] is the total number of games
        // at [1] won games
        // at [0] lost games

        boolean WorL; // Win Or Lost
        while (true) {
            getStat[2]++;

            String Secret_Word = getSecretWord();
            char[] secret_letter = new char[Secret_Word.length()];

            WorL = playOneGame(Secret_Word, secret_letter);
            if (WorL == true) {
                getStat[0]++;
            } else {
                getStat[1]++;
            }
            System.out.println("\nDo you want to play again (y / n):");
            String Choice = input.next().toLowerCase();
            switch (Choice) {
                case "y":
                    break;
                case "n":
                    getStat(getStat);
                    System.exit(0);
            }
        }

    }

}
