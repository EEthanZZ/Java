package ArrayList.lab4_1_Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private String name;
    private int qty;
    private ArrayList <Item> items;

    public ShoppingList(){
        items = new ArrayList<>();
    }
    public ShoppingList(String name, int qty){
        this.name = name;
        this.qty = qty;
        items = new ArrayList<Item>();
    }
    private void addItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Item name: ");
        String itemName = input.nextLine();
        System.out.println("Quantity?");
        int qty = input.nextInt();
        System.out.println("Price: ");
        double price = input.nextInt();
        Item new_item = new Item(itemName, qty);
        items.add(new_item);
    }
    private void listItems(){
        for (Item i : items){
            System.out.println(i);
        }
    }
    public void removeItem(){
        System.out.println("Remove an item: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (int i=0; i < items.size(); i++){
            Item it = items.get(i);
            if (it.geteName() == name){
                items.remove(i);
            }
        }
    }
    public int displayNoOfItems(){
        return items.size();
    }
    public void run(){
        boolean flag = true;
        int choice = 0;
        Scanner input_1 = new Scanner(System.in);
        while (flag){
            System.out.println("1: Add an item: \n" + 
            "2: Remove an item: \n" + 
            "3: List items: \n" + 
            "4: How Many Itmes: ");
            choice = input_1.nextInt();
            switch(choice){
                case 1:
                addItem();
                break;
                case 2:
                removeItem();
                break;
                case 3:
                listItems();
                break;
                case 4:
                displayNoOfItems();
                break;
                case 5: 
                default:
                flag = false;
                System.out.println("Wrong");
                break;
            }
        }
        }
    }


