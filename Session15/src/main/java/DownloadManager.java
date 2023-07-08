import java.net.MalformedURLException;
import java.net.URL;

public class DownloadManager {
    private URL url;

    DownloadManager configure(int maxThreads, long timeout) {
        //
        return this;
    }

    String startDownload() {
        DownloadJob downloadJob = new DownloadJob(url);
        return downloadJob.getJobId();



    } // returns the JobId

    DownloadManager cancelDownload(String jobId) {
        //
        return this;
    }

    DownloadManager specifyDownloadLocation(URL url) {
        this.url = url;
        return this;
    }

    // nicht Teil des F l u i d I n t e r f a c e s
    public static byte[] downloadFromURL(URL url) {
        //
        return new byte[]{};
    }

    public static void main(String[] args) throws MalformedURLException {

        String jobId = new DownloadManager()
                .configure(2, 500)
                .specifyDownloadLocation(new URL("http://foo.bar"))
                .startDownload();

        System.out.println(jobId);




    }

}