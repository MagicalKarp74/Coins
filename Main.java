public class Main{

    public static void main(String[] args) {

        Coins amount = new Coins(94);
        System.out.println("\n"+amount.getMoney() + " cents:" );
        System.out.println("Quarter(s) "+amount.quarters());
        System.out.println("Dime(s) "+amount.dimes());
        System.out.println("Nickel(s) "+amount.nickels());
        System.out.println("Penny(s) "+amount.pennys());

        Coins amount2 = new Coins(59);
        System.out.println("\n"+amount2.getMoney() + " cents:" );
        System.out.println("Quarter(s) "+amount2.quarters());
        System.out.println("Dime(s) "+amount2.dimes());
        System.out.println("Nickel(s) "+amount2.nickels());
        System.out.println("Penny(s) "+amount2.pennys());

        Coins amount3 = new Coins(19);
        System.out.println("\n"+amount3.getMoney() + " cents:" );
        System.out.println("Quarter(s) "+amount3.quarters());
        System.out.println("Dime(s) "+amount3.dimes());
        System.out.println("Nickel(s) "+amount3.nickels());
        System.out.println("Penny(s) "+amount3.pennys());


}
}