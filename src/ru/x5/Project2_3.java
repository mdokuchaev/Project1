package ru.x5;

import java.util.Scanner;

public class Project2_3 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int i = 0;

    System.out.print("Введите целое число: ");
    String s = in.nextLine();
    
    try {
        i = Integer.parseInt(s);
        if (i >= 0) {
            i++;
        }  
        System.out.println("Введенное число: " + i);
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");    
    }
    in.close();
}
 
}
