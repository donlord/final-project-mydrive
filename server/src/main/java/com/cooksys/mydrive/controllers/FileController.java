package com.cooksys.mydrive.controllers;

import com.cooksys.mydrive.entity.File;
import com.cooksys.mydrive.services.FileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/files")
public class FileController {
    private FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("{path}")
    public File get(@PathVariable(value = "path") String[] path) {

        return fileService.get(path);
    }

    @PostMapping("{path}")
    public File get(@PathVariable(value = "path") String[] path, @RequestBody File file) {

        return fileService.add(path, file);
    }
}
