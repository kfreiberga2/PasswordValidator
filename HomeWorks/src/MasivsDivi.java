import java.util.Arrays;

public class MasivsDivi {
    public static void main(String[] args){
        int[] numbers = { 1, 3, 4, 8, 0, 23 };
        String [] vardi ={"Juris", "Marta", "Anna", "Jana","Kristīne", "Jāzeps", "Sandra"};


        System.out.println(Arrays.toString(numbers));

        for (int target: numbers) {
            if (target>=5){
                System.out.println(target);
            }
        }

        System.out.println(Arrays.toString(vardi));
        for (String jjj: vardi){
            if(jjj.substring(0,1).equalsIgnoreCase("j")){
                System.out.println(jjj);
            }
        }



    }
}
