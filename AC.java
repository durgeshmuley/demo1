class circle 
{ 
double radius;
void setData(double r) 
{ 
radius = r; 
} 
void area () 
{ 
double circleArea = Math.PI * radius*radius; 
System.out.println("Area of circle is = " + circleArea); 
} 
void circumference() 
{ 
double cir = 2 * Math.PI * radius ; 
System.out.println("circumference of circle is = " + cir); 
}        
} 
class Ac
{ 
public static void main(String[] args) 
{ 
        
circle obj = new circle(); 
obj.setData(7.5); 
obj.area( );  
obj.circumference( ); 
 } 
 } 
 