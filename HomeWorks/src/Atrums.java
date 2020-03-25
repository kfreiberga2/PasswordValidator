import java.util.Scanner;

public class Atrums {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Pārsniegtais ātrums?(0-40) ");
        int speed = sc.nextInt();
        if(speed>=30) {
            System.out.println("Your Driving licence will be subtracted ");
        }else if (speed>=20 && speed <25){
            System.out.println("panalty 15eiro");

        }else{
            System.out.println("Nothing bad");
        }

    }
}
