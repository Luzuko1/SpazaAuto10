package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry;

public class Toiletry
{
    private String toiletry_ID;
    private String name;
    private String brand_name;
    private int quantity;
    private double price;

    private Toiletry(Toiletry.Builder builder)
    {
        this.toiletry_ID = builder.toiletry_ID;
        this.price = builder.price;
    }

    public Toiletry(String toiletry_ID, String name, String brand_name, int quantity, double price)
    {
        this.toiletry_ID = toiletry_ID;
        this.name = name;
        this.brand_name = brand_name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getToiletry_ID()
    {
        return toiletry_ID;
    }

    public void setToiletry_ID(String toiletry_ID)
    {
        this.toiletry_ID = toiletry_ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "ToiletryFactory{" +
                "toiletry_ID=" + toiletry_ID +
                ", name='" + name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static class Builder{

        private String toiletry_ID;
        private double price;

        public Toiletry.Builder toiletry_ID(String toiletry_ID)
        {
            this.toiletry_ID = toiletry_ID;
            return this;
        }

        public Toiletry.Builder price(double price) {
            this.price = price;
            return this;
        }

        public Toiletry build() {
            return new Toiletry(this);
        }

    }
}
