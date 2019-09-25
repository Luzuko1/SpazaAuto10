package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Juice;

public class JuiceFactory
{
    public static Juice getJuice(String brand_name, String dateArrived)
    {
        return new Juice.Builder()
                .brand_name(brand_name)
                .build();
    }
}
