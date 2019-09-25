package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary;

public class Dairy
{
    private String dairy_ID;
    private String dairy_name;
    private String dateArrived;

    public Dairy()
    {

    }
    private Dairy(Dairy.Builder builder)
    {
        this.dairy_ID = builder.dairy_ID;
        this.dairy_name = builder.dairy_Name;
        this.dateArrived = builder.dateArrived;
    }

    private Dairy(String dairy_ID, String dairy_name, String dateArrived)
    {
        this.dairy_ID = dairy_ID;
        this.dairy_name = dairy_name;
        this.dateArrived = dateArrived;
    }

    public String getDairy_ID()
    {
        return dairy_ID;
    }

    public void setDairy_ID(String dairy_ID)
    {
        this.dairy_ID = dairy_ID;
    }

    public String getDairy_name()
    {
        return dairy_name;
    }

    public void setDairy_name(String dairy_name)
    {
        this.dairy_name = dairy_name;
    }

    public String getDateArrived()
    {
        return dateArrived;
    }

    public void setDateArrived(String dateArrived)
    {
        this.dateArrived = dateArrived;
    }

    public static class Builder{

        private String dairy_ID;
        private String dairy_Name;
        private String dateArrived;

        public Dairy.Builder dairy_ID(String dairy_ID)
        {
            this.dairy_ID = dairy_ID;
            return this;
        }
        public Dairy.Builder dairy_Name(String dairy_Name)
        {
            this.dairy_Name = dairy_Name;
            return this;
        }

        public Dairy.Builder dateArrived(String dateArrived) {
            this.dateArrived = dateArrived;
            return this;
        }

        public Dairy build() {
            return new Dairy(this);
        }

    }
    @Override
    public String toString()
    {
        return "Dairy{" +
                "dairy_ID=" + dairy_ID +
                ", dairy_name='" + dairy_name + '\'' +
                ", dateArrived=" + dateArrived +
                '}';
    }
}
