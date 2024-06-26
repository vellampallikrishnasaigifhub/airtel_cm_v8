class MObile {
    String brand;
    int price;
    static String name;

    static {
        name = "phone";
        System.out.println("hi");
    }

    public MObile() {
        brand = "";
        price = 200;
        System.out.println("hello");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class heo {
    public static void main(String args[]) {
    }
}