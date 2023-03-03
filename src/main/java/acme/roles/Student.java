
package acme.roles;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			statement;

	@NotBlank
	@Length(max = 100)
	protected List<String>		strongFeatures;

	@NotBlank
	@Length(max = 100)
	protected List<String>		weakFeatures;

	@URL
	protected String			link;

}
