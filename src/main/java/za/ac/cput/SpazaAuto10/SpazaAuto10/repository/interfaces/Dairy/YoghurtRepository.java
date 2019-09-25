package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Yoghurt;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface YoghurtRepository extends IRepository<Yoghurt, String>
{
    Map<String, Yoghurt> getAll();
}
