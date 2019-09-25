package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;



public class OwnerFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(OwnerFactory.class);

    public static Owner getOwner(String ownerName)
    {
        return new Owner.Builder()
                .owner_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .ownerName(ownerName)
                .build();
    }
}
