package com.web.baxen.repository;

import com.web.baxen.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRespository extends JpaRepository<MaterialEntity, Integer> {

    @Query (value = "select ib_mat_id, ib_mat_den, IB_MAT_MTI_ID, IB_MAT_MTI_DEN from IB_MAT", nativeQuery = true)
    List<MaterialEntity> findMaterialByName();

    @Query (value = "select ib_mat_id, ib_mat_den, IB_MAT_MTI_ID, IB_MAT_MTI_DEN from IB_MAT where ib_mat_id = ?1", nativeQuery = true)
    MaterialEntity findMaterialByMaterialId(Integer materialId);
}
