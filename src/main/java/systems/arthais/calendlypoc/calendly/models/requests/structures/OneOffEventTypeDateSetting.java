package systems.arthais.calendlypoc.calendly.models.requests.structures;

import java.time.LocalDate;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import systems.arthais.calendlypoc.calendly.models.requests.enums.DateSettingTypeEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_NULL)
public class OneOffEventTypeDateSetting {

	@NotNull(message = "O tipo da configuração de data é obrigatório.")
	private DateSettingTypeEnum type;

	@Nullable
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;

	@Nullable
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;

	@Nullable
	@Min(value = 0, message = "O número de dias deve ser no mínimo 0.")
	@Max(value = 365, message = "O número de dias deve ser no máximo 365.")
	private Integer days;

	@Nullable
	private Boolean only_weekdays;
}
