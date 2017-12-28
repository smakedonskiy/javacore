package com.kit.center.runners.classwork.lesson_1to10.lesson9;

public class Lesson9Runner {
    public static void main(String[] args) {
        //exs1
//        String message = "Hello\n\"Pepsi-cola\",\n\"Coca-cola\".";
//        System.out.println(message);

        //exs2
//        String mes = "";
//        char[] arr = {'H', 'e', 'l', 'l', 'o'};
//
//        for (char i : arr){
//            mes += i;
//            System.out.print(mes + "\t");
//        }
//        System.out.println("\n" + mes);

        //exs3
//        int a = 3;
//        String mes3 = "2" + a;
//
//        int intValue = Integer.valueOf(mes3);
//        String mes4 = mes3 + ".5";
//        double doubleValue = Double.valueOf(mes4);
//
//        System.out.println("str: " + mes3 + 2);
//        System.out.println("int: " + (intValue + 2));
//        System.out.println("double: " + (doubleValue + 2));

        //exs4
//        String s1 = "room";
//        String s2 = "room";
//        if (s1 == s2){ //сравнение ссылок
//            System.out.println(true);
//        }
//        if (s1.equals(s2)){ //сравнение значений
//            System.out.println(true);
//        }

        //exs5
        String palidrome = "MOOM";
        boolean isPalidrome = true;

        for (int i=0; i<palidrome.length()/2; i++){
            isPalidrome = isPalidrome && (palidrome.charAt(i) == palidrome.charAt(palidrome.length()- i-1));
        }
        if (isPalidrome)
            System.out.println("Palidrome");
        else System.out.println("Not palidrome");


    }
}
