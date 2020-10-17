import java.util.Scanner;

class Bar{

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x;

        String symbol="";
        System.out.println("What character do you want your bar made of? ");
        symbol=sc.next();
        System.out.println("How long do you want your bar? ");
        x=sc.nextInt();
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        for(int i=0; i<x; i++){
            System.out.print(symbol);

        }

    }

}

