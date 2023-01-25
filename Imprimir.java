package actividad_cuadro_circulo;

import java.util.Scanner;

public class Imprimir {

		public int medida; 
		public String res;
	public static void main(String[] args) {
		
		String sep = "1";
		String sep_1 = "2";
		
		System.out.println("Para calcular cuadrado escriba: 1");
		System.out.println("Para calcular circulo escriba: 2");
		Scanner scan = new Scanner(System.in);
		String inline = scan.nextLine();
		
		if (sep.contains(inline)) {
			
			System.out.println("Ingrese la medida del lado");
			Scanner scan_c1 = new Scanner(System.in);
			String c_line_0 = scan.nextLine();
			
			
			String res = c_line_0;
			int medida = Integer.parseInt(res);
			
			Cuadrado c = new Cuadrado(medida);
			
			System.out.println("La longitud del lado es " + c.x);
			System.out.println("");
			
			System.out.println("Para calcular diagonal escriba: 1");
			System.out.println("Para calcular perimetro escriba: 2");
			System.out.println("Para calcular area escriba: 3");
			
			String c_diag = "1";
			String c_peri = "2";
			String c_area = "3";
			
			Scanner scan_c2 = new Scanner(System.in);
			String c_line_1 = scan.nextLine();
			
			if (c_diag.contains(c_line_1)) {
			
			System.out.println("La longitud de la diagonal es " + c.diagonal());
			
			} else { if(c_peri.contains(c_line_1)) {
				
				System.out.println("El perimetro es " + c.perimetro());
				
			} else { if(c_area.contains(c_line_1)) {
				
				System.out.println("El area del cuadrado es " + c.area());
			
				}
			}	
		}
			
	} else {
			
			if(sep_1.contains(inline)) {
			
			System.out.println("Ingrese la medida del radio");
			Scanner scan_circulo1 = new Scanner(System.in);
			String circulo_line_0 = scan.nextLine();
			
			
			String res = circulo_line_0;
			int medida = Integer.parseInt(res);
			
			Circulo circulo_1 = new Circulo(medida);
			
			System.out.println("La longitud del radio es " + circulo_1.x);
			System.out.println("");
			
			System.out.println("Para calcular circunferencia escriba: 1");
			System.out.println("Para calcular area escriba: 2");
			
			String circulo_circ = "1";
			String circulo_area = "2";
			
			Scanner scan_circulo2 = new Scanner(System.in);
			String circulo_line_1 = scan.nextLine();
			
			if (circulo_circ.contains(circulo_line_1)) {
			
			System.out.println("La circunferencia del circulo es " + circulo_1.circunferencia());
			
			} else { if(circulo_area.contains(circulo_line_1)) {
				
				System.out.println("El area del circulo es " + circulo_1.area());
				
				} 
			}	
		}

			}
		}	
	}

		/*MyClass mc = new MyClass(50);
System.out.println(mc.x);*/


