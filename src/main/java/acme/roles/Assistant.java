
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assistant extends AbstractRole {

	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			supervisor;

	@NotBlank
	@Length(max = 100)
	protected String			expertiseField;

	@NotBlank
	@Length(max = 100)
	protected String			resume;

	@URL
	protected String			furtherInformation;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
