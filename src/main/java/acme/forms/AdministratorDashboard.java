
package acme.forms;

import java.util.Map;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDashboard extends AbstractForm {

	protected static final long		serialVersionUID	= 1L;

	private Map<String, Integer>	totalNumberOfPrincipalsForRole;
	private Double					emailAndLinkPeepsRatio;
	private Map<Boolean, Double>	criticalBulletinRatio;
	private Map<String, Double>		minimunOfTheBudgetOffers;
	private Map<String, Double>		maximunOfTheBudgetOffers;
	private Map<String, Double>		averageOfTheBudgetOffers;
	private Map<String, Double>		deviationOfTheBudgetOffers;
	private Integer					minimunNumberOfNotesInLast10Weeks;
	private Integer					maximunNumberOfNotesInLast10Weeks;
	private Double					averageNumberOfNotesInLast10Weeks;
	private Double					deviationNumberOfNotesInLast10Weeks;

}
