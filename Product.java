class Product
{
int pcode;
String pname;
double price;
double lowest;
void data(int c,String n,double p)
{
pcode=c;
pname=n;
price=p;
}
void display()
{
System.out.println(pcode+"\t\t\t"+pname+"\t\t"+price);
}
static void findLowest(double price1,double price2,double price3)
{
if(price1<=price2 && price1<=price3)
{
System.out.println("Product 1 is the lowest");
}
else if(price2<=price1 && price2<=price3)
{
System.out.println("Product 2 is the lowest");
}
else
{
System.out.println("Product 3 is the lowest");
}
}
public static void main(String args[])
{
Product obj1=new Product();
Product obj2=new Product();
Product obj3=new Product();
obj1.data(101,"pro 1",250);
obj2.data(102,"pro 2",200);
obj3.data(103,"pro 3",360);
System.out.println("\nProduct information:\n Product code:\t\t Product name:\t\tProduct price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1.price,obj2.price,obj3.price);
}
}
