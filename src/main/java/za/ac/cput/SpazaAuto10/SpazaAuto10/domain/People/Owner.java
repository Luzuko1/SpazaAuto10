package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People;

public class Owner
{
    private String owner_ID;
    private String ownerName;

    public Owner()
    {
    }

    private Owner(Owner.Builder builder)
    {
        this.owner_ID = builder.owner_ID;
        this.ownerName = builder.ownerName;

    }
    public Owner(String owner_ID, String ownerName)
    {
        this.owner_ID = owner_ID;
        this.ownerName = ownerName;
    }

    public String getOwner_ID()
    {
        return owner_ID;
    }

    public void setOwner_ID(String owner_ID)
    {
        this.owner_ID = owner_ID;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    public static class Builder{

        private String owner_ID;
        private String ownerName;



        public Owner.Builder owner_ID(String owner_ID)
        {
            this.owner_ID = owner_ID;
            return this;
        }
        public Owner.Builder ownerName(String ownerName)
        {
            this.ownerName = ownerName;
            return this;
        }



        public Owner build() {
            return new Owner(this);
        }

    }
    @Override
    public String toString()
    {
        return "Owner{" +
                "owner_ID=" + owner_ID +
                ", ownerName='" + ownerName + '\'' +
                '}';
}}
