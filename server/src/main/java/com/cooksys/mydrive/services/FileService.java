package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.entity.Folder;
import com.cooksys.mydrive.exceptions.FileNotFoundException;
import com.cooksys.mydrive.exceptions.FolderNotFoundException;
import com.cooksys.mydrive.repository.FileRepository;
import com.cooksys.mydrive.repository.FolderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<Folder> folders = folderRepository.findAll();

        Folder parent = null;

        for(Folder f : folders) {
            if(f.getName() == path[0]) {
                parent = f;
                break;
            }
        }

        if(parent == null) {
            throw new FolderNotFoundException();
        }

        List<File> files = fileRepository.findAll();
        File foundFile = null;

        for(File f : files) {
            if(f.getName() == path[1]) {
                if(f.getParent() == parent) {
                    foundFile = fileRepository.getOne(f.getId());
                }
            }
        }

        if(foundFile == null) {
            throw new FileNotFoundException();
        }

        return foundFile;
    }

    public File add (File file) {
        return fileRepository.save(file);
    }
}
