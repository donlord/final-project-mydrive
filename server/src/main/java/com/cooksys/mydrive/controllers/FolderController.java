package com.cooksys.mydrive.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/folders")
public class FolderController {

    //private FolderServices folderServices;

    /* GET /folders
    @GetMapping
    public List<Object> returnTopLevel () {
        return folderServices.get();
    }
    */

	/* GET /folders/{path}
	@GetMapping("/{path}")
	public Folder returnSingleFolder (@PathVariable(path="folderPath") String folderPath) {
	    return folderServices.getFolder(folderPath);
	}
	*/

	/* POST /folders/{path}
    @PostMapping("/{path}")
    public Folder createNewFolder (@PathVariable(path="folderPath") String folderPath) {
        return folderServices.createNewFolder(folderPath);
    }
	*/

    /*
    @PatchMapping("/{path}/trash")
    public Folder trashFolder (@PathVariable(path="folderPath") String folderPath) {
        return folderServices.trashSelectedFolder(folderPath);
    }
    */

    /*
    @DeleteMapping("/{path}")
    public Folder deleteSelectedFolderFromTrash (@PathVariable(path="folderPath") String folderPath) {
        return folderServices.deleteSelectedFolderFromTrash(folderPath);
    }
    */
}
