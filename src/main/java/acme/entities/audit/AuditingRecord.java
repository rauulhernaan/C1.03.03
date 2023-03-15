package acme.entities.audit;

import java.time.Duration;
import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class AuditingRecord extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;
	
	@ManyToOne
	protected Audit			audit;
	
	@NotBlank
	@Length(max = 75)
	protected String			subject;
	
	@NotBlank
	@Length(max = 100)
	protected String			assessment;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected LocalDateTime				startPeriod;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected LocalDateTime				endPeriod;
	
	@NotNull
	protected Mark			mark;
	
	@URL
	protected String			link;
	
	
	public boolean isPeriodValid(LocalDateTime startPeriod, LocalDateTime endPeriod) {
	    LocalDateTime now = LocalDateTime.now();
	    Duration duration = Duration.between(startPeriod, endPeriod);
	    return endPeriod.isBefore(now) && duration.toHours() >= 1;
	}
}
