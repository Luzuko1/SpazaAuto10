package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Food;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface FoodRepository extends IRepository<Food, String>
{
    Map<String, Food> getAll();
}
