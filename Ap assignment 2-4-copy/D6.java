import java.util.Scanner;
class D6 {

    public static void main (String[] args) {
        //declare variables
        Scanner sc=new Scanner(System.in);
        int roll = 0;
        int x;
        int total=0;
        String ans  = "y"; 

        
        while (ans.equals("y")) {
            System.out.println("how many rolls");
            x=sc.nextInt();
          System.out.print("you rolled ");
            for(int i=0;i<x;i++){
                
                roll = (int) (Math.random()*6)+1;
                System.out.print(roll+" ");
                total=total +roll;
                
                
            }
            System.out.println("Total " +total);
            System.out.println("Again? [y,n] ");
            ans=sc.next();
            
        }
        if(ans.equals("n")){
                System.out.println("Good-bye!");
            }

    }

}
