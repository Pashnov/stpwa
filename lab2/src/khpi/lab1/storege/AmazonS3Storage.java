package khpi.lab1.storege;

import java.util.Objects;

public final class AmazonS3Storage implements Storage {

    private static volatile Storage INSTANCE;

    private AmazonS3Storage() {
        System.out.println("new instance AmazonS3Storage");
    }

    public static Storage getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (AmazonS3Storage.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new AmazonS3Storage();
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
