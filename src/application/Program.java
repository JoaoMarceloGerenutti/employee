package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.print("Digite o número de funcionarios: ");
		int numeroFuncionarios = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=numeroFuncionarios; i++) {
			System.out.println("------------------------------------");
			System.out.println("Dados do funcionario #" + i);
			
			System.out.print("Terceirizado (S/N)? ");
			char terceirizado = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (terceirizado == 'S') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				lista.add(new OutsourcedEmployee(nome, horas, valorPorHora, despesaAdicional));
			} else {
				lista.add(new Employee(nome, horas, valorPorHora)); 
			}
		}
		System.out.println();
		
		System.out.println("Pagamentos:");
		for (Employee employee : lista) {
			System.out.println(employee.getNome() + " - $ " + String.format("%.2f", employee.pagamento()));
		}

		sc.close();
	}

}
