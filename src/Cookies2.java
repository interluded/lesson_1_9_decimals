import java.util.Scanner;
public class Cookies2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("How many cookies do you have?");
        int int1 = scan.nextInt();
        scan.nextLine();
        System.out.println("What type of cookies?");
        String type_cookie = scan.nextLine();
        System.out.println("You have " + int1 + " " + type_cookie + " cookies!");

    }


}
