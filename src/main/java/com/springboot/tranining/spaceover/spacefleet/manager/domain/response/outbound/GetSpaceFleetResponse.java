package com.springboot.tranining.spaceover.spacefleet.manager.domain.response.outbound;

import com.springboot.tranining.spaceover.spacefleet.manager.enums.SpaceFleetStatus;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetSpaceFleetResponse {

	private Long id;

	private String name;

	private String sector;

	private SpaceFleetStatus status;

}
