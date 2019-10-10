package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Toiletry;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry.Toiletry;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface ToiletryService extends IService<Toiletry, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Toiletry> getAll();
}
