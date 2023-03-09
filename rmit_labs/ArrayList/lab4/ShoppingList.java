package ArrayList.lab4;

import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.Attr;

public class ShoppingList extends Item{
    private ArrayList <Item> items;
    public ShoppingList(){
    }
    public ShoppingList(String name, double price, int qty){
        super(name, price, qty);
        items = new ArrayList<Item>();

    }
    private void addItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Item name: ");
        String itemName = input.nextLine();
        System.out.println("Quantity?");
        int qty = input.nextInt();
        Item new_item = new Item(name, qty);
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
        while (flag){
            System.out.println("1: Add an item: \n" + 
            "2: Remove an item: \n" + 
            "3: List items: " + 
            "4: How Many Itmes: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
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
                flag = false;
                break;

            }
        }
        }
    }


