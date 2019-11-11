import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.*; // By Default Import
class DataTypes{
    public static void main(String[] args) {
        byte age = 100; // 1 Byte
        short t = 10000; // 2 byte
        int a = 100; // 4 Byte
        long e = a; // Implicit TypeCasting
        a = (int)e;  // Explicit TypeCasting 
        long r = 100000; // 8 Byte
        //float rr = (float)10.20;
        float rr = 10.20f; // 4 byte
        double t2=100.20; // 8 byte
        char y = 'A'; // 2 byte (UNICODE)
        boolean k = true;  // 1 , 2, 4 
        // Reference Data Types
        // String , Wrapper Classes e.g Integer, Float, Double etc
        String name = "Amit";
        //name.indexOf("@")
        Integer w = 1000;
       String y1 =  w.toString();
       String hexaNumber = Integer.toHexString(2000);
       BigInteger bg = new BigInteger("100000000000000");
       BigInteger bg2 = new BigInteger("200000000000000");
       BigInteger bg3 = bg.add(bg2);
       BigDecimal bb = new BigDecimal("10000000000000.2222");


       // w.xxxValue()
    }
}