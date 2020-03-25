import java.util.Scanner;

public class NaudaKonta {
    public static void main(String[] args){
        int wallet = 30;
        Scanner sc =new Scanner(System.in);
        System.out.print("how much to withdraw?(0-30) ");
        int withdraw = sc.nextInt();
        int balance = wallet-withdraw;

        while (true){


            if(withdraw<=30){
                System.out.println("balance is:"+ balance);
                break;
            }else{
                System.out.println("not enough money!");
                break;
            }
        }


    }
}
