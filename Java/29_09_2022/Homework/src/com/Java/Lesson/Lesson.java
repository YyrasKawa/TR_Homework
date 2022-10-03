package com.Java.Lesson;

public class Lesson {
        public static void main(String[] args) {

//        Создать строку через new - I study Basic Java!
//        Распечатать последний символ строки. Используем метод String.charAt()

            String str =  new String("I study Basic Java!");
            int  strLength = str.length();
            System.out.println( "Последний символ строки: " + str.charAt(strLength- 1 ));

//        Заменить все буквы 'a' на '*' в переменной String, которая была создана в п.1 этого задания

            String replaceString=str.replace( 'a' , '*' );
            System.out.println(replaceString);

        }
    }
