package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Food;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface FoodService extends IService<Food, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Food> getAll();
}
