package Problem_8;

class Restaurant
{
    String name;

    static  final double TAX_Rate=.10;

    Restaurant(String name)
    {
        this.name=name;
    }

    double calculateTotalBill(double foodPrice)
    {
        return foodPrice+foodPrice*TAX_Rate;
    }

    int estimateDelivaryTime()
    {
        return 40;
    }

    void DisplayInfo()
    {
        System.out.println(this.name +"estimated delivary time: "+estimateDelivaryTime()+ " minutes");
    }

}

class FastFoodRestaurant extends Restaurant
{
    static final double Fastfood_Tax_Rate=.15;
    FastFoodRestaurant(String name)
    {
     //   this.name=name;
        super(name);
    }
    @Override
    double calculateTotalBill(double foodPrice)
    {
        return foodPrice+foodPrice*Fastfood_Tax_Rate;
    }

    @Override
    int estimateDelivaryTime()
    {
        return 20;
    }
}

class FineDinningRestuarant extends Restaurant
{
    FineDinningRestuarant(String name)
    {
        super(name);
    }

    @Override
    int estimateDelivaryTime()
    {
        return 60;
    }

}


public class methodOverrdings {
    public static void main(String[] arg)
    {
        Restaurant genericRestaurant=new Restaurant("Normal");
        FastFoodRestaurant fastFood=new FastFoodRestaurant("fast-food");
        FineDinningRestuarant fineDinning=new FineDinningRestuarant("Luxury-food");

        genericRestaurant.DisplayInfo();
        fastFood.DisplayInfo();
        fineDinning.DisplayInfo();

        double foodPrice=100;
        System.out.println("Total Bill:"+foodPrice);
        System.out.println(genericRestaurant.name+" Total Bill: "+ genericRestaurant.calculateTotalBill(foodPrice));
        System.out.println(fastFood.name+" Total Bill: "+ fastFood.calculateTotalBill(foodPrice));
        System.out.println(fineDinning.name+" Total Bill: "+ fineDinning.calculateTotalBill(foodPrice));
    }

}
