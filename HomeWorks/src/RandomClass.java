import java.util.Random;

public class RandomClass {

    public static void main(String[] args){
        Random random = new Random();
        int [][] arr = new int[5][2];
        for (int i=0; i<arr.length; i++){
            for (int col=0; col<arr[i].length; col++ ){
                arr[i][col] = random.nextInt(10);
                System.out.printf("%3d",arr[i][col]);
            }
            System.out.println();
          }

        int[] items = { 1, 2,3,4,11,12,13,14 };

        int sum = 0;
        for (int u =0 ; u <items.length; u++){
         if (u >10){
             sum =+u; // nesummējas pareizi
         }
        }
        System.out.println("Sum if u>10: "+sum);



        boolean [] cros= new boolean[]{true, true, true, false};
        //vai var izbraukt caur 'so krustojumu?

        for (boolean position : cros){
            if (!position ){
                System.out.println("STOP");
            }

        }

        int [] arr1 = new int []{4,3,2,7, 4, 15, 1,9};
        int mazakais = arr1[0];

        for (int k = 0; k<arr1.length; k++){
            if (arr1[k]<mazakais){
                mazakais =k;
            }
        }
        int max = 0;
        for (int j = 0; j<arr1.length; j++){
            if (arr1[j]>max){
                max =j;
            }
        }
        System.out.println("Min value is: " +mazakais);
        System.out.println("Max value is "+max);

        String [] names = new String[]{"Zane", "Anna", "Paula", "Krista", "Monta"};
        int z = 0;
        do {
            System.out.println(names[z]);
            z++;

        }while (z<names.length);








    }
}
