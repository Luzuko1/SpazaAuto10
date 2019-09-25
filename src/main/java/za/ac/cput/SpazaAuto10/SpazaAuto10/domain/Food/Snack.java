package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food;

public class Snack
{
    private String snack_ID;
    private String snack_name, description;
    private double price;

    public Snack()
    {
    }

    private Snack(Builder builder)
    {
        this.snack_ID = builder.snack_ID;
        this.snack_name = builder.snack_name;
        this.description = builder.description;
        this.price = builder.price;
    }
    public Snack(String snack_ID, String snack_name, String description, double price)
    {
        this.snack_ID = snack_ID;
        this.snack_name = snack_name;
        this.description = description;
        this.price = price;
    }

    public String getSnack_ID()
    {
        return snack_ID;
    }

    public void setSnack_ID(String snack_ID)
    {
        this.snack_ID = snack_ID;
    }

    public String getSnack_name()
    {
        return snack_name;
    }

    public void setSnack_name(String snack_name)
    {
        this.snack_name = snack_name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
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
        return "Snack{" +
                "snack_ID=" + snack_ID +
                ", snack_name='" + snack_name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder{

        private String snack_ID;
        private String snack_name, description;
        private double price;


        public Builder snack_ID(String snack_ID) {
            this.snack_ID = snack_ID;
            return this;
        }

        public Builder snack_name(String snack_name) {
            this.snack_name = snack_name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Snack build() {
            return new Snack(this);
        }

    }

}
