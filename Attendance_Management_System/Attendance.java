import java.util.Scanner;

public class Attendance{

    public static void main(String[] args) {
       //Scanner obect for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Attendance Management System!");

        //Enters name of user into nam
        System.out.println("Enter your username:");
        String nam = sc.nextLine();

        //Enter the id of the user/candidate
        System.out.println("Enter your register number:");
        int num = sc.nextInt();

        System.out.println("Enter your Attendance Record ('p' for present, 'a' for absent):");
        char[] AttendanceRecord = new char[5];
        AttendanceRecord=sc.next().toCharArray();
        
        int Presented_Days=0;
        int Absent_Days=0;

        //finding how many days user is present/Absent
        for(int i=0; i<AttendanceRecord.length; i++){
            if(AttendanceRecord[i]=='p'){
                Presented_Days++;
            }
            if(AttendanceRecord[i]=='a'){
                Absent_Days++;
            }  
        }

        int Total_Days=Presented_Days+Absent_Days;

        float attendancePercentage = (float) Presented_Days / Total_Days * 100;

        //Displaying how many days user is present out of TotalDays
         System.out.println("Your Present Days out of Total are:"+ Presented_Days+"/"+Total_Days);

        // Display the student's attendance percentage
        System.out.println("Your attendance percentage is " + attendancePercentage + "%.");

        // Determine the student's attendance status
        if (attendancePercentage >= 75) {
            System.out.println("You have a good percentange of attendance.");
        } else {
            System.out.println("Your attendance is below 75");
        }
    }
}