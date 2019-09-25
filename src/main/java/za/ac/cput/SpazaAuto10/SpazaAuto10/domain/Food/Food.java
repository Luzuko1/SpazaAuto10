package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food;

public class Food
{
    private String food_ID;
    private String name, description;
    private double price;

    public Food()
    {
    }

    private Food(Food.Builder builder)
    {
        this.food_ID = builder.food_ID;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }
    public String getFood_ID()
    {
        return food_ID;
    }

    public void setFood_ID(String food_ID)
    {
        this.food_ID = food_ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
        return "Food{" +
                "food_ID=" + food_ID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
    public static class Builder{

        private String food_ID;
        private String name, description;
        private double price;

        public Food.Builder food_ID(String food_ID)
        {
            this.food_ID = food_ID;
            return this;
        }
        public Food.Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Food.Builder description(String description) {
            this.description = description;
            return this;
        }
        public Food.Builder price(double price) {
            this.price = price;
            return this;
        }

        public Food build() {
            return new Food(this);
        }

    }
}
