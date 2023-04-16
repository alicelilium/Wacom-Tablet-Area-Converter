import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        double Width;
        double Height;
        double Right;
        double Left;
        double Bottom;
        double Top;
        double xOffset;
        double yOffset;

        // user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tablet width: ");
        Width = input.nextDouble();

        System.out.print("Enter tablet height: ");
        Height = input.nextDouble();

        System.out.print("Enter tablet X Offset: ");
        xOffset = input.nextDouble();

        System.out.print("Enter tablet Y Offset: ");
        yOffset = input.nextDouble();

        // formulas
        Right = (100.0 * xOffset) + (50.0 * Width);
        Left = Right - (100.0 * Width);
        Bottom = (100.0 * yOffset) + (50.0 * Height);
        Top = Bottom - (100.0 * Height);

        // original formulas
        // Width = (Right - Left) / 100.0;
        // Height = (Bottom - Top) / 100;
        // xOffset = (Left / 100) + (Width / 2);
        // yOffset = (Top / 100) + (Height / 2);

        // print out results
        System.out.println("Top: " + Top);
        System.out.println("Bottom: " + Bottom);
        System.out.println("Left: " + Left);
        System.out.println("Right: " + Right);

        input.close();
    }
}