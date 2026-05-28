public class itemscalculate1 {
    //Real life example: to calculate cost of a number of items.
public static void main(String[] args){
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

System.out.println("Number of items:" + items);
System.out.println("Cost per item:" + costPerItem + currency);
System.out.println("Total cost:" + totalCost + currency);
}
}
