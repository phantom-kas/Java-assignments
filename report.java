


package report_203j11;

import java.util.HashMap;

//creating superclass of courses
abstract class score{
	protected int score;
	public int getScore()
	{
		return this.score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
}

//creating parent class of students and teachers
abstract class person{
	String name;
	int age;
	String nationality;	
	public person(String name,int age,String nationality) 
	{
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
}


 
 
//creating teacher class
 class teacher extends person
 {

	public teacher(String name, int age, String nationality) {
		super(name, age, nationality);
		// TODO Auto-generated constructor stub
	}	 
 }
 //creating parents class of all courses
 class course extends score{
	public String name;
	 teacher teacher;
	 String getTeaher()
	 {
		 return this.teacher.name;
	 }
}
 
 //created java class to inherit from course class

 class Java extends course
 {
	
	 public Java( teacher t,int score) {
			this.teacher =t;
			this.score = score;
			this.name = "java";
			 return;
		}
	 public String getName() {
		 
		return this.name;
	 }
 }
 //created database course class to inherit from course class

 class database extends course
 {
	
	 public database( teacher t,int score) {
			this.teacher =t;
			this.score = score;
			this.name = "database";
			 return;
		}
	 public String getName() {
		 
		return this.name;
	 }
 }
 
 //created Chinese course class to inherit from course class

 class chinese extends course
 {
	
	 public chinese( teacher t,int score) {
			this.teacher =t;
			this.score = score;
			this.name = "chinese";
			 return;
		}
	 public String getName() {
		 
		return this.name;
	 }
 }
 
 
 
 class student extends person{
	HashMap<String ,course> courses = new HashMap();
	private int totalscore;
	public student(String name, int age, String nationality) {
		super(name, age, nationality);
		// TODO Auto-generated constructor stub
	}
	public void addCourse(String name,	teacher t,int score){
		
		 switch(name)
		 {
		 case "java":
			 
			 courses.put("java",new Java(t , score));
		 case "database":
			 
			 courses.put("database",new database(t , score));
		 
	case "chinese":
		 
		 courses.put("chinese",new chinese(t , score));
	 }
		 
	
		 
	}
	public float getAverage()
	{
			
		
			courses.forEach((key,val)->{this.totalscore+=this.courses.get(key).getScore();});
		
		return this.totalscore/this.courses.size();
		
	}
	public void printRecordRow()
	{
		System.out.printf("%-10s%-15s%-15d%-15s%-15d%-20s%-20d%-20s%-20d%-20f\n",this.name,this.nationality,this.age,this.courses.get("java").getTeaher(),this.courses.get("java").getScore(),this.courses.get("database").getTeaher(),this.courses.get("database").getScore(),this.courses.get("chinese").getTeaher(),this.courses.get("chinese").getScore(),this.getAverage());

	}
 }
 
public class report {
	public static void main(String args[])
	{
		
		
		System.out.print("\t\t\t\t\t********************\n   \t\t\t\t\t        Report  \n\t\t\t\t          \t203j11 \n   \t\t\t\t\t********************\n\n");
		System.out.print("\n____________________________________________________________________________________________________________________________________________________________________\n");
		 
		
		//creating Sam the  Java  teacher
		teacher t = new teacher("Sam", 35, "Chinese");
		
		//Mavis the Chinese  teacher
		teacher t2 = new teacher("Mavis", 25, "Chinese");
		
		//creating Guy the database systems teacher
		teacher t1 = new teacher("Guy", 40, "Chinese");
		//creating the students
		student stu1 = new student("Jhon", 20, "Ghanaian");
		student stu2 = new student("Kim", 19, "American");
		student stu3 = new student("Kofi", 21, "American");
		student stu4 = new student("Rex", 22, "American");
		
		//adding score for the students various courses
		stu1.addCourse("java", t, 90);
		stu1.addCourse("database", t1, 100);
		stu1.addCourse("chinese", t2, 20);
		
		stu2.addCourse("java", t, 50);
		stu2.addCourse("database", t1, 70);
		stu2.addCourse("chinese", t2, 60);
		
		stu3.addCourse("java", t, 59);
		stu3.addCourse("database", t1, 78);
		stu3.addCourse("chinese", t2, 50);
		
		stu4.addCourse("java", t, 79);
		stu4.addCourse("database", t1, 88);
		stu4.addCourse("chinese", t2, 90);
		
		
		// Creating the header or the table
		System.out.printf("%-10s%-15s%-15s%-15s%-15s%-20s%-20s%-20s%-20s%-20s","Name","Nationality","age","Java techer","Java score","Database teacher","Database score","Chinese teacher","Chinese score","Average score");
		System.out.print("\n____________________________________________________________________________________________________________________________________________________________________\n");
		// displaying the rows if the table
		stu1.printRecordRow();
		stu2.printRecordRow();
		stu3.printRecordRow();
		stu4.printRecordRow();
	}


	}
