
import java.util.Scanner;
class Arraysizecheck
{
    public static void main(String[] args) {
        int arr[];
    Scanner s =new Scanner(System.in);
        try {
            System.out.println("Enter the size of a element :");
            int size =s.nextInt();
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            arr= new int[size];
            System.out.println("Array created with size: " + arr.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }
    
}