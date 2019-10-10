package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Juice;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface JuiceService extends IService<Juice, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Juice> getAll();
}
