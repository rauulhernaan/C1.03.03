
package acme.forms;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssistantDashboard extends AbstractRole {

	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private Integer				totalNumberTutorials;
	private Double				averageSessionTime;
	private Double				deviationSessionTime;
	private Double				minimunSessionTime;
	private Double				maximunSessionTime;
	private Double				averageTutorialTime;
	private Double				deviationTutorialTime;
	private Double				minimunTutorialTime;
	private Double				maximunTutorialTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
