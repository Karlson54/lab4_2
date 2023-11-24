package com.example;

public class App {
    public String decodeVowels(String input) {
        return input.replaceAll("1", "a")
                    .replaceAll("2", "e")
                    .replaceAll("3", "i")
                    .replaceAll("4", "o")
                    .replaceAll("5", "u");
    }

    public String decodeConsonants(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (isConsonant(currentChar)) {
                chars[i] = getNextConsonant(currentChar);
            }
        }
        return new String(chars);
    }

    private boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    private char getNextConsonant(char c) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int index = consonants.indexOf(c);
        int nextIndex = (index + 1) % consonants.length();
        return consonants.charAt(nextIndex);
    }

    public static void main(String[] args) {
        App app = new App();

        String encodedMessage1 = "t2st3ng";
        String decodedMessage1 = app.decodeVowels(encodedMessage1);
        System.out.println("Encoded: " + encodedMessage1);
        System.out.println("Decoded: " + decodedMessage1);

        String encodedMessage2 = "ufttjoh";
        String decodedMessage2 = app.decodeConsonants(encodedMessage2);
        System.out.println("Encoded: " + encodedMessage2);
        System.out.println("Decoded: " + decodedMessage2);
    }
}
