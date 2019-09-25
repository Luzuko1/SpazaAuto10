package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.Toiletry;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry.Toiletry;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class ToiletryFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(ToiletryFactory.class);

    public static Toiletry getToiletry( int price)
    {
        return new Toiletry.Builder()
                .toiletry_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .price(price)
                .build();
    }
}
