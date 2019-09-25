package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Drinks;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class DrinkFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(DrinkFactory.class); // Expecting GF from (G)ender(F)actory.

    public static Drinks getDrink(String drink_Name, int size, int quantity)
    {
        return new Drinks.Builder()
                .drink_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .drink_Name(drink_Name)
                .size(size)
                .quantity(quantity)
                .build();
    }
}
