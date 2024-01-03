package systems.arthais.calendlypoc.calendly.models.requests;

import java.util.List;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import systems.arthais.calendlypoc.calendly.models.requests.structures.OneOffEventTypeDateSetting;
import systems.arthais.calendlypoc.calendly.models.requests.structures.OneOffEventTypeLocation;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_NULL)
public class OneOffEventTypeCalendlyCalendarRequest {

	@NotBlank(message = "O nome é obrigatório.")
	@Size(max = 55, message = "O nome não pode ter mais do que 55 caracteres.")
	private String name;

	@NotBlank(message = "O anfitrião é obrigatório.")
	private String host;

	@Nullable
	@Size(min = 1, message = "A lista de co-anfitriões não pode estar vazia.")
	private List<String> coHosts;

	@NotNull(message = "A duração é obrigatória.")
	@Min(value = 1, message = "A duração deve ser de pelo menos 1 minuto.")
	@Max(value = 720, message = "A duração não pode exceder 720 minutos.")
	private Integer duration;

	@Nullable
	@Size(min = 1, message = "O fuso horário deve ter pelo menos 1 caractere.")
	private String timezone;

	@NotNull(message = "A configuração de data é obrigatória.")
	private OneOffEventTypeDateSetting dateSetting;

	@Nullable
	private OneOffEventTypeLocation location;

}
