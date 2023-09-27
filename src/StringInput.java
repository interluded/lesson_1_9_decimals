import java.util.Scanner;
public class StringInput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("whats yo name ");
        System.out.print("name: ");
        String name = scan.nextLine();

        System.out.println("my name is " + name);



    }
}