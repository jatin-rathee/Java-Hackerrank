import java.io.*;
import java.util.*;

public class javaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner("Hello World \nI am a file\nRead me until end-of-file\n");
        int i = 1;
        while (scan.hasNext()) {
            String str = scan.nextLine();
            str = i + " " + str;
            System.out.println(str);
            i++;
        }
    }
}

