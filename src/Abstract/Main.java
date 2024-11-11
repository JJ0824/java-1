package Abstract;

public class Main {
    public static void main(String[] args) {
        // Calculator 예제
        Addition addition = new Addition();
        addition.displayResult(2,4); // Result : 6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4); // Result : 8.0


        // Shape
        Circle circle = new Circle(5);
        System.out.println(circle.area()); // 78.53981633974483
        Shape rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.area()); // 24

        // Payment
        Payment cash1 = new Cash(8000, "A001",
                10000);
        if (cash1.processPayment()) {
            System.out.println(cash1.getReceipt());
        }
        Payment cash2 = new Cash(15000, "A001",
                10000);
        if (cash2.processPayment()) {
            System.out.println(cash2.getReceipt());
        }
    }
}
