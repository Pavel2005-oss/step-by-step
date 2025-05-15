package tasks;
/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task.md is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.


Тролли атакуют ваш раздел комментариев!
Обычный способ справиться с этой ситуацией — удалить все гласные из комментариев троллей, нейтрализовав угрозу.
Ваша задача — написать функцию, которая принимает строку и возвращает новую строку, в которой удалены все гласные.

Например, строка «This website is for losers LOL!» станет «Ths wbst s fr lsrs LL!».
Примечание: для этой ката y не считается гласной.
*/

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Trolls {

    public static String deletedLetters(String text) {
//        return text.replaceAll("[aeiоuyAEIOUY]", "");
        return text.replaceAll("(?i)[aeiouy]", "");
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите свой коментарий: ");
//        String com = scanner.nextLine();

        System.out.println(deletedLetters("i go home"));

    }
}


















