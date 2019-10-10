package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Toiletry;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry.Toiletry;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Toiletry.ToiletryRepository;

import java.util.HashMap;
import java.util.Map;

public class ToiletryRepositoryImpl implements ToiletryRepository
{
    private static ToiletryRepositoryImpl repository = null;
    private Map<String, Toiletry> toiletryMap;

    private ToiletryRepositoryImpl()
    {
        this.toiletryMap = new HashMap<>();
    }

    public static ToiletryRepository getRepository()
    {
        if(repository == null)
            repository = new ToiletryRepositoryImpl();
        return repository;
    }
    @Override
    public Map<String, Toiletry> getAll()
    {
        return null;
    }

    @Override
    public Toiletry create(Toiletry toiletry)
    {
        this.toiletryMap.put(toiletry.getBrand_name(),toiletry);
        Toiletry savedToil = this.toiletryMap.get(toiletry.getBrand_name());
        return savedToil;
    }

    @Override
    public Toiletry update(Toiletry toiletry)
    {
        this.toiletryMap.put(toiletry.getBrand_name(),toiletry);
        Toiletry savedToil = this.toiletryMap.get(toiletry.getBrand_name());
        return savedToil;
    }

    @Override
    public void delete(String s)
    {
        this.toiletryMap.remove(s);
    }

    @Override
    public Toiletry read(String s)
    {
        Toiletry toiletry = this.toiletryMap.get(s);
        return toiletry;
    }
}
