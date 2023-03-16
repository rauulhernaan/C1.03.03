
package acme.entities.lecture;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractt;

	@NotNull
	@Range(min = 1)
	protected Integer			estimatedLearningTime;

	@NotBlank
	@Length(max = 100)
	protected String			body;

	protected LectureType		indication;

	@URL
	protected String			furtherInformation;

}
