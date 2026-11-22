package program2;

public class Fruit {
    String color;
    String taste;
    int price;
    
    void setDetails(String color, String taste,int price){
        this.color = color;
        this.taste = taste; 
        this.price = price;
    }
    
   void display(){
        System.out.println("Color: "+color+ ", Taste: "+taste+ ", Price: Rs. "+price);
    }
    
    public static void main(String[]args){
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        
        f1.setDetails("Red", "Sweet" , 120);
        f2.setDetails("Yellow", "Sour", 100);
        f3.setDetails("Green and Yellow", "Sweet and tangy", 150);
        
        f1.display();
        
        f2.display();
        
        f3.display();
        
    }
}

