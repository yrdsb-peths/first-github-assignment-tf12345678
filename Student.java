public class Student
{
  private String name;
  private int grade;
  public Student(String nm, int grd)
  {
    name = nm;
    grade = grd;
  }

  public String toString()
  {
    return name + ", grade " + grd;
  }
}
