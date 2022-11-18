public class Main {

    public static void main(String[] args) {
        Downloader simpleDownloader = new SimpleDownloader();
        CachedDownloader cachedDownloader = new CachedDownloader(simpleDownloader);

        byte[] file1 = cachedDownloader.download("url1.txt");
        byte[] file2 = cachedDownloader.download("url2.txt");
        byte[] file3 = cachedDownloader.download("url1.txt");
        System.out.println("is the same object: " + (file1 == file3));

    }
}