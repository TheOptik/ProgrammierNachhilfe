import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.UUID;

public class DownloadJob {

    private final URL url;
    private byte[] result;
    private String jobId;

    public DownloadJob(URL url)  {
        this.url = url;
        jobId = UUID.randomUUID().toString();
        System.out.println("here in DownloadJob 1");

        Thread downloadThread = new Thread(()->{
            result = DownloadManager.downloadFromURL(url);
            System.out.println("here in DownloadJob 2");
        }) ;

        downloadThread.start();

    }

    public String getJobId() {
        return jobId;
    }

    public byte[] getResult() {
        return result;
    }

    // equals and hash code so we could keep DownloadJobs in a Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DownloadJob that = (DownloadJob) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    public static void main(String[] args) throws Exception {
        new DownloadJob(new URL("http://foo.bar"));

        System.out.println("here in main");
    }



}
