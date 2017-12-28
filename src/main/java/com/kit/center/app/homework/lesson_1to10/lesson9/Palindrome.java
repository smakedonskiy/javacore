package com.kit.center.app.homework.lesson_1to10.lesson9;

import com.kit.center.app.homework.service.AProgram;


public class Palindrome extends AProgram{

    private String word = "-1";
    private String userInput = "-1";
    private String messageTrue = "true";
    private String messageFalse = "false";

    public String getName() {
        return "\"Is the word a palindrome?\"";
    }

    public String getDescription() {
        return "\n* Program name: " + getName()
                + "\n* Description: You can input a word or a sentence"
                + "\n*              and get the message about palindrome.";
    }

    @Override
    public void run() {

    }

    public String getResult(){
        return null;
    }


    public void consoleOutput() {
        System.out.println("\nIs \"" + getUserInput() + "\" a palindrome?");
        printCharAt();
        printGetChars();
        printToCharArray();
        printSubstring();
        printStringBuffer();
    }

    public Palindrome(String sentence) {
        this.userInput = sentence;
        this.word = castToWord(sentence).toLowerCase();
    }

    public boolean isPalindromCharAt() {
        boolean result = true;
        for (int i = 0; i < word.length() / 2; i++) {
            result = result && (word.charAt(i) == word.charAt(word.length() - 1 - i));
        }
        return result;
    }

    public boolean isPalindromGetChars() {
        String subStr1 = "", subStr2 = "";
        int startSubStr1 = 0, endSubStr1 = word.length() / 2 - 1;
        int startSubStr2 = word.length() / 2, endSubStr2 = word.length() - 1;

        if (word.length() % 2 != 0) {
            startSubStr2 = word.length() / 2 + 1;
        }
        char[] buf1 = new char[++endSubStr1 - startSubStr1];
        char[] buf2 = new char[++endSubStr2 - startSubStr2];

        word.getChars(startSubStr1, endSubStr1, buf1, 0);
        word.getChars(startSubStr2, endSubStr2, buf2, 0);

        for (char c : buf1) {
            subStr1 += c;
        }
        for (int i = buf2.length - 1; i >= 0; i--) {
            subStr2 += buf2[i];
        }

        return subStr1.equals(subStr2);
    }

    public boolean isPalindromToCharArray() {
        char[] buf = word.toCharArray();
        String wordReverse = "";
        for (int i = buf.length - 1, j = 0; i >= 0; i--, j++) {
            wordReverse += buf[i];
        }
        return word.equals(wordReverse);
    }

    public boolean isPalindromSubstring() {
        int startSubStr1 = 0, endSubStr1 = word.length() / 2;
        int startSubStr2 = word.length() / 2, endSubStr2 = word.length();
        if (word.length() % 2 != 0) {
            startSubStr2 = word.length() / 2 + 1;
        }
        String subStr1 = word.substring(startSubStr1, endSubStr1);
        String subStr2 = word.substring(startSubStr2, endSubStr2);
        return subStr1.equals(new StringBuffer(subStr2).reverse().toString());
    }

    public boolean isPalindromStringBuffer() {
        return word.equals(new StringBuffer(word).reverse().toString());
    }

    private String castToWord(String sentence) {
        String castWord = "";
        for (String str : sentence.split(" ", 0)) {
            castWord += str;
        }
        return castWord;
    }

    public String getUserInput() {
        return userInput;
    }


    private void printCharAt() {
        System.out.print("charAt: ");
        if (isPalindromCharAt() == true)
            System.out.println(messageTrue);
        else System.out.println(messageFalse);
    }

    private void printGetChars() {
        System.out.print("getChars: ");
        if (isPalindromGetChars() == true)
            System.out.println(messageTrue);
        else System.out.println(messageFalse);
    }

    private void printToCharArray() {
        System.out.print("toCharArray: ");
        if (isPalindromToCharArray() == true)
            System.out.println(messageTrue);
        else System.out.println(messageFalse);
    }

    private void printSubstring() {
        System.out.print("substring(): ");
        if (isPalindromSubstring() == true)
            System.out.println(messageTrue);
        else System.out.println(messageFalse);
    }

    private void printStringBuffer() {
        System.out.print("StringBuffer: ");
        if (isPalindromStringBuffer() == true)
            System.out.println(messageTrue);
        else System.out.println(messageFalse);
    }
}
