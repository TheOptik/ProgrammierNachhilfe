package threads;

public class DownloadThread extends Thread {

    String fileContent;

    public DownloadThread(String filePath) {
        super(() -> {

            String fileContent = new FileDownloader().downloadingFile(filePath);

        });

    }



    public String getFileContent() {
        return fileContent;
    }
}
