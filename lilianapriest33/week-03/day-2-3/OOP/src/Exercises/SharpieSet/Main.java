package Exercises.SharpieSet;

import Exercises.Sharpie.Sharpie;

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

/*public class Arrays {
  public static void main(String[] args) {
    int[] myList = {1, 2, 3, 6};

    // all the array elements
    for (int i = 0; i < myList.length; i++) {
    }
  }
}*/

/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies*/