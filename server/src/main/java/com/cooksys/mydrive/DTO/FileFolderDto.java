package com.cooksys.mydrive.DTO;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.entity.Folder;

public class FileFolderDto {
    private Folder[] folders;
    private File[] files;

    public FileFolderDto(Folder[] folders, File[] files) {
        this.folders = folders;
        this.files = files;
    }

    public FileFolderDto() {
    }
}
