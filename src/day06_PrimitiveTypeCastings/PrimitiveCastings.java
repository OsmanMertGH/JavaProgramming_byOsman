package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        int x = 555;
        
        short y = (short) x;
        byte z = (byte) x;

        double d1 =20.5;
        short s1 = (short) d1;

        System.out.println("s1 = " + s1);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    
    }

}
