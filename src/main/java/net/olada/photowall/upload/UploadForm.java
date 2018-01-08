package net.olada.photowall.upload;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by David
 * Date: 07.01.2018 - 17:41.
 */
public class UploadForm {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "UploadForm{" +
                "file=" + file +
                '}';
    }
}
