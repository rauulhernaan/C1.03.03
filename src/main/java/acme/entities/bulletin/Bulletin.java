package acme.entities.bulletin;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotNull
	protected LocalDate			instantiationMoment;
	
	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 101)
	protected String			message;

	@NotBlank
	protected boolean 			critical;

	@URL
	protected String			furtherInformation;
	
	public boolean isInstantiationMomentPast() {
		LocalDate today = LocalDate.now();
		if (this.instantiationMoment.isBefore(today)) {
			return true;
		}else {
			return false;
		}
	}
}
