import java.util.*;
class ArrayListExample2
{
        public static void main(String[] args)
        {
                ArrayList<String> sub = new ArrayList<String>();
                System.out.println("Size of ArrayList: "+sub.size());
                
                sub.add("English");
                sub.add("Hindi");
                System.out.println("Elements of first ArrayList: "+sub);

                ArrayList<String> sub1 = new ArrayList<String>();
                sub1.add("Mathematics");
                sub1.add("Physics");
               
                sub1.addAll(sub);
                System.out.println("Elements of second ArrayList: "+sub1);
               
                sub1.remove("Mathematics");
                System.out.println("Elements of ArrayList after deletion: "+sub1);
                System.out.println("Size of ArrayList: "+sub1.size());
         System.out.println("The element at 2nd index is: "+sub1.get(2));
        }
}
