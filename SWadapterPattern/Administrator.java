package SWadapterPattern;

public class Administrator {

    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp AttendanceSystemManagement = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp GradingSystemManagement = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp LibrarySystemManagement = new LibrarySystemAdapter(librarySystem);

        System.out.println(AttendanceSystemManagement.integrateSystem());
        System.out.println(GradingSystemManagement.integrateSystem());
        System.out.println(LibrarySystemManagement.integrateSystem());
    }
}