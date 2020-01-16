package app;

import java.util.ArrayList;

public class GroceryList{
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }
    
        public void printGroceryList(){
            System.out.println("you have" + groceryList.size()+ "elements in Grocery list");
            for (int i = 0; i< groceryList.size(); i++) {
                System.out.println((i+1) + "."+ groceryList.get(i));
    }
}
                public void removeGroceryItem(int item) {
                    groceryList.remove(item - 1);
    }    
}