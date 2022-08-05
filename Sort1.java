import java.util.Arrays;
public class Sort1
{
public static void main(String[] args) 
{
int[] intArr = {8,4, 3, 15, 6};
String[] strArr = {"C", "O", "I","P","U"};
Arrays.sort(intArr);
Arrays.sort(strArr);
System.out.println(Arrays.toString(intArr));
System.out.println(Arrays.toString(strArr));
}
}