package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Yoghurt;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy.YoghurtRepository;

import java.util.HashMap;
import java.util.Map;

public class YoghurtRepositoryImpl implements YoghurtRepository
{
    private static YoghurtRepositoryImpl repository = null;
    private Map<String, Yoghurt> yoghurtMap;

    private YoghurtRepositoryImpl()
    {
        yoghurtMap = new HashMap<>();
    }

    public static YoghurtRepositoryImpl getInstance()
    {
        if (repository==null)
            repository = new YoghurtRepositoryImpl();
        return repository;

    }
    @Override
    public Map<String,Yoghurt> getAll()
    {
        return null;
    }

    @Override
    public Yoghurt create(Yoghurt yoghurt)
    {
        yoghurtMap.put(yoghurt.getYoghurt_Name(),yoghurt);
        Yoghurt savedYoghurt = yoghurtMap.get(yoghurt.getYoghurt_Name());
        return savedYoghurt;
    }

    @Override
    public Yoghurt update(Yoghurt yoghurt)
    {
        yoghurtMap.put(yoghurt.getYoghurt_Name(),yoghurt);
        Yoghurt savedYoghurt = yoghurtMap.get(yoghurt.getYoghurt_Name());
        return savedYoghurt;
    }

    @Override
    public void delete(String s)
    {
        yoghurtMap.remove(s);
    }

    @Override
    public Yoghurt read(String s)
    {
        Yoghurt yoghurt = yoghurtMap.get(s);
        return yoghurt;
    }
}
