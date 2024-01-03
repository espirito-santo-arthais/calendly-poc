package systems.arthais.calendlypoc.calendly.models.requests.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum DateSettingTypeEnum {
	date_range("Date Range", "date_range"),
	days_in_future("Days in Future", "days_in_future");
	
	private final String friendlyDescription;
	private final String description;

}
