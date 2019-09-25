package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Dairy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy.DairyRepository;

import java.util.HashMap;
import java.util.Map;

public class DairyRepositoryImpl implements DairyRepository
{
    private static DairyRepositoryImpl repository = null;
    private Map<String, Dairy> dairies;

    private DairyRepositoryImpl()
    {
        this.dairies = new HashMap<>();
    }

    public static DairyRepositoryImpl getRepository()
    {
        if (repository == null) repository = new DairyRepositoryImpl();
        return repository;
    }


    @Override
    public Map<String, Dairy> getAll()
    {
        return null;
    }

    @Override
    public Dairy create(Dairy dairy)
    {
        return repository.create(dairy);
    }

    @Override
    public Dairy update(Dairy dairy)
    {
        return repository.update(dairy);
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Dairy read(String s)
    {
        return null;
    }
}
