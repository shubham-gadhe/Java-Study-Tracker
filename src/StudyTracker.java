import java.util.*;
import java.io.*;

class StudyTracker
{
    private ArrayList<StudyLog> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyLog>();
    }

    public void InsertLog(Scanner sobj)
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("----------- Enter the Details of your Study -----------");
        System.out.println("-------------------------------------------------------");

        LocalDate lobj = LocalDate.now();

        System.out.println("We Are Entering The Date As : " + lobj);

        System.out.println("Enter The Name Of Subject Like C/C++/Java etc : ");
        String sub = sobj.nextLine();

        System.out.println("Enter The Time Period Of Your Study : ");
        double dur = sobj.nextDouble();

        sobj.nextLine();

        System.out.println("Please Provide The Description Of Your Study : ");
        String desc = sobj.nextLine();

        StudyLog studyobj = new StudyLog(lobj, sub, dur, desc);

        Database.add(studyobj);

        System.out.println("-------------------------------------------------------");
        System.out.println("Study Log Gets Inserted Successfully");
        System.out.println("-------------------------------------------------------");
    }

    public void DisplayLog()
    {
        if(Database.isEmpty())
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Nothing To Display. Database Is Empty");
            System.out.println("-------------------------------------------------------");
            return;
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("------------- Log Report Of Study Tracker -------------");
        System.out.println("-------------------------------------------------------");

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------");
    }

    public void ExportToCSV(Scanner sobj)
    {
        if(Database.isEmpty())
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("-------- Nothing To Export. Database Is Empty ---------");
            System.out.println("-------------------------------------------------------");

            return;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("---- Enter the name that you want to create for CSV file ----");
        System.out.println("-------------------------------------------------------------");

        String FileName = sobj.nextLine();

        if(!FileName.endsWith(".csv"))
        {
            FileName = FileName + ".csv";
        }

        try(FileWriter fwobj = new FileWriter(FileName))
        {
            fwobj.write("Date,Subject,Duration of Study,Description of Study\n");

            for(StudyLog s : Database)
            {
                fwobj.write(
                    s.getDate() + "," +
                    s.getSubject() + "," +
                    s.getDuration() + "," +
                    s.getDescription() + "\n"
                );
            }

            System.out.println("-------------------------------------------------------");
            System.out.println("Data Gets Exported To CSV Successfully");
            System.out.println("File Name : " + FileName);
            System.out.println("-------------------------------------------------------");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to export data to CSV");
            System.out.println(eobj.getMessage());
        }
    }

    public void SummaryByDate()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Summary by Date from study tracker");
        System.out.println("-------------------------------------------------------");

        TreeMap <LocalDate, Double> tobj = new TreeMap<LocalDate, Double>();

        LocalDate lobj = null;
        double d = 0.0;
        double old = 0.0;

        for(StudyLog s : Database)
        {
            lobj = s.getDate();
            d = s.getDuration();

            if(tobj.containsKey(lobj))
            {
                old = tobj.get(lobj);
                tobj.put(lobj, d+old);
            }
            else
            {
                tobj.put(lobj, d);
            }
        }

        // Display the details as per date
        for(LocalDate l : tobj.keySet())
        {
            System.out.println("Date : " + l + " Total Study Duration : " + tobj.get(l));
        }

        System.out.println("-------------------------------------------------------");
    }

    public void SummaryBySubject()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Summary by Subject from study tracker");
        System.out.println("-------------------------------------------------------");

        TreeMap <String, Double> tobj = new TreeMap<String, Double>();

        String sobj = null;
        double d = 0.0;
        double old = 0.0;

        for(StudyLog s : Database)
        {
            sobj = s.getSubject();
            d = s.getDuration();

            if(tobj.containsKey(sobj))
            {
                old = tobj.get(sobj);
                tobj.put(sobj, d + old);
            }
            else
            {
                tobj.put(sobj, d);
            }
        }

        // Display the details as per subject
        for(String str : tobj.keySet())
        {
            System.out.println("Subject : " + str + " Total Study Duration : " + tobj.get(str));
        }

        System.out.println("-------------------------------------------------------");

    }
}
