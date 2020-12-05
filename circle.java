interface shape{
void area();void parameter();
}
class  traingle implements shape{
public void area(){
int b=10,h=5;
System.out.println("------Traingle------");System.out.println((b*h)/2);}
public void parameter(){
int a=30,b=20,c=10;
System.out.println("parameter"+(a+b+c));}}
 class circle extends traingle{
public void area(){
int r=5;
System.out.println("------circle------");
System.out.println("area:"+(3.1428*r*r));}
public void parameter(){
int r=5;System.out.println("parameter:"+(2*3.1428*r));}
public static void main(String args[]){
circle t=new circle();
t.area();
t.parameter();
traingle tt=new traingle();
tt.area();
tt.parameter();
}
}