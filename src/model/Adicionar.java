package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Adicionar {
    private ArrayList<Paciente> pacientes;

    public Adicionar() {
        pacientes = new ArrayList<>();
    }

    public void registrarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = ler.nextLine();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = ler.nextLine();

        System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
        String data = ler.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(data, formatter);

        Paciente paciente = new Paciente();
        paciente.setNome(nome);
        paciente.setSobrenome(sobrenome);
        paciente.setDataNascimento(dataNascimento);

        pacientes.add(paciente);
        System.out.println("Paciente registrado com sucesso!");
    }

    public void alterarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente que deseja alterar: ");
        String nome = ler.nextLine();

        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o novo sobrenome: ");
                String novoSobrenome = ler.nextLine();
                paciente.setSobrenome(novoSobrenome);

                System.out.println("Digite a nova data de nascimento (dd/MM/yyyy): ");
                String data = ler.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate novaDataNascimento = LocalDate.parse(data, formatter);
                paciente.setDataNascimento(novaDataNascimento);

                System.out.println("Dados do paciente alterados com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void realizarAtendimento() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente para realizar atendimento: ");
        String nome = ler.nextLine();

        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite a descrição do atendimento: ");
                String descricao = ler.nextLine();
                Atendimento atendimento = new Atendimento(LocalDate.now(), descricao);
                paciente.adicionarConsulta(atendimento);
                System.out.println("Atendimento registrado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    public void mostrarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente para mostrar os detalhes: ");
        String nome = ler.nextLine();

        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                System.out.println(paciente);
                for (Atendimento atendimento : paciente.getAtendimentos()) {
                    System.out.println(atendimento);
                }
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void apagarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente que deseja apagar: ");
        String nome = ler.nextLine();

        Paciente pacienteParaRemover = null;
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                pacienteParaRemover = paciente;
                break;
            }
        }

        if (pacienteParaRemover != null) {
            pacientes.remove(pacienteParaRemover);
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
}