import java.util.Scanner;

class RunningTally{

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int input=0;
        int total=0;
        
        
        System.out.println("Adding Numbers");
        System.out.println("");
        
        while(input>=0){
         System.out.print("Add: ");
         input=sc.nextInt();
         if(input>=0){
             total=total+input;
            }
         
           
        }
        System.out.println("Total: "+total);
    }
}