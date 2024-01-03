package systems.arthais.calendlypoc.calendly.models.requests.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum OneOffEventTypeLocationKindEnum {
	custom("Custom Location", "custom"),
	google_conference("Google Conference", "google_conference"),
	gotomeeting_conference("GotoMeeting Conference", "gotomeeting_conference"),
	physical("In Person Meeting", "physical"),
	inbound_call("Inbound Call", "inbound_call"),
	ask_invitee("Invitee Specified Location", "ask_invitee"),
	microsoft_teams_conference("Microsoft Teams Conference", "microsoft_teams_conference"),
	outbound_call("Outbound Call", "outbound_call"),
	webex_conference("WebEx Conference", "webex_conference"),
	zoom_conference("Zoom Conference", "zoom_conference");
	
	private final String friendlyDescription;
	private final String description;

}
