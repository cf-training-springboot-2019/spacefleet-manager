package com.springboot.tranining.spaceover.spacefleet.manager.controller;

import com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound.CreateSpaceFleetRequest;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound.UpdateSpaceFleetRequest;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.response.outbound.GetSpaceFleetResponse;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.response.outbound.UpdateSpaceFleetResponse;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;


public interface SpaceFleetController {

	ResponseEntity<Page<GetSpaceFleetResponse>> getSpaceFleets(Pageable page, String name, String status, List<Long> ids);

	ResponseEntity<GetSpaceFleetResponse> getSpaceFleet(Long id);

	ResponseEntity createSpaceFleet(CreateSpaceFleetRequest request);

	ResponseEntity<UpdateSpaceFleetResponse>  UpdateSpaceFleet(UpdateSpaceFleetRequest request);

	ResponseEntity deleteSpaceFleet(Long id);

}
