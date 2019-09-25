package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Function;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Function.Purchase;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface PurchaseRepository extends IRepository<Purchase, String>
{
    Map<String, Purchase> getAll();
}
