public class Coins{
    private int money;

    public Coins(int money){
        this.money = money;

    }

    public int getMoney(){
        return money;
    }

    public void setmoney(int f){
        money = f;
    }

    public int quarters(){
        return money/25;
    }

    public int dimes(){
        return (money-  (quarters() * 25)) /10;
    }

    public int nickels(){
        return (money-(quarters()*25) - (dimes()*10))/5;
    }

    public int pennys(){
        return (money-(quarters()*25) - (dimes()*10) - nickels()*5);
    }


}



