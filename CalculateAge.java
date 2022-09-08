import java.time.LocalDate;  
import java.time.Period;  
import java.time.temporal.ChronoUnit;  
import java.util.Scanner;  
public class  CalculateAge
{  
public static void main(String args[])   
{  
LocalDate startDate = LocalDate.of(1995, 04, 30);  
LocalDate endDate = LocalDate.of(2021, 05, 01);   

long years = ChronoUnit.YEARS.between(startDate, endDate);  

System.out.println("You are " + years+" years old.");  
}  
}  

