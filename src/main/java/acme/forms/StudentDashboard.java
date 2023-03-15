
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDashboard extends AbstractForm {

	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private Integer				numTheoryActivities;
	private Integer				numHandsOnActivities;
	private Double				avgActivityPeriod;
	private Double				devActivityPeriod;
	private Double				minActivityPeriod;
	private Double				maxActivityPeriod;
	private Double				avgLearningTime;
	private Double				devLearningTime;
	private Double				minLearningTime;
	private Double				maxLearningTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
