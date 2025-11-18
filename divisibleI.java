package ifelse;
import java.util.Scanner;

public class divisibleI {
    public static void main(String[] args) {
    
    
    
    Scanner sc=new Scanner(System.in);
    
     System.out.println("enter your number");
    
    int num=sc.nextInt();

    if(num%5==0 && num%3==0){
        System.out.println("no.will be divisible by 5 and 3");
    }
    else{
        System.out.println("no. is not divisble by 5 and 3");
    }    
}




    
}

    

