package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Baverage;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Drinks;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface DrinkService extends IService<Drinks, String>
{
        //Map<String,Airtime> getAllMTMAirtimes();
        Map<String, Drinks> getAll();
        }
