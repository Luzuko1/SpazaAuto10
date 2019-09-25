package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Baverage;


import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Energy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage.EnergyRepository;

import java.util.HashMap;
import java.util.Map;

public class EnergyRepositoryImpl implements EnergyRepository
{
    private static EnergyRepositoryImpl repository = null;
    private Map<Integer, Energy> energy;

    private EnergyRepositoryImpl()
    {
        this.energy = new HashMap<>();
    }

    public static EnergyRepositoryImpl getRepository()
    {
        if (repository ==null) repository = new EnergyRepositoryImpl();
        return repository;
    }



    @Override
    public Map<String,Energy> getAll()
    {
        return null;
    }

    @Override
    public Energy create(Energy energy)
    {
        //this.energy.add(energy);
        return energy;
    }

    @Override
    public Energy update(Energy energy)
    {
        return energy;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Energy read(String s)
    {
        return null;
    }
}
