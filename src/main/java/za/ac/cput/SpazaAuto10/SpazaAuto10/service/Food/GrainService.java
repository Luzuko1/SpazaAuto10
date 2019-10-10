package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Grain;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface GrainService extends IService<Grain, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Grain> getAll();
}
