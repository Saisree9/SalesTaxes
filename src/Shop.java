import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by saisree on 8/24/15.
 */
public class Shop {
    List<Object> listOfMedicines=new ArrayList<>();
    List<Object> itemInformation=new ArrayList<>();
    int i;
    String item1;
    Integer quantityOfItem1;
    Double cost;
    Double totalCost;
    private void addMedicines(){
        listOfMedicines.add("HeadAchePills");
    }

    public void getReceipt() {
        System.out.println("Number Of Items:");
        Scanner scanner = new Scanner(System.in);
        int  noOfItems = scanner.nextInt();
        while (i < noOfItems) {
            Scanner inputItems = new Scanner(System.in);
            System.out.println("Enter the Item :");
            item1 = inputItems.nextLine();
            for (String str :item1.split(" "))
                    itemInformation.add(str);
            System.out.println("Enter the no.of items:");
            quantityOfItem1 = new Integer(inputItems.nextLine());
            System.out.println("Enter the Price: ");
            cost = new Double(inputItems.nextLine());
            if (itemInformation.contains("imported")){
                totalCost=cost+cost*0.1+cost*0.05;
                System.out.println(quantityOfItem1+" " +" "+ item1+" " + " "+ cost);
            }
            else if (Objects.equals(item1, "book"))
                if (quantityOfItem1==1)
                System.out.println(quantityOfItem1+" " +" "+ item1+" " + " "+ cost);
            else if (Objects.equals(item1,"music") || Objects.equals(item1,"chocolate"))
                    if (quantityOfItem1==1) {
                        totalCost=cost+cost*0.1;
                        System.out.println(quantityOfItem1+" " +" "+ item1+" " + " "+ cost);                    }
            i++;

        }
    }
}
class Test{
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.getReceipt();

    }
}