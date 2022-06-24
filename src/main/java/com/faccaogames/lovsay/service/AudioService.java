package com.faccaogames.lovsay.service;

import com.faccaogames.lovsay.model.Audio;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class AudioService {

    public Audio getAudioByUserId(Long userId) {
        return null;
    }

    public void saveNewAudio(Long userId, MultipartFile file) {
        String filePath = "D:\\Xandi\\Documents\\projetos\\lovsay";
        File f1 = new File(filePath + "/" + file.getOriginalFilename());
        try {
            file.transferTo(f1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
