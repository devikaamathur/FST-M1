package activities;
import java.util.*;
import java.io.*;

public class Activity2 {

    public static void main( String args[] ){
        int[] digits;
        digits = new int [] {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: "+Arrays.toString(digits));
        int total=0;
        for (int i=0; i< digits.length; i++)
        {
            if (digits[i]==10)
            {
                total += digits[i];

                if (total==30)
                {
                    System.out.println("True");;
                }
            }
        }
    }

}

