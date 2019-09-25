package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary;

public class Milk
{
    private String milk_name;
    private String brand_name;

    public Milk()
    {
    }
    private Milk(Milk.Builder builder)
    {
        this.milk_name = builder.milk_name;
        this.brand_name = builder.brand_name;

    }

    public Milk(String milk_name, String brand_name)
    {
        this.milk_name = milk_name;
        this.brand_name = brand_name;
    }

    public String getMilk_name()
    {
        return milk_name;
    }

    public void setMilk_name(String milk_name)
    {
        this.milk_name = milk_name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public static class Builder
    {

        private String milk_name;
        private String brand_name;

        public Milk.Builder milk_name(String milk_name)
        {
            this.milk_name = milk_name;
            return this;
        }

        public Milk.Builder brand_name(String brand_name)
        {
            this.brand_name = brand_name;
            return this;
        }


        public Milk build()
        {
            return new Milk(this);
        }
    }

    @Override
    public String toString()
    {
        return "Milk{" +
                "milk_name='" + milk_name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }
}
