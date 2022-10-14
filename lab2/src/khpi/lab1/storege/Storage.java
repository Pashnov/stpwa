package khpi.lab1.storege;

public interface Storage {

    void save(String path, byte[] data);
    byte[] read(String path);
    boolean remove(String path);
}
