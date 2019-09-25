package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Snack;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food.SnackRepository;

import java.util.HashMap;
import java.util.Map;

public class SnackRepositoryImpl implements SnackRepository
{
    private static SnackRepositoryImpl repository = null;
    private Map<String, Snack> snackMap;

    private SnackRepositoryImpl()
    {
        snackMap = new HashMap<>();
    }

    public SnackRepositoryImpl getRepository()
    {
        if(repository==null)
            repository = new SnackRepositoryImpl();
        return repository;
    }


    @Override
    public Map<String,Snack> getAll()
    {
        return null;
    }

    @Override
    public Snack create(Snack snack)
    {
        snackMap.put(snack.getSnack_ID(),snack);
        Snack savedSnack = snackMap.get(snack.getSnack_ID());
        return savedSnack;
    }

    @Override
    public Snack update(Snack snack)
    {
        snackMap.put(snack.getSnack_ID(),snack);
        Snack savedSnack = snackMap.get(snack.getSnack_ID());
        return savedSnack;
    }

    @Override
    public void delete(String s)
    {
        snackMap.remove(s);
    }

    @Override
    public Snack read(String s)
    {
        Snack snack = snackMap.get(s);
        return snack;
    }
}

