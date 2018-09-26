package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.repository.FileRepository;
import com.cooksys.mydrive.repository.FolderRepository;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    private FileRepository fileRepository;
    private FolderRepository folderRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public File[] get() {
        return fileRepository.findByIsRoot(true);
    }

    public File get(String[] path) {
        return fileRepository.findByName(path[path.length - 1]);
    }

    public File add(File file) {
        return fileRepository.save(file);
    }

    public File add(String[] path, File file) {
        return fileRepository.save(file);
    }
}
