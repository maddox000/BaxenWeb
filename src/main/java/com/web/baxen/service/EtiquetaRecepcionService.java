package com.web.baxen.service;

import com.web.baxen.dto.EtiquetaRecepcionDto;
import com.web.baxen.entity.EtiquetaRecepcionEntity;
import com.web.baxen.repository.EtiquetaRecepcionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service
@RequiredArgsConstructor
public class EtiquetaRecepcionService {

    private final EtiquetaRecepcionRepository etiquetaRecepcionRepository;

    public EtiquetaRecepcionDto etiquetaByID(Integer etiquetaNum){
        EtiquetaRecepcionEntity etiquetaEntities = etiquetaRecepcionRepository.findEtiquetaByEtiquetaId(etiquetaNum);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormatHora = new SimpleDateFormat("HH:mm");
        EtiquetaRecepcionDto dto = new EtiquetaRecepcionDto();
        dto.setEtiquetaID(etiquetaEntities.getId());
        dto.setRecepcionId(etiquetaEntities.getId_tb_rec());
        dto.setPersonalId(etiquetaEntities.getId_personal());
        dto.setPersonalNombre(etiquetaEntities.getNombre_personal());
        dto.setPersonalAPellido(etiquetaEntities.getApe_personal());
        dto.setSectorId(etiquetaEntities.getId_sector());
        dto.setSectorDenominacion(etiquetaEntities.getDen_sector());
        dto.setSectorDestinoId(etiquetaEntities.getId_sector_des());
        dto.setSectorDestinoDenominacion(etiquetaEntities.getDen_sector_des());
        dto.setMaterialID(etiquetaEntities.getMaterialId());
        dto.setDenominacionMaterial(etiquetaEntities.getDenominacionMaterial());
        dto.setVencimiento(simpleDateFormat.format(etiquetaEntities.getVencimiento()));
        dto.setHora(simpleDateFormatHora.format(etiquetaEntities.getVencimiento()) + " .Hs");
        dto.setRecepcionCantidad(etiquetaEntities.getCant_rec());
        dto.setRecepcionStock(etiquetaEntities.getCant_rec_stock());
        dto.setRecepcionTotal(etiquetaEntities.getCant_rec_tot());
        dto.setAcondicionadoCantidad(etiquetaEntities.getAco_cant());
        dto.setAcondicionadoStock(etiquetaEntities.getAco_stock());
        dto.setAcondicionadoTotal(etiquetaEntities.getAco_tot());

        return dto;


    }
}



