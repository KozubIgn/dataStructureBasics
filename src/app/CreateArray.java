package app;
import java.util.ArrayList;

public class CreateArray {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();

        //Add
        animals.add("lion");
        System.out.println(animals);
        animals.add("Tiger");
        animals.add("cat");
        animals.add("Dog");

        System.out.println(animals);

        animals.add(2, "Bird");
        System.out.println(animals);
        ArrayList<Integer> firstArraylistOfNumbers = new ArrayList<>();
        firstArraylistOfNumbers.add(1);
        firstArraylistOfNumbers.add(1234);
        ArrayList<Integer> secondArrayList = new ArrayList<>(firstArraylistOfNumbers);
        System.out.println(firstArraylistOfNumbers);
        System.out.println(secondArrayList);

        secondArrayList.add(3);
        System.out.println(firstArraylistOfNumbers);
        System.out.println(secondArrayList);

        //Iterating
        for (int i= 0; i < secondArrayList.size();i++){
        System.out.println(secondArrayList.get(i));
     }   
        //Third arraylist
        ArrayList<String> names = new ArrayList<>();
        names.add("john");
        names.add("bibi");
        names.add("mark");

        //finding indes of arg
        System.out.println("finding index " + names.indexOf("john"));
       // convert Array list to array
       String[] namesArray = names.toArray(new String[names.size()]);


    
    }
    
}
