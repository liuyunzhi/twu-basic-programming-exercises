import diamond.Diamond;
import diamond.DiamondWithName;
import diamond.IsoscelesTriangle;
import fizzBuzz.FizzBuzz;
import triangle.Asterisk;
import triangle.HorizontalLine;
import triangle.RightTriangle;
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
        System.out.println("Draw a right triangle: ");
        RightTriangle.draw(3);

        System.out.println("Diamond Exercises: ");
        System.out.println();
        System.out.println("Isosceles Triangle: ");
        IsoscelesTriangle.draw(3);
        System.out.println("Diamond: ");
        Diamond.draw(3);
        System.out.println("Diamond with name: ");
        DiamondWithName.draw(3);

        System.out.println("FizzBuzz Exercise: ");
        System.out.println();
        System.out.println("FizzBuzz: ");
        FizzBuzz.draw(15);
    }
}
