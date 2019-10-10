package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Snack;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface SnackService extends IService<Snack, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Snack> getAll();
}
