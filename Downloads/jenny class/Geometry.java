



}ring[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter first_point: ");
double first_point = sc.nextDouble();

System.out.print("Enter second_point: ");
double second_point = sc.nextDouble();

System.out.print("Enter third_point: ");
double third_point = sc.nextDouble();

double sides = (first_point + second_point + third_point)/2;
System.out.println("the sides is: " + sides);

double area = Math.sqrt(sides * (sides-first_point) * (sides-second_point) * (sides-third_point));
System.out.print("the area is: " + area);
