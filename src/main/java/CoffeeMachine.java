class CoffeeMachine{


    public double coffee_powder, milk, water;
    public int Coffee_Count = 0;

    double mxCoffee = 500.0, mxMilk = 10, mxWater = 20;
    public CoffeeMachine(){
        this.coffee_powder=0;
        this.milk=0;
        this.water=0;
    }
    public boolean atMaxCapacity(double coffeeAmount, double milkAmount, double waterAmount){
        if (coffeeAmount + this.Coffee_Count>this.mxCoffee
                || milkAmount + milk> this.mxMilk
                || waterAmount + water > this.mxWater){
            return true;
        }
        return false;
    }
    public boolean fillIngredients(double coffeeAmount, double milkAmount, double waterAmount){
        if (atMaxCapacity(coffeeAmount,milkAmount,waterAmount)){
            return false;
        }
        this.coffee_powder = 500.0;
        this.milk = 10;
        this.water= 20;
        return true;

    }
    public boolean canMakeCoffee(){
        if (this.coffee_powder >= 10 && this.milk >= 0.5 && this.water >= 0.25) {
            return true;
        }
        return false;
    }

    public boolean makeCoffee() {

        if (canMakeCoffee()) {
            this.coffee_powder = this.coffee_powder - 10;
            this.milk = this.milk - 0.5;
            this.water = this.water - 0.25;
            this.Coffee_Count++;
            return true;
        } else {
           return false;
        }
    }
}
