package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage;

public class Energy extends Drinks
{
    private String brand_name;


    private Energy(Energy.Builder builder)
    {
        this.brand_name = builder.brand_name;
        //this.electricity_Company = builder.electricity_Company;
        //this.amount = builder.amount;
        //this.electricity_Price = builder.electricity_Price;
    }
    public Energy(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public Energy(String drink_ID, int size, int quantity, String drink_Name, String brand_name)
    {
        super(drink_ID, size, quantity, drink_Name);
        this.brand_name = brand_name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public static class Builder{

        private String brand_name;

        public Energy.Builder brand_name(String brand_name)
        {
            this.brand_name = brand_name;
            return this;
        }


        public Energy build() {
            return new Energy(this);
        }

    }
    @Override
    public String toString()
    {
        return "Energy{" +
                "brand_name='" + brand_name + '\'' +
                '}';
    }
}
