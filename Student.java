package Com.cjc;

public class Student
{
int roll_no;
String name;
float marks;
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}

}
