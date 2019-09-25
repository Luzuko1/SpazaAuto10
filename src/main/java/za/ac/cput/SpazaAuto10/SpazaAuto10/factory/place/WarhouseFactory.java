package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Warehouse;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class WarhouseFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(WarhouseFactory.class);

    public static Warehouse getWarehouse(String warehouse_name, String address)
    {
        return new Warehouse.Builder()
                .warehouse_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .warehous_name(warehouse_name)
                .address(address)
                .build();
    }
}
