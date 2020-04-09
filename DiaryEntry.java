import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class DiaryEntry {
	Appointment appointment;
	LocalDate appDate;
	LocalTime appStartTime;
	LocalTime appEndTime;
	String appTreatmentType;
	
	DiaryEntry next;
	
	public DiaryEntry(LocalDate date, LocalTime startTime, LocalTime endTime, String treatmentType) {
		this.appDate = date;
		this.appStartTime = startTime;
		this.appEndTime = endTime;
		this.appTreatmentType = treatmentType.toLowerCase();
	}
	
	public DiaryEntry getNext() {
		return next;
	}
	
	public void setNext(DiaryEntry node) {
		next = node;
	}
	
	public void displayEntry() {
		System.out.print("Date - " + appDate + ", Start Time - " + appStartTime + ", End Time - " + appEndTime + ", Treatment Type " + appTreatmentType + "\n");
	}

	public void setAppType(String string) {
		appTreatmentType = string;
	}
}
