package downloadmanager;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DownloadManager {
    private URL url;

    DownloadManager configure(int maxThreads, long timeout) {
        //...
        return this;
    }

    List<String> startDownload(List<URL> urls) {//...

        List<String> result = new ArrayList<>();

        for (int i = 0; i <urls.size(); i++) {
            DownloadJob job = new DownloadJob(urls.get(i));
            Thread downloadThread = new Thread(job);
            downloadThread.start();
            result.add(job.getJobId());
        }

        return result;
    } // returns the JobId

    DownloadManager cancelDownload(String jobId) {
        //...
        return this;
    }

    DownloadManager specifyDownloadLocation(URL url) {
        this.url = url;
        return this;
    }

    // nicht Teil des F l u i d I n t e r f a c e s
    public static byte[] downloadFromURL(URL url) {
        //...
        return null;
    }
}