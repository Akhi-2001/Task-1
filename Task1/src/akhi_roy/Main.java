/*
Name : Akhi Roy
ID : 2012020150
Section :  D
Email: cse_2012020150@lu.ac.bd
Date : 12-7-21

*/

package akhi_roy;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String section = inp.nextLine();

        Info detail = new Info ();
        Hobby hby = new Hobby();
        System.out.println("Section: " + section);
        System.out.println("Name: " + detail.name);
        System.out.println("ID: " + detail.id);
        System.out.println("Hobby: " + hby.hobbyName);
    }
}