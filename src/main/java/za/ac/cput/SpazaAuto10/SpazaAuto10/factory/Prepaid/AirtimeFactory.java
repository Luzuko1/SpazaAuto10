package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Airtime;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class AirtimeFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(AirtimeFactory.class);
    public static Airtime getAirtime(double amount)
    {
        return new Airtime.Builder()
                .AirtimeID(Helper.generateRandomGivenSuffix(SUFFIX))
                .amount(amount).build();
    }
}
