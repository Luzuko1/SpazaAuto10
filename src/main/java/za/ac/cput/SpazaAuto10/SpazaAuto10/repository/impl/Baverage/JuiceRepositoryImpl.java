package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Baverage;


import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Juice;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage.JuiceRepository;

import java.util.HashMap;
import java.util.Map;

public class JuiceRepositoryImpl implements JuiceRepository
{
    private static JuiceRepositoryImpl repository = null;
    protected Map<Integer, Juice> juices;

    private JuiceRepositoryImpl()
    {
        this.juices = new HashMap<>();
    }

    public static JuiceRepositoryImpl getRepository()
    {
        if (repository == null) repository = new JuiceRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String,Juice> getAll()
    {
        return null;
    }

    @Override
    public Juice create(Juice juice)
    {
        //this.juices.add(juice);
        return juice;
    }

    @Override
    public Juice update(Juice juice)
    {
        return juice;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Juice read(String s)
    {
        return null;
    }
}
