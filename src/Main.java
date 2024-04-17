import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter length of square");
        Integer side = line.nextInt();
        Integer perimeter = side*4;
        Integer area = side*side;
        System.out.println("Perimeter" + " " + "is" + " " + perimeter + " " + "metres");
        System.out.println("Area" + " " + "is" + " " + area + " " + "square metres");


    }
}