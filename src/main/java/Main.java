import triangle.Asterisk;
import triangle.HorizontalLine;
import triangle.VerticalLine;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Introductory programming exercises--------");
        System.out.println("Triangle Exercises: ");
        System.out.println();
        System.out.println("Easiest exercise ever: ");
        Asterisk.draw();
        System.out.println("Draw a horizontal line: ");
        HorizontalLine.draw(8);
        System.out.println("Draw a vertical line: ");
        VerticalLine.draw(3);
    }
}
