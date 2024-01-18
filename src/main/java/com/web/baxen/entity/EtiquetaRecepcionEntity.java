package com.web.baxen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="TB_REC_DET")
public class EtiquetaRecepcionEntity {



        @Id
        @Column(name="TB_REC_DET_ID", nullable = false)
        private Integer id;

        @Column(name="TB_REC_ID", nullable = false)
        private Integer id_tb_rec;

        @Column(name="TB_REC_PER_ID", nullable = false)
        private Integer id_personal;

        @Column(name="TB_REC_PER_NOM", nullable = false)
        private String nombre_personal;

        @Column(name="TB_REC_PER_APE", nullable = false)
        private String ape_personal;

        @Column(name="TB_REC_SEC_ORI_ID", nullable = false)
        private Integer id_sector;

        @Column(name="TB_REC_SEC_ORI_DEN", nullable = false)
        private String den_sector;

        @Column(name="TB_REC_SEC_DES_ID", nullable = false)
        private Integer id_sector_des;

        @Column(name="TB_REC_SEC_DES_DEN", nullable = false)
        private String den_sector_des;

        @Column(name="TB_REC_DET_MAT_ID", nullable = false)
        private Integer MaterialId;

        @Column(name = "TB_REC_DET_MAT_DEN", nullable = false)
        private String DenominacionMaterial;

       @Column(name="TB_REC_DET_VEN", nullable = false)
        private Date vencimiento;

        @Column(name="TB_REC_DET_CANT", nullable = false)
        private Integer cant_rec;

        @Column(name="TB_REC_DET_STOCK", nullable = false)
        private Integer cant_rec_stock;

        @Column(name="TB_REC_DET_TOT", nullable = false)
        private Integer cant_rec_tot;

        @Column(name="TB_REC_DET_EMP_CANT", nullable = false)
        private Integer aco_cant;

        @Column(name="TB_REC_DET_EMP_STOCK", nullable = false)
        private Integer aco_stock;

        @Column(name="TB_REC_DET_EMP_TOT", nullable = false)
        private Integer aco_tot;
}
