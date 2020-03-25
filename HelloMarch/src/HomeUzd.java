import java.util.Scanner;

public class HomeUzd {
    public static void main(String [] arg){
        System.out.print("Please enter the name of an item: ");
        Scanner sc = new Scanner(System.in);
        String itemName = sc.nextLine();
        itemName = itemName.substring(0,1).toLowerCase();

        switch (itemName) {
            case "b":
                System.out.println("First floor");
                break;

        }

        }
    }
