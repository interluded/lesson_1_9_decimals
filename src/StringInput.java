    import java.util.Scanner;
    public class StringInput
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Whats your favourite colour");
            String colour = scan.nextLine();
            System.out.print("Your favourite colour is " + colour + "? Mine is too!");
        }
    }