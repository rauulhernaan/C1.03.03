package acme.entities.peeps;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Peeps extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;


	@NotNull
	@Past
	protected Date				instiation;

	@NotBlank
	@Length(max = 75)
	protected String			tittle;

	@NotBlank
	@Length(max = 75)
	protected String			nick;

	@NotBlank
	@Length(max = 100)
	protected String			message;

	@Email
	protected String			email;

	@URL
	protected String			optionalLink;

}