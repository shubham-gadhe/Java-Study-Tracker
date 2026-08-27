import java.util.*;

//////////////////////////////////////////////////////////////////
//
//  Class Name       : StudyTrackerApp
//
//  Description      : This class contains the main method of the
//                     Study Tracker application. It provides a
//                     menu-driven interface to perform various
//                     study tracking operations.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 18/08/2026
//
//////////////////////////////////////////////////////////////////

public class StudyTrackerApp
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the Study Tracker
    //                     application. It displays the menu and
    //                     performs operations based on the user's
    //                     choice.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();
        Scanner sobj = new Scanner(System.in);

        int iChoice = 0;

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------- Welcome to Study Tracker ---------------");
        System.out.println("-------------------------------------------------------");

        do
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Please Select Appropriate Option :");
            System.out.println("-------------------------------------------------------");

            System.out.println("1 : Insert New Study Log");
            System.out.println("2 : View All Study Logs");
            System.out.println("3 : Export Study Log To CSV");
            System.out.println("4 : Summary Of Study Log By Date");
            System.out.println("5 : Summary Of Study Log By Subject");
            System.out.println("6 : Exit The Application");

            System.out.println("-------------------------------------------------------");
            System.out.println("Enter your choice : ");

            iChoice = sobj.nextInt();
            sobj.nextLine();

            switch(iChoice)
            {
                case 1:
                    stobj.InsertLog(sobj);
                    break;

                case 2:
                    stobj.DisplayLog();
                    break;

                case 3:
                    stobj.ExportToCSV(sobj);
                    break;

                case 4:
                    stobj.SummaryByDate();
                    break;

                case 5:
                    stobj.SummaryBySubject();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Please Enter Valid Option");
                    break;
            }

        } while(iChoice != 6);

        System.out.println("-------------------------------------------------------");
        System.out.println("---------- Thank You For Using Study Tracker ----------");
        System.out.println("-------------------------------------------------------");

        sobj.close();
    }
}
