package Application;

import Subsistema.FormatarCpf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = sc.next();

        FormatarCpf formatarCpf = new FormatarCpf();
        System.out.println(formatarCpf.formatar(cpf));

        sc.close();

    }
}