package day19_LoopPractices;

public class FirstDuplicated2 {

    public static void main(String[] args) {

        String str = "abcefghdd";
        String result = "";
        int indexCh = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                    if (count > 1) {
                        indexCh = str.indexOf(ch);
                    }
                }

            }

        }
        System.out.println(indexCh);


    }

}

/*
2. Write a program that cna return the index number of the first duplicated character from a string
	3. Write a program that can display all the characters that appeared twice in the string.
	4. Write a program that can return the index number of the first unique character.
 */