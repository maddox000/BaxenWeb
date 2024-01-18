package com.web.baxen.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*
* Objeto relacionado con la tabla de materiales tal como se llama en la DB
*
* */
@Getter
@Setter
@Entity
@Table(name="IB_MAT")
public class MaterialEntity {
    /*
    * ib_mat_id, ib_mat_den, IB_MAT_MTI_ID, IB_MAT_MTI_DEN
    * */

    @Id
    @Column(name="ib_mat_id", nullable = false)
    private Integer id;

    @Column(name="ib_mat_den", nullable = false)
    private String nombre;

    @Column(name="IB_MAT_MTI_ID", nullable = false)
    private Integer tipoMaterialId;

    @Column(name = "IB_MAT_MTI_DEN", nullable = false)
    private String tipoDenominacionMaterial;

}
