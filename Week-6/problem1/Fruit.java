package problem1;
public class Fruit {
    String color;
    String taste;
    int price;
    
    void display(){
        System.out.println("Color: "+color+ ", Taste: "+taste+ ", Price: Rs. "+price);
    }
    
    public static void main(String[]args){
        Fruit f1 = new Fruit();
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 120;
        
        Fruit f2 = new Fruit();
        f2.color = "Yellow";
        f2.taste = "Sour";
        f2.price = 100;
        
        Fruit f3 = new Fruit();
        f3.color = "Green";
        f3.taste = "tangy";
        f3.price = 80;
        
        f1.display();
        
        f2.display();
        
        f3.display();
        
    }
}
