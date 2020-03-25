import java.util.Scanner;

public class Pudienas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("TRUE or FALSE?");
        boolean grib = sc.nextBoolean();

        if (Boolean.TRUE.equals(grib)){
            System.out.println("Būs pusdienas");
        }else{
            System.out.println("Nebūs");
        }
    }
}
