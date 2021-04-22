package com.springboot.tranining.spaceover.spacefleet.manager.repository;

import com.springboot.tranining.spaceover.spacefleet.manager.domain.model.SpaceFleet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceFleetRepository extends JpaRepository<SpaceFleet, Long> {


}
