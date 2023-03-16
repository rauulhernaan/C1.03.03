
package acme.entities.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import acme.roles.Lecturer;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course extends AbstractRole {

	//	Serialisation identifier ----------------------------
	protected static final long	serialVersionUID	= 1L;

	//	Attributes ----------------------------------------------
	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3} [0-9]{3}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			courseAbstract;

	protected CourseType		courseType;

	@PositiveOrZero
	protected Double			retailPrice;

	@URL
	protected String			link;

	@NotNull
	@ManyToOne(optional = false)
	protected Lecturer			lecturer;

}
