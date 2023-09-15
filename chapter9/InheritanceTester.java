package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Mina");
        System.out.println(mom.getName() + " is a " + mom.getGender());

        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }


    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculateParimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculateParimeter());
    }
}
