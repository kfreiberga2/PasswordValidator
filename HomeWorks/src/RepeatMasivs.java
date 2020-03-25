import java.util.Arrays;

public class RepeatMasivs {
    public static void main(String[] args){
        int [] arr ={100, 200, 233, 66, 77, 98};
        int firstNum = arr[0];
        int lastNum = arr[arr.length-1];
        System.out.println(firstNum+" and "+ lastNum );

        int [] masivs = {7, 4, 7, 3, 6, 9, 2};
        int target = 9;
        int replace = 111;
        for (int i=0; i<masivs.length; i++){
            if(masivs[i]==target){
                masivs[i]=replace;
            }
            }
        System.out.println(Arrays.toString(masivs));

        String [] vardi ={"Jānis", "Pēteris", "Andris"};
        String target2 = "Pēteris";
        String replace2 = "Jēkabs";
        for(int j=0; j<vardi.length; j++){
            if(vardi[j].equalsIgnoreCase(target2)){
                vardi[j]=vardi[j].replace(target2,replace2);
                System.out.println(vardi[j]);
            }
        }


        }
}


