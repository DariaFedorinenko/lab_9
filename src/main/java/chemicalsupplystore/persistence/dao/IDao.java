package chemicalsupplystore.persistence.dao;

public interface IDao<T> {

    T findById(Integer id);

    void remove(Integer id);

    T persist(T object);
}