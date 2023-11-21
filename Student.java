public class Student
{
  private String name;
  private int grade;
  private int volunteerHours;
  public Student(String nm, int grd, int vlntHr)
  {
    name = nm;
    grade = grd;
    volunteerHours = vlntHr;
  }

  public String toString()
  {
    return name + ", grade " + grd + " with " + volunteerHours + " volunteer hours.";
  }
}
