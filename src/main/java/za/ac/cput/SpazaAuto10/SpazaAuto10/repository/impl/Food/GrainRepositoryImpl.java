package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Grain;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food.GrainRepository;

import java.util.HashMap;
import java.util.Map;

public class GrainRepositoryImpl implements GrainRepository
{
    private static GrainRepositoryImpl repository = null;
    private Map<String, Grain> grainsMap;

    private GrainRepositoryImpl()
    {
        this.grainsMap = new HashMap<>();
    }

    public static GrainRepositoryImpl getRepository()
    {
        if (repository == null)
            repository = new GrainRepositoryImpl();
        return repository;
    }



    @Override
    public Map<String,Grain> getAll()
    {
        return null;
    }

    @Override
    public Grain create(Grain grain)
    {
        grainsMap.put(grain.getGrain_ID(),grain);
        Grain savedGrain = grainsMap.get(grain.getGrain_ID());
        return savedGrain;
    }

    @Override
    public Grain update(Grain grain)
    {
        grainsMap.put(grain.getGrain_ID(),grain);
        Grain savedGrain = grainsMap.get(grain.getGrain_ID());
        return savedGrain;
    }

    @Override
    public void delete(String s)
    {
        grainsMap.remove(s);
    }

    @Override
    public Grain read(String s)
    {   Grain grain = grainsMap.get(s);
        return null;
    }
}
