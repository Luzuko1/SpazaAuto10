package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Milk;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy.MilkRepository;

import java.util.HashMap;
import java.util.Map;

public class MilkRepositoryImpl implements MilkRepository
{
    private static MilkRepositoryImpl repository = null;
    private Map<String, Milk> milks;

    private MilkRepositoryImpl()
    {
        this.milks = new HashMap<>();
    }

    public static MilkRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MilkRepositoryImpl();
        return repository;
    }
    @Override
    public Map<String, Milk> getAll()
    {
        return null;
    }

    @Override
    public Milk create(Milk milk)
    {
        milks.put(milk.getMilk_name(),milk);
        Milk savedMilk = milks.get(milk.getMilk_name());
        return savedMilk;
    }

    @Override
    public Milk update(Milk milk)
    {
        milks.put(milk.getMilk_name(),milk);
        Milk savedMilk = milks.get(milk.getMilk_name());
        return savedMilk;
    }

    @Override
    public void delete(String s)
    {
        milks.remove(s);
    }

    @Override
    public Milk read(String s)
    {
        Milk milk = milks.get(s);
        return milk;
    }
}
