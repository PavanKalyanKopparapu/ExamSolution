import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter No:");
        int no =  sc.nextInt();
        String name;
        Integer no1;
        Map<String,Integer> map = new HashMap();
        for(int i = 0; i<no;i++) {
            System.out.println("Enter student name :");
            name = sc.next();
            System.out.println("Enter marks :");
            no1 = sc.nextInt();
            map.put(name, no1);
        }
            map.entrySet().stream().filter(stringIntegerEntry ->
                    stringIntegerEntry.getValue() > 30&& stringIntegerEntry.getValue() < 50).       forEach((System.out::println));

        }
    }



