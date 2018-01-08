package net.olada.photowall.upload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by David
 * Date: 07.01.2018 - 13:44.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("")
    public String showUpload() {
        logger.debug("Showing upload form");
        return "foobar";
    }

    @PostMapping("")
    public String uploadFile(UploadForm uploadForm, Model model) {
        logger.debug("Uploading file");
        model.addAttribute("form", uploadForm);
        return "foobar";
    }
}
