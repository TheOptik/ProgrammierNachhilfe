package downloadmanager;

import java.net.URL;
import java.util.UUID;

public class DownloadJob implements Runnable {

    private URL url;
    private byte[] result;
    private String jobId;

    public DownloadJob(URL url) {
        jobId = UUID.randomUUID().toString();
        this.url = url;
    }

    @Override
    public void run() {
        result = DownloadManager.downloadFromURL(url);
    }

    public String getJobId() {
        return jobId;
    }

    public byte[] getResult() {
        return result;
    }
}
