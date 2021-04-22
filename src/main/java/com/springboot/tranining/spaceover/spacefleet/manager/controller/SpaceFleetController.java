package com.springboot.tranining.spaceover.spacefleet.manager.controller;

import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.CREATE_SPACE_FLEET;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.DELETE_SPACE_FLEET;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.GET_SPACE_FLEET;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.GET_SPACE_FLEETS;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.ID_URI;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.SPACE_FLEETS_URI;
import static com.springboot.tranining.spaceover.spacefleet.manager.utils.constants.SpaceFleetConstant.UPDATE_SPACE_FLEET;

import com.springboot.tranining.spaceover.spacefleet.manager.domain.model.SpaceFleet;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound.CreateSpaceFleetRequest;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound.UpdateSpaceFleetRequest;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.response.outbound.GetSpaceFleetResponse;
import com.springboot.tranining.spaceover.spacefleet.manager.domain.response.outbound.UpdateSpaceFleetResponse;
import com.springboot.tranining.spaceover.spacefleet.manager.utils.annotations.ServiceOperation;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SPACE_FLEETS_URI)
public interface SpaceFleetController {

	@GetMapping
	@ServiceOperation(GET_SPACE_FLEETS)
	ResponseEntity<Page<GetSpaceFleetResponse>> getSpaceFleets(Pageable page,
			@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "status", required = false) String status,
			@RequestParam(name = "ids", required = false) 	List<Long> ids);

	@GetMapping(ID_URI)
	@ServiceOperation(GET_SPACE_FLEET)
	ResponseEntity<GetSpaceFleetResponse> getSpaceFleet(@PathVariable("id") Long id);

	@PostMapping
	@ServiceOperation(CREATE_SPACE_FLEET)
	ResponseEntity createSpaceFleet(@RequestBody CreateSpaceFleetRequest request);

	@PatchMapping
	@ServiceOperation(UPDATE_SPACE_FLEET)
	ResponseEntity<UpdateSpaceFleetResponse>  UpdateSpaceFleet(@RequestBody UpdateSpaceFleetRequest request);

	@DeleteMapping(ID_URI)
	@ServiceOperation(DELETE_SPACE_FLEET)
	ResponseEntity deleteSpaceFleet(@PathVariable("id") Long id);

}
