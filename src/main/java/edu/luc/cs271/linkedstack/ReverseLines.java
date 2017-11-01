package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
  final Scanner input = new Scanner(System.in);
  printReverse(input);
  }
  
  private static void printReverse(final Scanner input) {
    // done recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    String line = input.nextLine();
    Stack<String> reverse = new Stack<String>();
    if (line.equals("")) {
      return;
    }
      else {
      reverse.push(line);
      System.out.println(line);
      printReverse(input);
    }
    System.out.println(reverse.pop());
  }
}
