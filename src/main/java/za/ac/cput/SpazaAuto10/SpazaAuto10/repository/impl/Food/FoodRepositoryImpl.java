package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Food;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food.FoodRepository;

import java.util.HashMap;
import java.util.Map;

public class FoodRepositoryImpl implements FoodRepository
{
    private static FoodRepositoryImpl repository = null;
    private Map<String, Food> foodMap;

    private FoodRepositoryImpl()
    {
        this.foodMap = new HashMap<>();
    }

    public static FoodRepositoryImpl getRepository()
    {
        if (repository ==null) repository = new FoodRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String,Food> getAll()
    {
        return null;
    }

    @Override
    public Food create(Food food)
    {
        foodMap.put(food.getFood_ID(),food);
        Food savedFood = foodMap.get(food.getFood_ID());
        return savedFood;
    }

    @Override
    public Food update(Food food)
    {
        foodMap.put(food.getFood_ID(),food);
        Food savedFood = foodMap.get(food.getFood_ID());
        return savedFood;
    }

    @Override
    public void delete(String s)
    {
        foodMap.remove(s);
    }

    @Override
    public Food read(String s)
    {
        Food food = foodMap.get(s);
        return food;
    }
}
