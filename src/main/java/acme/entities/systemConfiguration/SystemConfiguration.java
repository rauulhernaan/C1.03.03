
package acme.entities.systemConfiguration;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SystemConfiguration extends AbstractEntity {

	//Serialisation identifier-------------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	protected String			defaultCurrency;

	@NotBlank
	protected String			acceptedCurrency;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
