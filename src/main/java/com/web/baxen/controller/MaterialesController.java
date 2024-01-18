package com.web.baxen.controller;


import com.web.baxen.dto.MaterialDTO;
import com.web.baxen.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/materialApi")//endpoint general de materiales, tiene q pasar x aca
@RequiredArgsConstructor
public class MaterialesController {


    private final MaterialService materialService;

    @GetMapping(value = "/")
    public List<MaterialDTO> home(){
        List<MaterialDTO> dto = materialService.listaMateriales();
        return dto;
    }

    @GetMapping(value = "/material")
    public MaterialDTO matById(@RequestHeader(value = "materialId") Integer matId){
        MaterialDTO dto = materialService.materialById(matId);
        return dto;
    }

}
