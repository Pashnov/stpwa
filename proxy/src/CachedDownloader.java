import java.util.Map;
import java.util.WeakHashMap;

public class CachedDownloader implements Downloader {

    private final Downloader downloader;
    private final Map<String, byte[]> cache = new WeakHashMap<>(10, 0.5f);

    public CachedDownloader(Downloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public byte[] download(String url) {
        System.out.println(this.getClass() + "#download, url: " + url);
        if (cache.containsKey(url)) {
            System.out.println("cached");
            return cache.get(url);
        } else {
            System.out.println("download");
            byte[] file = downloader.download(url);
            cache.put(url, file);
            return file;
        }
    }

}
