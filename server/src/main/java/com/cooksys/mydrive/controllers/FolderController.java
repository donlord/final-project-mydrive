package com.cooksys.mydrive.controllers;

import com.cooksys.mydrive.entity.Folder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/folders")

public class FolderController {
//    private FolderService folderService;
//
//    public FolderController(FolderService folderService) {
//        this.folderService = folderService;
//    }

    public FolderController() {
    }

    @GetMapping
    public Folder get() {
        return new Folder();
    }

    @GetMapping("/@{path}")
    public String get(@PathVariable(value = "folderPath") String path) {
        return path;
    }

	/* POST /folders/{path}
    @PostMapping("/{path}")
    public Folder createNewFolder (@PathVariable(path="folderPath") String folderPath) {
        return folderService.createNewFolder(folderPath);
    }
	*/

    /*
    @PatchMapping("/{path}/trash")
    public Folder trashFolder (@PathVariable(path="folderPath") String folderPath) {
        return folderService.trashSelectedFolder(folderPath);
    }
    */

    /*
    @DeleteMapping("/{path}")
    public Folder deleteSelectedFolderFromTrash (@PathVariable(path="folderPath") String folderPath) {
        return folderServices.deleteSelectedFolderFromTrash(folderPath);
    }
    */
}
