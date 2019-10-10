package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage;

public class Soda extends Drinks
{
    private String brand_name;

    private Soda(Builder builder)
    {
        this.brand_name = builder.brand_name;

    }

    public Soda(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public Soda(String drink_ID, int size, int quantity, String drink_Name, String brand_name)
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

        public Builder brand_name(String brand_name) {
            this.brand_name = brand_name;
            return this;
        }

        public Soda build() {
            return new Soda(this);
        }

    }
    @Override
    public String toString()
    {
        return "Soda{" +
                "brand_name='" + brand_name + '\'' +
                '}';
    }
}
