package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place;

public class Warehouse
{
    private String warehouse_ID;
    private String warehouse_name, address;

    public Warehouse()
    {
    }
    private Warehouse(Builder builder)
    {
        this.warehouse_ID = builder.warehouse_ID;
        this.warehouse_name = builder.warehouse_name;
        this.address = builder.address;
    }

    public Warehouse(String warehouse_ID, String warehouse_name, String address)
    {
        this.warehouse_ID = warehouse_ID;
        this.warehouse_name = warehouse_name;
        this.address = address;
    }

    public String getWarehouse_ID()
    {
        return warehouse_ID;
    }

    public void setWarehouse_ID(String warehouse_ID)
    {
        this.warehouse_ID = warehouse_ID;
    }

    public String getWarehouse_name()
    {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name)
    {
        this.warehouse_name = warehouse_name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public static class Builder{

        private String warehouse_ID;
        private String warehouse_name, address;

        public Builder warehouse_ID(String warhouse) {
            this.warehouse_ID = warehouse_ID;
            return this;
        }

        public Builder warehous_name(String warehouse_name) {
            this.warehouse_name = warehouse_name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Warehouse build() {
            return new Warehouse(this);
        }

    }
    @Override
    public String toString()
    {
        return "Warehouse{" +
                "warehouse_ID=" + warehouse_ID +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
