package com.web.baxen.repository;


import com.web.baxen.entity.EtiquetaRecepcionEntity;
import com.web.baxen.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRecepcionRepository extends JpaRepository<EtiquetaRecepcionEntity, Integer> {

    @Query(value = "select TB_REC_DET_ID,TB_REC_ID, TB_REC_PER_ID,TB_REC_PER_NOM,TB_REC_PER_APE,TB_REC_SEC_ORI_ID,\n" +
            " TB_REC_SEC_ORI_DEN,TB_REC_SEC_DES_ID,TB_REC_SEC_DES_DEN,TB_REC_DET_MAT_ID, TB_REC_DET_MAT_DEN,\n" +
            " TB_REC_DET_VEN,TB_REC_DET_CANT,TB_REC_DET_STOCK,TB_REC_DET_TOT,TB_REC_DET_EMP_CANT,TB_REC_DET_EMP_STOCK,\n" +
            " TB_REC_DET_EMP_TOT from tb_rec_det where tb_rec_det_id = ?1", nativeQuery = true)
    EtiquetaRecepcionEntity findEtiquetaByEtiquetaId(Integer etiquetaId);
}
