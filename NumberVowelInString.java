package conditionals;

import java.util.Scanner;

public class NumberVowelInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s=sc.next().toLowerCase();

        int sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                    sum+=1;
            }


        }
        System.out.println(sum);
    }
}
