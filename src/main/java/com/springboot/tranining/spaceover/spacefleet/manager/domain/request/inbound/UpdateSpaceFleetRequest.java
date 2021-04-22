package com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound;

import com.springboot.tranining.spaceover.spacefleet.manager.enums.SpaceFleetStatus;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UpdateSpaceFleetRequest {

	@NotEmpty
	private String name;

	@NotEmpty
	private String sector;

	private SpaceFleetStatus status;

}
