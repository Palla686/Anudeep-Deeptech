public class Ascen 
{    
    public static void main(String[] args) 
{        
            
       
        int [] ar = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
         
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < ar.length; i++)
 {     
            System.out.print(ar[i] + " ");    
        }    
            
        for (int i = 0; i < ar.length; i++) 
{     
            for (int j = i+1; j < ar.length; j++) {     
               if(ar[i] > ar[j])
 {    
                temp = ar[i];   
               ar[i] = ar[j];    
                ar[j] = temp;    
               }     
            }     
        }    
          
    System.out.println();   
    System.out.println("Elements of array sorted in ascending order: ");    
     for (int i = 0; i < ar.length; i++)
 {     
     System.out.print(ar[i] + " ");    
    }    
  } }     