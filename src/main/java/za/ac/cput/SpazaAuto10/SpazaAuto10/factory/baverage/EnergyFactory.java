package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Energy;

public class EnergyFactory
{
    public static Energy getEnergy(String brand_name)
    {
        return new Energy.Builder()
                .brand_name(brand_name)
                .build();
    }
}
