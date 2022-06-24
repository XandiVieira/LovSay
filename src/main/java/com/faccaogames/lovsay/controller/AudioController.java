package com.faccaogames.lovsay.controller;

import com.faccaogames.lovsay.model.Audio;
import com.faccaogames.lovsay.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(path = "api/v1/audio")
public class AudioController {

    @Autowired
    private AudioService audioService;

    @PostMapping(value = "/{userId}")
    public void saveNewAudio(@PathVariable(value = "userId") Long userId, @RequestParam("file") MultipartFile file) {
        audioService.saveNewAudio(userId, file);
    }

    @GetMapping(value = "/{userId}")
    public Audio getAudioByUserId(@PathVariable(value = "userId") Long userId) {
        return audioService.getAudioByUserId(userId);
    }
}
