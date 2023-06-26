package day19_LoopPractices;

public class FirstUniqCh {

    public static void main(String[] args) {

        String str = "aabc";
        String result = "";
        int indexCh = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each) {
                    count++;

                    if (count == 1) {
                        indexCh = str.indexOf(ch);
                        break;
                    }

                }


            }

        }
        System.out.println(indexCh);
    }

}

/*

	4. Write a program that can return the index number of the first unique character.
  */