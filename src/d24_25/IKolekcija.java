package d24_25;

public interface IKolekcija {

    // void push(Meteo... meteoArray);
    void push(Meteo meteo);

    int size();

    Meteo get(int index);

    void remove(int index);

    void put(int index, Meteo... meteoArray);
}
