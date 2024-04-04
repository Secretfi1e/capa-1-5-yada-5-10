import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n){

            case 1,2,3,4,5:
                System.out.println("1-5 arasindadir");
                break;

            case 6,7,8,9,10:
                System.out.println("5-10 arasindadir");
                break;
            default:
                System.out.println("10dan boyukdur");








        }

    }
}