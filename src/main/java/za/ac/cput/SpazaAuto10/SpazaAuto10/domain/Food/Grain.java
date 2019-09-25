package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food;

public class Grain
{
    private String grain_ID;
    private int quantity;
    private String dateBought;

    public Grain()
    {
    }

    private Grain(Grain.Builder builder)
    {
        this.grain_ID = builder.grain_ID;
        this.quantity = builder.quantity;
        this.dateBought = builder.dateBought;
        //this.price = builder.price;
    }
    public Grain(String grain_ID, int quantity, String dateBought)
    {
        this.grain_ID = grain_ID;
        this.quantity = quantity;
        this.dateBought = dateBought;
    }

    public String getGrain_ID()
    {
        return grain_ID;
    }

    public void setGrain_ID(String grain_ID)
    {
        this.grain_ID = grain_ID;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String getDateBought()
    {
        return dateBought;
    }

    public void setDateBought(String dateBought)
    {
        this.dateBought = dateBought;
    }

    public static class Builder{

        private String grain_ID;
        private int quantity;
        private String dateBought;

        public Grain.Builder grain_ID(String grain_ID)
        {
            this.grain_ID = grain_ID;
            return this;
        }
        public Grain.Builder quantity(int quantity)
        {
            this.quantity = quantity;
            return this;
        }

        public Grain.Builder dateBought(String dateBought) {
            this.dateBought = dateBought;
            return this;
        }


        public Grain build() {
            return new Grain(this);
        }

    }
    @Override
    public String toString()
    {
        return "Grain{" +
                "grain_ID=" + grain_ID +
                ", quantity=" + quantity +
                ", dateBought=" + dateBought +
                '}';
    }
}
