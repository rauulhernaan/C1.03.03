
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditorDashboard extends AbstractForm {

	protected static final long	serialVersionUID	= 1L;

	Integer						totalNumberOfTheoryAudits;
	Integer						totalNumberOfHandsOnAudits;
	Double						averageNumberOfRecordsPerAudit;
	Double						deviationNumberOfRecordsPerAudit;
	Integer						minimumNumberOfRecordsPerAudit;
	Integer						maximumNumberOfRecordsPerAudit;
	Double						averagePeriodLengthPerAuditRecord;
	Double						deviationPeriodLengthPerAuditRecord;
	Integer						minimumPeriodLengthPerRecord;
	Integer						maximumPeriodLengthPerRecord;

}
