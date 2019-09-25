package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Egg;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy.EggRepository;

import java.util.HashMap;
import java.util.Map;

public class EggRepositoryImpl implements EggRepository
{
    private static EggRepositoryImpl repository = null;
    private Map<String, Egg> eggs;

    private EggRepositoryImpl()
    {
        this.eggs = new HashMap<>();
    }

    public static EggRepositoryImpl getRepository()
    {
        if (repository == null) repository = new EggRepositoryImpl();
        return repository;
    }


    @Override
    public Map<String,Egg> getAll()
    {
        return null;
    }

    @Override
    public Egg create(Egg egg)
    {
        return repository.create(egg);
    }

    @Override
    public Egg update(Egg egg)
    {
        return repository.update(egg);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }

    @Override
    public Egg read(String s)
    {
        return repository.read(s);
    }
}

