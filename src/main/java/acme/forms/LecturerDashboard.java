
package acme.forms;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LecturerDashboard {

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
