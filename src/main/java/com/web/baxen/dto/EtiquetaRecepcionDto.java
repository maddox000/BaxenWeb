package com.web.baxen.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.security.Timestamp;
import java.util.Date;

@Data
public class EtiquetaRecepcionDto {

    private Integer etiquetaID;
    private Integer recepcionId;
    private Integer personalId;
    private String personalNombre;
    private String personalAPellido;
    private Integer sectorId;
    private String sectorDenominacion;
    private Integer sectorDestinoId;
    private String SectorDestinoDenominacion;
    private Integer materialID;
    private String denominacionMaterial;
    private String vencimiento;
    private String hora;
    private Integer recepcionCantidad;
    private Integer recepcionStock;
    private Integer recepcionTotal;
    private Integer acondicionadoCantidad;
    private Integer acondicionadoStock;
    private Integer acondicionadoTotal;

}





