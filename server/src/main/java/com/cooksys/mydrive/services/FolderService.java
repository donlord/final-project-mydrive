package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.Folder;
import com.cooksys.mydrive.repository.FolderRepository;
import org.springframework.stereotype.Service;

@Service
public class FolderService {
    private FolderRepository folderRepository;

    public FolderService(FolderRepository folderRepository) {
        this.folderRepository = folderRepository;
    }

    public Folder[] get() {
        return folderRepository.findByIsRoot(true);
    }

    public Folder get(String[] path) {
        return new Folder();
    }
}
