import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        int n, rem,s=0,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
        c=n;
        while(n > 0)
        {
            rem =  n%10;
            s=s*10+rem;
            n=n/10;

        }
        if(s==c)
        System.out.println("palindrome number");
        else
            System.out.println("not palindrome number");


    }
}
