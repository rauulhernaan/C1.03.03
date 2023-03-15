
package acme.entities.banner;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Banner extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@NotNull
	@Temporal(value = TemporalType.TIMESTAMP)
	@PastOrPresent
	protected Date				instantiationMoment;

	@NotNull
	@Temporal(value = TemporalType.TIMESTAMP)
	protected Date				displayPeriodBegin;

	@NotNull
	@Temporal(value = TemporalType.TIMESTAMP)
	protected Date				displayPeriodFinish;

	@URL
	protected String			pictureLink;

	@Length(max = 75)
	@NotBlank
	protected String			slogan;

	@URL
	protected String			webDocument;

}
