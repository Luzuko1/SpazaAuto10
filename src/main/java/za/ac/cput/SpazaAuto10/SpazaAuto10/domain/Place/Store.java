package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place;

public class Store
{
    private String store_ID;
    private String store_name;
    private String store_description;
    private String store_address;

    public Store()
    {
    }

    private Store(Builder builder)
    {
        this.store_ID = builder.store_ID;
        this.store_name = builder.store_name;
        this.store_description = builder.store_description;
        this.store_address = builder.store_address;
    }

    public Store(String store_ID, String store_name, String store_description, String store_address)
    {
        this.store_ID = store_ID;
        this.store_name = store_name;
        this.store_description = store_description;
        this.store_address = store_address;
    }

    public String getStore_ID()
    {
        return store_ID;
    }

    public void setStore_ID(String store_ID)
    {
        this.store_ID = store_ID;
    }

    public String getStore_name()
    {
        return store_name;
    }

    public void setStore_name(String store_name)
    {
        this.store_name = store_name;
    }

    public String getStore_description()
    {
        return store_description;
    }

    public void setStore_description(String store_description)
    {
        this.store_description = store_description;
    }

    public String getStore_address()
    {
        return store_address;
    }

    public void setStore_address(String store_address)
    {
        this.store_address = store_address;
    }

    public static class Builder{

        private String store_ID;
        private String store_name;
        private String store_description;
        private String store_address;

        public Builder store_ID(String store_ID) {
            this.store_ID = store_ID;
            return this;
        }

        public Builder store_name(String store_name) {
            this.store_name = store_name;
            return this;
        }
        public Builder store_description(String store_description) {
            this.store_description = store_description;
            return this;
        }

        public Builder store_address(String store_address) {
            this.store_address = store_address;
            return this;
        }


        public Store build() {
            return new Store(this);
        }

    }
    @Override
    public String toString()
    {
        return "StoreFactory{" +
                "store_ID=" + store_ID +
                ", store_name='" + store_name + '\'' +
                ", store_description='" + store_description + '\'' +
                ", store_address='" + store_address + '\'' +
                '}';
    }
}
