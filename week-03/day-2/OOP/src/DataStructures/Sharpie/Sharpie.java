package DataStructures.Sharpie;

public class Sharpie<inkAmount> {

    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {     //decreasing ink amount by 1
        this.inkAmount -= 1;
        System.out.println("Decreasing ink amount by 1");
    }

    public void get() {      //current ink amount
        System.out.println("The current ink amount is : " + inkAmount);
    }
}