package tema_Curs1_2;

public class TestShape {

	public static void main(String[] args) {
		/* u Vom face 2 clase. Prima se cheama Shape si a doua se cheama
TestShape
u In clasa Shape avem 2 metode :
u calculateSquareArea (care calucleaza aria unui patrat cu formula
length * lenght) si calculateRectangleArea (care calculeaza aria
unui dreptunghi cu formula length*width)
u Avem 3 constructori :
u Unul care primeste ca parametru length si executa metoda
calculateSquareArea
u Unul care primeste ca parametru length si width si executa metoda
calculateRectangleArea
u Unul care primeste ca parametru o variabila double care se
cheama radius si care calculeaza raza unui cerc cu formula
radius*radius*Math.PI

u In clasa TestShape doar vom instantia in metoda main 3 obiecte
care se vor chema :
u patrat , cerc si dreptunghi

u La rezultat ne asteptam sa printeze in consola :
The area of the square is : < rezultat >
The area of the rectangle is : <rezultat>
The area of the circle is : < rezultat >

Nota:
1. In TestShape nu avem metoda de System.out.print....
2. nu avem variabile la nivel de clasa in nici una dintre clase
3. Numarul metodelor trebuie sa fie 2
4. Numarul contructorilor trebuie sa fie 3
5. Math.PI il folosim direct pentru ca face parte din clasa Math din
Java
*/
		
		Shape patrat = new Shape(8);
		
		Shape dreptunghi = new Shape (4,2); 
		
		Shape cerc = new Shape (3);
		
		
patrat.calculateSquareArea(5);
dreptunghi.calculateRectangleArea(2, 8);


	}
	
	

}
