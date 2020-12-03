package lesson2.exercise2Solution;

public class Task2 {

    public static void main(String[] args) {
        rot13("gbcFarnxl");
        rot13if("gbcFarnxl");
    }

    private static void rot13(String secret) {
        // tip: use the debugger to understand this function
        for (int i = 0; i < secret.length(); i++) {
            char ch = secret.charAt(i);
            int shiftToZero;
            // determine shift so that 0 represents a/A and 25 represents z/Z
            if (ch > 40 && ch < 91) {
                // char is big letter, shift = 65
                shiftToZero = 'A';
            } else if (ch > 60 && ch < 123) {
                // char is small letter, shift = 97
                shiftToZero = 'a';
            } else {
                // if char not in alphabet, skip it
                continue;
            }
            // first remove ascii representation
            // now a/A equal 0 and z/Z equal 25
            ch -= shiftToZero;
            // shift 13 characters in alphabet
            ch += 13;
            // catch any values higher than 25
            ch %= 26;
            // shift back to ascii representation
            ch += shiftToZero;
            System.out.print(ch);
        }
    }

    public static void rot13if(String secret) {
        for (int i = 0; i < secret.length(); i++) {
            char ch = secret.charAt(i);
            if       (ch >= 'a' && ch <= 'm') ch += 13;
            else if  (ch >= 'A' && ch <= 'M') ch += 13;
            else if  (ch >= 'n' && ch <= 'z') ch -= 13;
            else if  (ch >= 'N' && ch <= 'Z') ch -= 13;
            System.out.print(ch);
        }
        System.out.println();
    }

}
