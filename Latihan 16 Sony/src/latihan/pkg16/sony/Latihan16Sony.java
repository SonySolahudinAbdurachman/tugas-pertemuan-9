/*
 * To change this template, choose Tools | Templates
 * and open the templat in the editor.
 */
package latihan.pkg16.sony;

/**
 *
 * @author MY PC
 * Nama : Sony Solahudin Abdurachman
 * Kelas : TI-IC
 * NIM : A2.1900171
 */
public class Latihan16Sony {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = "+ a);
        System.out.println("Nilai b = "+ b);
        System.out.println("Nilai c = "+ c+"\n");
        
       c = a + b;
       System.out.println("a + b = "+ c);
       c += a;
       System.out.println("c += a = "+ c);
       c -= a;
       System.out.println("c -= a = "+ c);
       c *= a;
       System.out.println("c *= a = "+ c);
       a = 10;
       c = 15;
       c /= a;
       System.out.println("c /= a = "+ c);
       a = 10;
       c = 15;
       c %= a;
       System.out.println("c %= a = "+ c);
       c <<= 2;
       System.out.println("c <<= 2 = "+ c);
       c >>= 2;
       System.out.println("c >>= 2 = "+ c);
       c >>= 2;
       System.out.println("c >>= a = "+ c);
       c &= a;
       System.out.println("c &= a = "+ c);
       c ^= a;
       System.out.println("c ^= a = "+ c);
       c |= a;
       System.out.println("c |= a = "+ c);
    }
}
