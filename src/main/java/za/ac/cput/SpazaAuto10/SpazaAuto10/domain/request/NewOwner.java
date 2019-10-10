package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.request;

public class NewOwner
{
    private String owner_ID;
    private String ownerName;

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

    @Override
    public String toString()
    {
        return "NewOwner{" +
                "owner_ID='" + owner_ID + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
