public class ConvertHexToDecimal
{
   public static void main(String[] args)
   {
      String strHex = "7A";
      int decimal = Integer.parseInt(strHex, 16);
      System.out.println("Decimal number : " + decimal);
   }
}
