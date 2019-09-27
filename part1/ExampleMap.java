import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      int tot_units = 0;
      List<String> overEnrolledStudents = new LinkedList<>();
      for (Map.Entry<String, List<Course>> entry : courseListsByStudentName.entrySet())
	{
           // if entry.getValue().
           // System.out.println(entry);
            if(entry.getValue().size() * 4 > unitThreshold)
		overEnrolledStudents.add(entry.getKey());
            //tot_units = 0;
            //for(Course stud_classes: entry.getValue())
              //  tot_units += stud_classes[1];
            
           // if(tot_units > unitThreshold)
	//	overEnrolledStudents.add(entry);
       
	}
      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      return overEnrolledStudents;      
   }
}
