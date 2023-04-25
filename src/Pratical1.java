import java.util.HashMap;
import java.util.Scanner;
@FunctionalInterface
interface cal{
    int calculate(int num1,int num2);
}
public class Pratical1 implements cal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of operations: ");
        int noOfOpr = input.nextInt();
        int[] num1 = new int[noOfOpr];
        int[] num2 = new int[noOfOpr];
        int[] oprtype = new int[noOfOpr];
        for(int i = 0; i <noOfOpr;i++){
            System.out.print("Operation type: ");
            oprtype[i]= input.nextInt();
            System.out.print("Number 1:");
            num1[i]= input.nextInt();
            System.out.print("Number 2:");
            num2[i] = input.nextInt();
        }
        for (int i = 0;i < noOfOpr;i++){
            performCalculation(oprtype[i],num1[i],num2[i]);
        }
    }
    public static void performCalculation(int oprtype, int num1,int num2){
        cal plus , minus,multiply, div;
        HashMap<Integer,cal> calculatorMap = new HashMap<>();
        plus = (n1,n2)->n1+n2;
        minus= (n1,n2)->n1-n2;
        multiply= (n1,n2)->n1*n2;
        div=(n1,n2)->n1/n2;
        calculatorMap.put(1,plus);
        calculatorMap.put(2,minus);
        calculatorMap.put(3,multiply);
        calculatorMap.put(4,div);
        System.out.println(calculatorMap.get(oprtype).calculate(num1, num2));
    }
    @Override
    public int calculate(int num1,int num2){
        return 0;
    }
}
