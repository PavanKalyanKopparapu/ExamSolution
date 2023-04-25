import Addition.Addition;

public class Examplejava8 {
    public static void main(String[] args) {
        String s = "Pavan";
        int k = 10;
        double salary = 1234.56;
        boolean flag = false;
        if(flag)
            System.out.println("hi");
        else
            System.out.println("Hello");
        TestInterface t = () -> {
            System.out.println("display meyhod is called using java 8 lambda expression");
        };
        t.display();

    }
}

