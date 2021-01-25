import java.util.*;

public class FoodOrder {
    public static void main(String[] args) {
        double[][] priceList = {{17.99,15.99,12.99},
                {18.99,18.99,10.99},
                {21.99,22.99,26.99}};

        int[][] feedList = {{5,7,4},
                {7,7,5},
                {8,5,10}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many people Want Food : ");
        int people = Integer.parseInt(sc.nextLine());
        if(people>=10 && people<=100){
            int countryChoice,foodOption,nOfTrays,leftOvers,feeds;
            double subTotal,tax,tip,price,grandTotal,perPerson;
            while (true) {
                displayMainMenu();
                countryChoice = Integer.parseInt(sc.nextLine());
                if(countryChoice>=1 && countryChoice<=3){
                    break;
                }
            }

            while (true) {
                switch(countryChoice){
                    case 1:
                        displayItalianFoodMenu();
                        break;
                    case 2:
                        displayChineseFoodMenu();
                        break;
                    case 3:
                        displayAmericanFoodMenu();
                        break;
                }
                foodOption = Integer.parseInt(sc.nextLine());
                if (foodOption>=1 && foodOption<=3) {
                    break;
                }
            }
            feeds = feedList[countryChoice-1][foodOption-1];
            price = priceList[countryChoice-1][foodOption-1];
            nOfTrays = determineTrays(people,feeds);
            subTotal = getSubtotal(price,nOfTrays);
            tip = getTip(subTotal,0.15);
            tax = getTax(subTotal,0.07);
            grandTotal = getGrandTotal(subTotal,tip,tax);
            leftOvers = determineLeftOvers(feeds,nOfTrays,people);
            perPerson = pricePerPerson(grandTotal,people);
            System.out.println("You Need "+" "+nOfTrays+" trays");
            System.out.println("Feeds :"+" "+feeds);
            System.out.println("Price for "+" "+people+" people ("+nOfTrays+" trays)"+":"+subTotal);
            System.out.println("Tax : "+(String.format("%.2f",tax)));
            System.out.println("Tip : "+(String.format("%.2f",tip)));
            System.out.println("Total(Food,Tax,Tip): "+String.format("%.2f",grandTotal));
            System.out.println("Price per Person :"+String.format("%.2f",perPerson));
            System.out.println("LeftOver servings for the delivery Person :"+leftOvers);
        }else{
            System.out.println("We can't make Order for LessThan 10 people.");
        }
    }

    public static void displayMainMenu(){
        System.out.println("CHOOSE TYPE OF MEAL _ _ _ _");
        System.out.println("1. Italian\n2. Chinese\n3. American");
    }

    public static void displayItalianFoodMenu(){
        System.out.println("CHOOSE ONE ---");
        System.out.println("1. Lasangna - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup,salad and bread sticks pack - Feeds 4 - 12.99");
    }

    public static void displayChineseFoodMenu(){
        System.out.println("CHOOSE ONE ---");
        System.out.println("1. Chicken and Braccoli Tray(includes 7 wonton soups,7 egg rolls) - Feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Fork Tray(includes 7 hot and sour soups,7 egg rolls) - Feeds 7 - 18.99");
        System.out.println("3. Shrip Fried Rice Tray(includes 10 egg rolls)- Feeds 5 - 10.99");
    }

    public static void displayAmericanFoodMenu(){
        System.out.println("CHOOSE ONE ---");
        System.out.println("1. Hamberger and Hot Dog Tray - includes buns and condiments - Feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray-includes dipping sauces - Feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray-includes buns and peach clobber - Feeds 10 - 26.99");
    }

    public static int determineTrays(int people, int feeds){
        int nTrays = people/feeds;
        if(people%feeds>0){
            nTrays+=1;
        }
        return nTrays;
    }

    public static double getSubtotal(double price,int trays){
        return price*trays;
    }

    public static double getTax(double subtotal, double taxrate){
        return subtotal*taxrate;
    }

    public static double getTip(double subtotal, double tipRate){
        return subtotal*tipRate;
    }

    public static double getGrandTotal(double subtotal,double tax,double tip){
        return subtotal+tax+tip;
    }

    public static double pricePerPerson(double grandTotal,int people){
        return grandTotal/people;
    }

    public static int determineLeftOvers(int feeds,int trays,int people){
        return (trays*feeds)-people;
    }
}

