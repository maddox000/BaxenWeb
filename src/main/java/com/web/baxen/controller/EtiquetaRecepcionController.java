package com.web.baxen.controller;

import com.web.baxen.dto.EtiquetaRecepcionDto;
import com.web.baxen.dto.MaterialDTO;
import com.web.baxen.service.EtiquetaRecepcionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/etiquetaApi")//endpoint general de materiales, tiene q pasar x aca
@RequiredArgsConstructor
public class EtiquetaRecepcionController {

    private final EtiquetaRecepcionService etiquetaRecepcionService;

    @GetMapping(value = "/etiqueta")
    public EtiquetaRecepcionDto etiById(@RequestHeader(value = "etiquetaNum") Integer etiId){
        EtiquetaRecepcionDto dtoETi = etiquetaRecepcionService.etiquetaByID(etiId);
        return dtoETi;
    }
}
