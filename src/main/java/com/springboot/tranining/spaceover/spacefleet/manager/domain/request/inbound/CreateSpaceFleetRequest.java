package com.springboot.tranining.spaceover.spacefleet.manager.domain.request.inbound;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateSpaceFleetRequest {

	@NotNull
	@NotEmpty
	private String name;

	@NotEmpty
	private String sector;

}
