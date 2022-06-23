package com.surajgautam.javacodingproblems;

public class CheckIfStringHasVowels {
    public static void main(String[] args) {
        final boolean value = checkVowel("Suraj");
        System.out.println(value);
        System.out.println(checkVowel("zxxxx"));
    }

    private static boolean checkVowel(String suraj) {
        final Character[] vowels = new Character[] {'a' ,'e', 'i', 'o', 'u'};
        suraj = suraj.toLowerCase();
        for (int i = 0; i < vowels.length; i++) {
                if(suraj.contains(vowels[i].toString())) {
                    return true;
                }
        }
        return false;
    }
}

