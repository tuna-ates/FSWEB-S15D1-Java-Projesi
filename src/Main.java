import Grocery.GroceryList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GroceryList groceryList=new GroceryList();
        int choice;

        do{
            System.out.println("Yapılmak istenen operasyonu seçiniz(0:quit,1:ekleme,2:çıkarma)");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("eklemek istediğiniz elemanları giriniz(virgül kullanrak)");
                    String items=scanner.nextLine();
                    groceryList.addItems(items);
                    break;

                case 2:
                    System.out.println("silmek istediğiniz elemanları giriniz(virgül kullanarak");
                    String removeItems=scanner.nextLine();
                    groceryList.removeItems(removeItems);
                    break;

            }
            groceryList.printSorted();
        }while (choice!=0);
           scanner.close();

    }
}