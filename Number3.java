import java.util.*;
public class Number3 
{
    public static void main(String args[])
    {
  
       
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(120);
        arr.add(41);
        arr.add(32);
        arr.add(71);
        arr.add(61);
  
        int min = arr.get(0);
        int max = arr.get(0);
  
       
        int n = arr.size();
  
        
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
  
        
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
  
       
        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }
}