package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Soda;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface SodaService extends IService<Soda, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Soda> getAll();
}
