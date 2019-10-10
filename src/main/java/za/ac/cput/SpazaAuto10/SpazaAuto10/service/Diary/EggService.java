package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Diary;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Egg;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface EggService extends IService<Egg, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Egg> getAll();
}
