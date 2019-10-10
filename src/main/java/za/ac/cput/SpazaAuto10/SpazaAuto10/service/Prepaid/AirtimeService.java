package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Airtime;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface AirtimeService extends IService<Airtime, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Airtime> getAll();
}
