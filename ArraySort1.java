import java.util.Arrays;
public class ArraySort1
{
public static void main(String[] args) 
{
Integer[] numbers = new Integer[] {10,7, 9, 13, 17};
String[] alpha = new String[] {"E", "H", "G","A","C"};
Arrays.sort(numbers, Collections.reverseOrder());
Arrays.sort(alpha, Collections.reverseOrder());
System.out.println(Arrays.toString(numbers));
System.out.println(Arrays.toString(alpha));
}
}