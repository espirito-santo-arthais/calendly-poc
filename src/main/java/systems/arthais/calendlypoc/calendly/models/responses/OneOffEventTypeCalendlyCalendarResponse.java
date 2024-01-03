package systems.arthais.calendlypoc.calendly.models.responses;

import java.util.List;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import systems.arthais.calendlypoc.calendly.models.requests.OneOffEventTypeCalendlyCalendarRequest;
import systems.arthais.calendlypoc.calendly.models.requests.structures.OneOffEventTypeDateSetting;
import systems.arthais.calendlypoc.calendly.models.requests.structures.OneOffEventTypeLocation;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_NULL)
public class OneOffEventTypeCalendlyCalendarResponse {

	private String uri;
    private String name;
    private Boolean active;
    private String slug;
    private String scheduling_url;
    private Integer duration;
    private String kind;
    private String pooling_type;
    private String type;
    private String color;
    private String created_at;
    private String updated_at;
    private String internal_note;
    private String description_plain;
    private String description_html;
    private Profile profile;
    private Boolean secret;
    private String booking_method;
    private List<CustomQuestion> custom_questions;
    private String deleted_at;
    private Boolean admin_managed;

}

public class Profile {
    // Campos da classe Profile
}

public class CustomQuestion {
    // Campos da classe CustomQuestion
}
