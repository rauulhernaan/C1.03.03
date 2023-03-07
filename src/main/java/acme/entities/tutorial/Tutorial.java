
package acme.entities.tutorial;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import acme.framework.data.AbstractRole;

public class Tutorial extends AbstractRole {

	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	@Column(unique = true)
	protected String			code;

	@NotBlank
	@Range(min = 0, max = 76)
	protected String			title;

	@NotBlank
	@Range(min = 0, max = 101)
	protected String			resume;

	@NotBlank
	@Range(min = 0, max = 101)
	protected String			goals;

	@Min(value = 0)
	protected Double			estimatedTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
