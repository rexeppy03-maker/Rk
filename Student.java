// Create class and objct 

class Student{
String name , city;
int age;

void display(){
System.out.println("Name:"+name+",Age:"+age+",city:"+city);
}

public static void main (String [] args){
Student s1 = new Student();
s1.name="Rakesh";
s1.city="KTM";
s1.age=19;
s1.display();
}
}