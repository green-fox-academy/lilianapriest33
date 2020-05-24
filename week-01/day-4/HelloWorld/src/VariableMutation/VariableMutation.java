package VariableMutation;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10;
        System.out.println(a);

        int b = 50;
        // make b smaller by 7
        b = b - 7;

        System.out.println(b);

        int c = 54;
        // please double c's value
        c = c * 2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            boolean yes = true;
            System.out.print(yes);
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((g2 * 2) > g1) {
            boolean yes = true;
            System.out.print(yes);
        }
    }
}
