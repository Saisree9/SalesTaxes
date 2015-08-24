import java.util.Scanner;

/**
 * Created by saisree on 8/24/15.
 */
public class Shop {
    int i;
    String item1;
    Integer quantityOfItem1;
    Double cost;


    public void getReceipt() {
        System.out.println("Number Of Items:");
        Scanner scanner = new Scanner(System.in);
        Integer noOfItems = new Integer(scanner.next());
        while (i < noOfItems) {
            Scanner inputItems = new Scanner(System.in);
            System.out.println("Enter the Item :");
            item1 = inputItems.nextLine();
            System.out.println("Enter the no.of items:");
            quantityOfItem1 = new Integer(inputItems.nextLine());
            System.out.println("Enter the Price: ");
            cost = new Double(inputItems.nextLine());
            i++;

        }
    }
}
