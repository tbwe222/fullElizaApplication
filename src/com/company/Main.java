package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[] str;
        String[] qualifiers = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit",
                "Why do you say that","You seem to think that","So, you are concerned that"};

        boolean quit = false;

        System.out.print("Good day. What is your problem? ");

        while(!quit){
            int randomValue = rand.nextInt(qualifiers.length-1);

            System.out.print( "Enter your response here or Q to quit:");

            String response = scan.nextLine();

            str = response.split(" ");

            if(response.equalsIgnoreCase("q")){
                quit = true;
                System.out.println(">>> end");
            }
            else {
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equalsIgnoreCase("i"))
                        str[i] = "you";
                    else if (str[i].equalsIgnoreCase("me"))
                        str[i] = "you";
                    else if (str[i].equalsIgnoreCase("my"))
                        str[i] = "your";
                    else if (str[i].equalsIgnoreCase("am"))
                        str[i] = "are";
                    else
                        str[i] = str[i];
                }

                List<String> list = Arrays.asList(str);
                String names = String.join(" ", list);
                if (randomValue >= 3){
                    System.out.print(qualifiers[randomValue]+" ");
                    System.out.println(names + "?");
                }
                else
                    System.out.println(qualifiers[randomValue]+"!");
                quit = false;
            }

        }
    }
}