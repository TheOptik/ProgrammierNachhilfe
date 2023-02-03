package downloadmanager;

import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String> jobId = new DownloadManager().configure(4, 4000)
          .specifyDownloadLocation(new URL(" http://example.com/resource"))
          .startDownload(null);

        System.out.println(jobId);
    }

}
