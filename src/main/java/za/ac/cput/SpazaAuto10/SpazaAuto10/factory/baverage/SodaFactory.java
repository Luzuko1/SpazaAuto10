package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Soda;

public class SodaFactory
{
    public static Soda getSoda(String brand_name)
    {
        return new Soda.Builder()
                .brand_name(brand_name)
                .build();
    }
}
