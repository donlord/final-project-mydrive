package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.repository.FileRepository;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    private FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public File[] get() {
        return fileRepository.findByIsRoot(true);
    }

    public File get(String path) {
        return new File();
    }
}
