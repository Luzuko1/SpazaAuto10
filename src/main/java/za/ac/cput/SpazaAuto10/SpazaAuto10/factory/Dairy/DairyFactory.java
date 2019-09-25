package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.Dairy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Dairy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class DairyFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(DairyFactory.class);
    public static Dairy getDairy(String dairy_Name, String dateArrived)
    {
        return new Dairy.Builder()
                .dairy_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .dairy_Name(dairy_Name)
                .dateArrived(dateArrived)
                .build();
    }
}
