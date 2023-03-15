
package acme.entities.audit;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.course.Course;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditingRecord extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@ManyToOne
	protected Audit				audit;
	
	@ManyToOne
	protected Course			course;

	@NotBlank
	@Length(max = 75)
	protected String			subject;

	@NotBlank
	@Length(max = 100)
	protected String			assessment;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				startPeriod;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				endPeriod;

	@NotNull
	protected Mark				mark;

	@URL
	protected String			link;


	public boolean isPeriodValid(final LocalDateTime startPeriod, final LocalDateTime endPeriod) {
		final LocalDateTime now = LocalDateTime.now();
		final Duration duration = Duration.between(startPeriod, endPeriod);
		return endPeriod.isBefore(now) && duration.toHours() >= 1;
	}
}
