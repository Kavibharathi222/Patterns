
import java.util.Scanner;


class StarPattern
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter Number :");
    int num=sc.nextInt();
    
    StarPattern s=new StarPattern();
    s.Pattern5(num);
    }

    public void Pattern1(int n)
    {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
    }

    public  void Pattern2(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   public void Pattern3(int n) {
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n -i; j++) { 
            System.out.print("*");
        }
        System.out.println(); 
    }
    
}
public void Pattern4(int n) {
    for (int i = 1; i <= n; i++) { 
        for (int j = 1; j <= i; j++) { 
            System.out.print(j+" ");
        }
        System.out.println(); 
    }
    
}
public void Pattern5(int n) {
    // for (int i = 0; i < n; i++){
    //         for (int j = 0; j < i; j++) {
    //             System.err.print("*");
    //         }
    //         System.err.println();
    //     }
    //     for (int i = 0; i < n; i++) { 
    //     for (int j = 0; j < n -i; j++) { 
    //         System.out.print("*");
    //     }
    //     System.out.println(); 
    // }
    for (int i = 1; i <= 2*n; i++) {
        if(i>n)
        {
         for (int j = 0; j < 2*n -i; j++) { 
            System.out.print("*");
        }
        System.out.println();
        }
        else{
        for (int j = 1; j<=i; j++) {
            System.out.print("*");
            
        }
        System.out.println();
    }}
        
}
public void Pattern6(int n) {
    for (int i = 1; i <= n; i++) { 
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) { 

            System.out.print("*");
        }
        System.out.println(); 
    }
    
}
public void Pattern7(int n) {
    for (int i = 1; i <= n; i++) { 
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) { 

            System.out.print(" *");
        }
        System.out.println(); 
    }
    
}
public void Pattern8(int n) {
    for (int i = 1; i <= n; i++) { 
        
        for (int j = 0; j <= n-i; j++) { 

            System.out.print(" *");
        }
        for(int k=0;k<i;k++){

            System.out.print(" ");
        }
        System.out.println(); 
    }
    
}
}
    
