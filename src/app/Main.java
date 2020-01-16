package app;

import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
            boolean quit = false;
            int choice = 0;

            while (!quit){
                printMenu();
                System.out.println("enter choice:");
                choice = scanner.nextInt();
            }

                switch(choice) {
                    case 0:
                    printMenu();
                    break;

                    case 1:
                    groceryList.printGroceryList();
                    break;
                    
                    case 2:
                    addItem();

                    case 3:
                    removeItem();
                
                   case 4:
                   quit = true;
                   break;
                }

            }
    

    // Menu printing
    private static void printMenu(){
        System.out.println("Press");
        System.out.println("0 print menu");
        System.out.println("1 print grocerylist");
        System.out.println("2 add item to grocerylist");
        System.out.println("3 remove item from grocery list");
        System.out.println("exit");
    }

    private static void addItem() {
        System.out.println("enter the name of grocery list: ");
        String itemtoAdd = scanner.nextLine();
    groceryList.addGroceryItem(itemtoAdd);
}
private static void removeItem() {
    System.out.println("enter the name to remove");
    int itemNumber = scanner.nextInt();
        groceryList.removeGroceryItem(itemNumber);
   
    }
}