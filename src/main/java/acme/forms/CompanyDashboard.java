
package acme.forms;

import acme.framework.data.AbstractForm;

public class CompanyDashboard extends AbstractForm {
	//Serialisation identifier-----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private Integer				totalNumberPracticumsPerMonthLastYear;
	private Double				averagePracticumSessionTime;
	private Double				deviationPracticumSessionTime;
	private Double				minimunPracticumSessionTime;
	private Double				maximunPracticumSessionTime;
	private Double				averagePracticumTime;
	private Double				deviationPracticumTime;
	private Double				minimunPracticumTime;
	private Double				maximunPracticumTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
