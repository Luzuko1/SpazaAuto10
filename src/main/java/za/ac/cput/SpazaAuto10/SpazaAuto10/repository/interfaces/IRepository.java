package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces;

public interface IRepository<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
