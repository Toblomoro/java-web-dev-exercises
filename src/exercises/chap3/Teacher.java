package exercises.chap3;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, Integer yearsTeaching){
        this.firstName =firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }


    public String getFirstName() {
        return firstName;
    };
    public void setFirstName(String aFirstName){
        firstName= aFirstName;
    }

    public String getLastName() {
        return lastName;
    };
    public void setLastName(String aLastName){
        lastName=aLastName;
    }
    public String getSubject() {
        return subject;
    };
    public void setSubject(String aSubject){
        subject=aSubject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(Integer aYearsTeaching){
        yearsTeaching=aYearsTeaching;
    }






    }


