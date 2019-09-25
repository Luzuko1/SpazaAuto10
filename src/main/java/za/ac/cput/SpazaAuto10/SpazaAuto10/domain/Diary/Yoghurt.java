package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary;

public class Yoghurt
{
    private String yoghurt_Name, brand_name;
    private int size,quantity;

    public Yoghurt()
    {
    }

    private Yoghurt(Builder builder)
    {
        this.brand_name = builder.brand_name;
        this.size = builder.size;
        this.yoghurt_Name = builder.yoghurt_Name;
        this.quantity = builder.quantity;
    }
    public Yoghurt(String yoghurt_Name, String brand_name, int size, int quantity)
    {
        this.yoghurt_Name = yoghurt_Name;
        this.brand_name = brand_name;
        this.size = size;
        this.quantity = quantity;
    }

    public String getYoghurt_Name()
    {
        return yoghurt_Name;
    }

    public void setYoghurt_Name(String yoghurt_Name)
    {
        this.yoghurt_Name = yoghurt_Name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public static class Builder{

        private String yoghurt_Name, brand_name;
        private int size,quantity;

        public Builder yoghurt_Name(String yoghurt_Name) {
            this.yoghurt_Name = yoghurt_Name;
            return this;
        }

        public Builder brand_name(String brand_name) {
            this.brand_name = brand_name;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Yoghurt build() {
            return new Yoghurt(this);
        }

    }
    @Override
    public String toString()
    {
        return "YoghurtRepositoryImpl{" +
                "yoghurt_Name='" + yoghurt_Name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }
}
