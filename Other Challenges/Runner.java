// Problem: Design a phone book system to store inputted values and allow for easy retrieval of phone numbers.

import java.util.*;
import java.io.*;

public class Runner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of contacts in the phone book: ");
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            System.out.print("Enter name of person " + (i+1) + ": ") ;
            String name = in.next();
            System.out.print("Enter " + name +" phone number: ");
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            System.out.println("Enter name of person to find: ");
            String s = in.next();
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();

        System.out.println("It works");
    }
}
