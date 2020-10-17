import java.util.Scanner;

class Triangle{

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        
        String symbol="";
        System.out.println("What character do you want your triangle made of? ");
        symbol=sc.next();
        System.out.println("How tall do you want your triangle? ");
        x=sc.nextInt();
        System.out.println("");
        System.out.println("Here's your triangle!");
        System.out.println("");
        for(int i=0; i<=x; i++){
            
            
            for(int j=0; j<i; j++){
                System.out.print(symbol+"");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
    
    
}

