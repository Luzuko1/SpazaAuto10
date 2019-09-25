package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Store;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class StoreFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(StoreFactory.class);

    public static Store getDairy(String store_Name, String description, String address)
    {
        return new Store.Builder()
                .store_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .store_name(store_Name)
                .store_description(description)
                .store_address(address)
                .build();
    }

}
