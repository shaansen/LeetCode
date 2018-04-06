
public class StudentAttendanceRecordI {
	
	public static boolean checkRecord(String s) {
        return !((s.length()-s.replaceAll("A","").length()>1) || s.contains("LLL"));
    }

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLLP"));
	}

}
