package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Teller;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class TellerFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(TellerFactory.class);
    public static Teller getTeller(String tellerName)
    {
        return new Teller.Builder()
                .tellerID(Helper.generateRandomGivenSuffix(SUFFIX))
                .tellerName(tellerName)
                .build();
    }
}

