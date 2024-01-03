package systems.arthais.calendlypoc.calendly.models.requests.structures;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import systems.arthais.calendlypoc.calendly.models.requests.enums.OneOffEventTypeLocationKindEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_NULL)
public class OneOffEventTypeLocation {

	@NotNull(message = "O tipo de localização é obrigatório.")
	private OneOffEventTypeLocationKindEnum kind;

	@Nullable
	@Size(min = 1, message = "A localização deve ter pelo menos 1 caractere.")
	private String location;

	@Nullable
	@Size(min = 1, message = "A informação adicional deve ter pelo menos 1 caractere.")
	private String additionalInfo;

	@Nullable
	@Pattern(regexp = "^\\+[0-9]{1,3} [0-9]{2,4} [0-9]{4,10}$", message = "O número de telefone não está no formato válido.")
	private String phoneNumber;

}
