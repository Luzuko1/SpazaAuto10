package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Baverage;


import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Drinks;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage.DrinkRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DrinkRepositoryImpl implements DrinkRepository
{
    private static DrinkRepositoryImpl repository = null;
    private Set<Drinks> drinks;

    private DrinkRepositoryImpl()
    {
        this.drinks = new HashSet<>();
    }

    public static DrinkRepositoryImpl getRepository()
    {
        if (repository == null) repository = new DrinkRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String,Drinks> getAll()
    {
        return null;
    }

    @Override
    public Drinks create(Drinks drinks)
    {   this.drinks.add(drinks);
        return drinks;
    }

    @Override
    public Drinks update(Drinks drinks)
    {
        return drinks;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Drinks read(String s)
    {
        return null;
    }
}
