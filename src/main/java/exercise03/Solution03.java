/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Seoyoung Kong
 */

package exercise03;

import java.util.Scanner;

public class Solution03 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What is the quote? ");
        String quote = in.nextLine();

        System.out.println("Who said that? ");
        String person = in.nextLine();

        System.out.println(person + " says, " + "\"" + quote + "\"");
    }
}