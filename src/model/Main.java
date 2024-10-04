package model;

import model.Adicionar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adicionar adicionar = new Adicionar();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Pacientes ---");
            System.out.println("1. Registrar novo paciente");
            System.out.println("2. Alterar paciente existente");
            System.out.println("3. Realizar atendimento");
            System.out.println("4. Listar todos os pacientes");
            System.out.println("5. Mostrar detalhes de um paciente");
            System.out.println("6. Apagar paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionar.registrarPaciente();
                    break;
                case "2":
                    adicionar.alterarPaciente();
                    break;
                case "3":
                    adicionar.realizarAtendimento();
                    break;
                case "4":
                    adicionar.listarPacientes();
                    break;
                case "5":
                    adicionar.mostrarPaciente();
                    break;
                case "6":
                    adicionar.apagarPaciente();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("0"));
    }
}