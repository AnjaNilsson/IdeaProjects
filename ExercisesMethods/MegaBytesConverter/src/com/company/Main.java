package com.company;


/*
MegaBytes Converter
---
** Please read this entire page before attempting to solve this coding exercise.
Additional help is available by watching the video mentioned at the bottom of the page **
---

Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from
the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes.
YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.

If the parameter kiloBytes is < 0 then print instead the text "Invalid Value".

Example: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
TIP: Be careful about spaces in the printed message.
TIP: Use the remainder operator
TIP: 1 MB = 1024 KB

*/
public class Main {

    public static void main(String[] args) {
	// write your code here

        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(0);

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes >= 0 ) {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + "KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
