package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        float massa = sc.nextFloat();
        System.out.print("Digite o volume inicial (m³): ");
        float volume = sc.nextFloat();
        System.out.print("Digite a densidade inicial (kg/m³): ");
        float densidade = sc.nextFloat();
        System.out.print("Digite a altura inicial (m): ");
        double altura = sc.nextDouble();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);



        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Densidade: " + c1.getDensidade());
        System.out.println("Altura: " + c1.getAltura());

        System.out.println("IMC: " + c1.calcularIMC());

        while(true){
            System.out.println("\nDigite nova massa (kg): ");
            c1.setMassa(sc.nextFloat());
            System.out.println("Digite nova altura (m): ");
            c1.setAltura(sc.nextDouble());

            System.out.println("=== NOVOS VALORES ===");
            System.out.println("Nova massa: " + c1.getMassa());
            System.out.println("Nova altura: " + c1.getAltura());
            System.out.println("Novo IMC: " + c1.calcularIMC());
        }
    }
}
//questão 1
//quando eu coloquei a linha c1.massa = "2", deu erro porque o valor estava entre aspas, e o java entende que "2" é String e não numero

//CONCLUSÃO: o jeito certo de escrever é sem as aspas para que o java entenda como tipo int


//questao 2
//quando troquei private por public float massa eu consegui mudar o valor da massa direto no programa, por exemplo: c1.massa = 80;
//isso aconteceu porque com o publico atributo pode ser acessado e alterado de qualquer lugar do codigo

//CONCLUSAO: posso acessar e altrear sempre que eu quiser

//questao 3
//quanto eu mudei o método setVolume para private, não é mais possível chamar ele no programa principal, por exemplo com c1.setVolume(10)
//isso aconteceu porque o metodo private só pode ser usado dentro da própria classe
//CONCLUSAO: o main nao poderia mais mexer no volumne.