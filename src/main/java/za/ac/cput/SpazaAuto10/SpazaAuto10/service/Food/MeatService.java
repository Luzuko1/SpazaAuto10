package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Meat;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface MeatService extends IService<Meat, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Meat> getAll();
}
