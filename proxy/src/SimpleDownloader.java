public class SimpleDownloader implements Downloader {

    @Override
    public byte[] download(String url) {
        System.out.println(this.getClass() + "#download, url: " + url);
        return url.getBytes();
    }

}
