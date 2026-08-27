import java.time.LocalDate;

//////////////////////////////////////////////////////////////////
//
//  Class Name       : StudyLog
//
//  Description      : This class is used to store and manage
//                     information related to a study session.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 18/08/2026
//
//////////////////////////////////////////////////////////////////

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : StudyLog()
    //
    //  Description      : It is used to initialise the study log
    //                     object with date, subject, duration,
    //                     and description.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : toString()
    //
    //  Description      : It is used to return the study session
    //                     details in string format.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " Hours | " + Description;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : getDate()
    //
    //  Description      : It is used to return the study date.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public LocalDate getDate()
    {
        return this.Date;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : getSubject()
    //
    //  Description      : It is used to return the study subject.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public String getSubject()
    {
        return this.Subject;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : getDuration()
    //
    //  Description      : It is used to return the study duration.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public double getDuration()
    {
        return this.Duration;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : getDescription()
    //
    //  Description      : It is used to return the description of
    //                     the study session.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 18/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public String getDescription()
    {
        return this.Description;
    }
}
