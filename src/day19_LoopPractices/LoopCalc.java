package day19_LoopPractices;

public class LoopCalc {

    public static int getDup(String[] arr) {
        int count = 0;
        int getDup = 0;

        //4 1 2 aa 2 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count==1){
                        count++;
                    }
                }
            }

        }


        return count;


    }
}
