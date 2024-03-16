import java.util.*;
class marks{
int s=0;
void getdata(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student's Roll No:");
int rno=sc.nextInt();
System.out.println("Enter Student Name:");
String name=sc.next();
}
void subject(){
Scanner sc=new Scanner(System.in);
System.out.println("How many subject you want:");
int subno=sc.nextInt();
for(int i=1;i<=subno;i++)
{
System.out.println("Enter subject's marks:");
int mark=sc.nextInt();
s=s+mark;
}
System.out.println("total is:"+s);
int avg=s/subno;
System.out.println("average marks  is:"+avg);
if(avg>=75 && avg>100){
System.out.println("grade:DISTINCTION");
}
else if(avg>60 && avg<75 ){
System.out.println("grade:FIRST CLASS");
}
else if(avg>=50 && avg<60){
System.out.println("grade:SECOND CLASS");
}
else if(avg>=35 && avg<50){
System.out.println("grade:PASS");
}
else
{
System.out.println("FAIL");
}
}
public static void main(String args[]){
marks m1=new marks();
m1.getdata();
m1.subject();
}
}

