import java.util.Scanner;

class GuessingGame{

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x=(int) (Math.random()*100)+1;;
        int guess=0;
        int tries=0;
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");


        while(guess!=x){
            System.out.println("What is your guess?");
            guess=sc.nextInt();
            
            if(guess>x) {          
                System.out.println("too high");
            }
            else if(guess<x){
                System.out.println("too low");   
            }

            tries++;
        }
        if(guess==x){
            System.out.println("You've guessed my number! Good job! It only took you "+tries+" tries");
        }
    }

}