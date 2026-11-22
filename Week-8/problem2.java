package week8;
import java.util.Scanner;

class Edible {
    static class Fruit {
        public static void fruitDetails(String name, String taste) {
            System.out.println("Fruit Name: " + name + " | Taste: " + taste);
        }

        public void fruitPackaging(String packType) {
            System.out.println("Fruit Packaging: " + packType);
        }
    }

    static class Vegetable {
        public static void vegetableDetails(String name, String type) {
            System.out.println("Vegetable Name: " + name + " | Type: " + type);
        }

        public void vegetablePackaging(String packType) {
            System.out.println("Vegetable Packaging: " + packType);
        }
    }
}

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fruit Name: ");
        String fName = sc.nextLine();
        System.out.print("Enter Fruit Taste: ");
        String fTaste = sc.nextLine();
        System.out.print("Enter Fruit Packaging: ");
        String fPack = sc.nextLine();

        System.out.print("Enter Vegetable Name: ");
        String vName = sc.nextLine();
        System.out.print("Enter Vegetable Type: ");
        String vType = sc.nextLine();
        System.out.print("Enter Vegetable Packaging: ");
        String vPack = sc.nextLine();

        System.out.println("\n--- Edible Output ---");
        Edible.Fruit.fruitDetails(fName, fTaste);
        Edible.Fruit fruitObj = new Edible.Fruit();
        fruitObj.fruitPackaging(fPack);

        Edible.Vegetable.vegetableDetails(vName, vType);
        Edible.Vegetable vegObj = new Edible.Vegetable();
        vegObj.vegetablePackaging(vPack);

        sc.close();
    }
}