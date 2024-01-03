package systems.arthais.calendlypoc.calendly.clients;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "calendlyCalendarClient", url = "https://api.calendly.com")
public interface CalendlyCalendarClient {
    @PostMapping("/one_off_event_types")
    OneOffEventTypeResponse createOneOffEventType(@RequestBody OneOffEventType oneOffEventType);
}
