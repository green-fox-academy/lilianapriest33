//package DataStructures.Sharpie;

import DataStructures.Sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie newSharpie = new Sharpie("magenta",2.5f, 100.0f);

        newSharpie.use();
        newSharpie.get();
        newSharpie.use();
        newSharpie.get();
        newSharpie.use();
        newSharpie.get();
    }
}
