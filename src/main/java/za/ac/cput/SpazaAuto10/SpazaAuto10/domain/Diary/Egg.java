package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary;

public class Egg
{
    private String brand_name;
    private int quantity;

    public Egg()
    {
    }

    private Egg(Egg.Builder builder)
    {
        this.brand_name = builder.brand_name;
        this.quantity = builder.quantity;

    }
    public Egg(String brand_name, int quantity)
    {
        this.brand_name = brand_name;
        this.quantity = quantity;
    }

    public static class Builder{

        private String brand_name;
        private int quantity;
        private String dateArrived;

        public Egg.Builder brand_name(String brand_name)
        {
            this.brand_name = brand_name;
            return this;
        }
        public Egg.Builder quantity(int quantity)
        {
            this.quantity = quantity;
            return this;
        }



        public Egg build() {
            return new Egg(this);
        }

    }

}
