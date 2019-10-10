package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Energy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface EnergyService extends IService<Energy, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Energy> getAll();
}
