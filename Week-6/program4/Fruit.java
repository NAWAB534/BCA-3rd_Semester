package program4;

public class Fruit {
    String color;
    String taste;
    int price;
    
    Fruit(){
        color = "Unknown";
        taste = "Unknown"; 
        price = 0;
    }
    
    Fruit(String color){
        this.color = color;
        this.taste = "Unknown"; 
        this.price = 0;
    }
    
    Fruit(String color, String taste){
        this.color = "Unknown";
        this.taste = taste; 
        this.price = 0;
    }
    Fruit(String color, String taste,int price){
        this.color = color;
        this.taste = taste; 
        this.price = price;
    }
    
    void display(){
        System.out.println("Color: "+color+ ", Taste: "+taste+ ", Price: Rs. "+price);
    }
    
    public static void main(String[]args){
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Red");
        Fruit f3 = new Fruit("Yellow" , "Sour");
        Fruit f4 = new Fruit("Green and Yellow" , "Sweet and tangy" , 150);
        
        
        f1.display();
        
        f2.display();
        
        f3.display();
    }
}
