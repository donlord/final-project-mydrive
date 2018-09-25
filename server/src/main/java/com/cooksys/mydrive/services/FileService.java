package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.repository.FileRepository;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public File get(String path) {
        return new File();
    }
}
