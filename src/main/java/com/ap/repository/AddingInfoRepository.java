package com.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.entity.AddingInfo;

@Repository
public interface AddingInfoRepository extends JpaRepository<AddingInfo, Long>{

}
