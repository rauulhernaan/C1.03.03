
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LecturerDashboard extends AbstractForm {

	protected static final long	serialVersionUID	= 1L;

	Integer						totalNumberOfTheoryLectures;
	Integer						totalNumberOfHandsOnLectures;
	Double						averageNumberOfRecordsPerLecture;
	Double						deviationNumberOfRecordsPerLecture;
	Integer						minimumNumberOfRecordsPerLecture;
	Integer						maximumNumberOfRecordsPerLecture;
	Double						averagePeriodLengthPerLectureRecord;
	Double						deviationPeriodLengthPerLectureRecord;
	Integer						minimumPeriodLengthPerRecord;
	Integer						maximumPeriodLengthPerRecord;
}
