import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class J03014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = new BigInteger(input.nextLine());
        BigInteger add = a.add(b);
        System.out.println(add);
    }
}


