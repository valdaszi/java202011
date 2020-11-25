package d24_25;

public class Kolekcija implements IKolekcija {

    private Meteo[] meteos = new Meteo[100];
    private int size = 0;

    @Override
//    public void push(Meteo... meteoArray) {
//        if (meteoArray.length == 0) return;
//        int count = meteoArray.length;
//        int freeSpace = mateos.length - size;
//        if (count <= freeSpace) {
//           //TODO
//        } else {
//            //TODO
//        }
//    }
    public void push(Meteo meteo) {
        if (meteos.length == size) {
           // reiskia kad masyvas jau pilnai uzpildytas
            Meteo[] meteosNew = new Meteo[meteos.length + 100];
//            for (int i = 0; i < meteos.length; i++) {
//                meteosNew[i] = meteos[i];
//            }
            System.arraycopy(meteos, 0, meteosNew, 0, meteos.length);
            meteos = meteosNew;
        }
        meteos[size] = meteo;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Meteo get(int index) {
        return this.meteos[index];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void put(int index, Meteo... meteoArray) {

    }
}
