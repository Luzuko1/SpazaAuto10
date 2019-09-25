package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Dairy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface DairyRepository extends IRepository<Dairy, String>
{
    Map<String, Dairy> getAll();
}
