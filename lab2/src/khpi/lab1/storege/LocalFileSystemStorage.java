package khpi.lab1.storege;

import java.util.Objects;

public class LocalFileSystemStorage implements Storage {

    private static volatile Storage INSTANCE;

    private LocalFileSystemStorage() {
        System.out.println("new instance LocalFileSystemStorage");
    }

    public static Storage getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LocalFileSystemStorage.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new LocalFileSystemStorage();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void save(String path, byte[] data) {

    }

    @Override
    public byte[] read(String path) {
        return new byte[0];
    }

    @Override
    public boolean remove(String path) {
        return false;
    }
}
