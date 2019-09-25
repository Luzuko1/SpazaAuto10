package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Stock;

import java.util.Map;

public interface StockRepository extends IRepository<Stock, String>
{
    Map<String, Stock> getAll();
}

