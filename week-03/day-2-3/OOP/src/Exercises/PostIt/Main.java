package DataStructures.PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt orange = new PostIt("orange", "Idea1", "blue");
        PostIt pink = new PostIt("pink", "Awesome", "black");
        PostIt yellow = new PostIt("yellow", "Superb!", "green");

        System.out.println("The first postit is " + orange.bgColor + ", " + "the text is " + orange.text + ", " + "the textcolor is " + orange.textColor);
        System.out.println("The second postit is " + pink.bgColor + ", " + "the text is " + pink.text + ", " + "the textcolor is " + pink.textColor);
        System.out.println("The third postit is " + yellow.bgColor + ", " + "the text is " + yellow.text + ", " + "the textcolor is " + yellow.textColor);
    }
}

