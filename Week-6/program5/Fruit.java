package program5;

public class Fruit {
    String color;
    String taste;
    double price;
    
    Fruit(){
        this("Unknown");
    }

    Fruit(String color) {
        this(color, "Unknown");
    }

    Fruit(String color, String taste) {
        this(color, taste, 0.0);
    }
    
    Fruit(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Red");
        Fruit f3 = new Fruit("Yellow", "Sour");
        Fruit f4 = new Fruit("Orange", "Sweet", 150.0);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}

