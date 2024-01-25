package Grocery;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String item){
        String[] splitItems=splitItems(item);
        for (String item1:splitItems){
            String itemTrimmed=item1.trim();
            if ((checkItemIsInList(itemTrimmed))){
                System.out.println("bu öge var");
            }
            items.add(itemTrimmed);
            sortMethod();
        }


    }

    public void removeItems(String item){
        String[] splitItems=splitItems(item);
        for (String item1:splitItems){
            String itemTrimmed=item1.trim();
            if (!(checkItemIsInList(itemTrimmed))){
                System.out.println("bu öğe olmadığı için silinemez!!");
            }
            items.remove(itemTrimmed);
        }
    }

    private void sortMethod() {
        Collections.sort(items);
    }

    public boolean checkItemIsInList(String item){
        return items.contains(item);
    }

    private String[] splitItems(String items) {
        return items.split(",");
    }
    public  void printSorted(){
        System.out.println("pazar listesi");
        this.items.forEach(item2-> System.out.println(item2));
    }
}
