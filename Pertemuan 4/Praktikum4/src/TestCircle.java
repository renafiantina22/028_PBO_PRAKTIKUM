
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0, "blue");

        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c1 area = " + c1.getArea());
        System.out.println(c1);

        System.out.println();

        System.out.println("c2 radius = " + c2.getRadius());
        System.out.println("c2 area = " + c2.getArea());
        System.out.println(c2);

        System.out.println();

        System.out.println("Sebelum diubah:");
        System.out.println("c3 radius = " + c3.getRadius());
        System.out.println("c3 area = " + c3.getArea());
        System.out.println(c3);

        System.out.println();
        c3.setRadius(5.0);
        c3.setColor("purple");

        System.out.println("Setelah diubah:");
        System.out.println("c3 radius = " + c3.getRadius());
        System.out.println("c3 area = " + c3.getArea());
        System.out.println(c3);
    }
}
