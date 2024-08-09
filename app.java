import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        // int i = 0;
        // float f = 0.0f;
        // boolean b = true;
        // char c = 'a';
        // long l = 0L;
        // double d = 0.0;

        // while (i < 10) {
        // System.out.println(i);
        // i++;
        // }
        String s = "app java";
        System.out.println(s);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter something: ");
            String s2 = scanner.nextLine();
            System.out.println("Enter number: ");
            int i = scanner.nextInt();
            System.out.println(s2);
            if(i == 0) {
                throw new RuntimeException();
            } else if (i > 0) {
                System.out.println(i);
            }
        }

    }

}