
package acme.roles;

import javax.persistence.Column;
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
public class Company extends AbstractRole {

	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			name;

	@NotBlank
	@Length(max = 25)
	@Column(name = "vat_number")
	protected String			VATnumber;

	@NotBlank
	@Length(max = 100)
	protected String			summary;

	@URL
	@Column(name = "further_information")
	protected String			furtherInformation;

}
