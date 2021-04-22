package com.springboot.tranining.spaceover.spacefleet.manager.domain.model;

import com.springboot.tranining.spaceover.spacefleet.manager.enums.SpaceFleetStatus;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
public class SpaceFleet extends Auditable<String> {

	@Id
	private Long id;
	@NotNull
	@NotEmpty
	private String name;
	@NotEmpty
	private String sector;
	@NotNull
	private SpaceFleetStatus status;

}
