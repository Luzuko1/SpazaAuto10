package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Meat;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food.MeatRepository;

import java.util.Map;

public class MeatRepositoryImpl implements MeatRepository
{
    private static MeatRepositoryImpl repository = null;
    private Map<String, Meat> meatTable;


    public static MeatRepositoryImpl getRepository()
    {
        if (repository == null)
            repository = new MeatRepositoryImpl();
        return repository;
    }


    @Override
    public Map<String,Meat> getAll()
    {
        return null;
    }

    @Override
    public Meat create(Meat meat)
    {
        meatTable.put(meat.getMeat_ID(),meat);
        Meat savedMeat = meatTable.get(meat.getMeat_ID());
        return savedMeat;
    }

    @Override
    public Meat update(Meat meat)
    {
        meatTable.put(meat.getMeat_ID(),meat);
        Meat savedMeat = meatTable.get(meat.getMeat_ID());
        return savedMeat;
    }

    @Override
    public void delete(String s)
    {
        meatTable.remove(s);
    }

    @Override
    public Meat read(String s)
    {
        Meat meat = meatTable.get(s);
        return meat;
    }
}
