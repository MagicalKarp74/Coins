public class Main{

    public static void main(String[] args) {

        Coins amount = new Coins(41);
        System.out.println(amount.getMoney() + " cents:" );
        System.out.println("Quarter(s) "+amount.quarters());
        System.out.println("Dime(s) "+amount.dimes());
        System.out.println("Nickel(s) "+amount.nickels());
        System.out.println("Penny(s) "+amount.pennys());


}
}