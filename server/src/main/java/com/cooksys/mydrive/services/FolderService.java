package com.cooksys.mydrive.services;

import com.cooksys.mydrive.entity.Folder;
import com.cooksys.mydrive.repository.FolderRepository;

public class FolderService {
    private FolderRepository folderRepository;

    public FolderService(FolderRepository folderRepository) {
        this.folderRepository = folderRepository;
    }

    public FolderService() {
    }

    public Folder get() {
        return new Folder();
    }

    public Folder get(String[] path) {
        return new Folder();
    }
}
