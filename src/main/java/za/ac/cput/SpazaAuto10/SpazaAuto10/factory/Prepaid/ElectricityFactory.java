package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Electricity;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

public class ElectricityFactory
{
    private static final String SUFFIX = Helper.getSuffixFromClassName(ElectricityFactory.class);

    public static Electricity getElectricity(String company, double amount, double price)
    {
        return new Electricity.Builder()
                .electricity_ID(Helper.generateRandomGivenSuffix(SUFFIX))
                .electricity_Company(company)
                .amount(amount)
                .electricity_Price(price)
                .build();
    }
}
