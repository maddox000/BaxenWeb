package com.web.baxen.service;

import com.web.baxen.dto.MaterialDTO;
import com.web.baxen.entity.EtiquetaRecepcionEntity;
import com.web.baxen.entity.MaterialEntity;
import com.web.baxen.repository.EtiquetaRecepcionRepository;
import com.web.baxen.repository.MaterialRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MaterialService {

    private final MaterialRespository materialRespository;//inyeccion de dependencia Controller -><- Service -><- Repository

    public List<MaterialDTO> listaMateriales(){
        List<MaterialDTO> materialDTOList = new ArrayList<>();

        List<MaterialEntity> materialEntities = materialRespository.findMaterialByName();

        for (MaterialEntity mat: materialEntities) {
            MaterialDTO dto = new MaterialDTO();
            dto.setMaterialId(mat.getId());
            dto.setNombreMaterial(mat.getNombre());
            dto.setTipoDenominacionMaterial(mat.getTipoDenominacionMaterial());
            dto.setTipoMaterialId(mat.getTipoMaterialId());
            materialDTOList.add(dto);
        }

        return materialDTOList;

    }


    public MaterialDTO materialById(Integer materialId) {
        MaterialEntity materialEntities = materialRespository.findMaterialByMaterialId(materialId);
        MaterialDTO dto = new MaterialDTO();
        dto.setMaterialId(materialEntities.getId());
        dto.setNombreMaterial(materialEntities.getNombre());
        dto.setTipoDenominacionMaterial(materialEntities.getTipoDenominacionMaterial());
        dto.setTipoMaterialId(materialEntities.getTipoMaterialId());
        return dto;

}


}
