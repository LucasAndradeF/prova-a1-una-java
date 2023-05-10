// Aluno: Lucas Ferreira Andrade - RA: 4231921505
// Curso: Ciência da Computação
import java.util.Scanner;

public class ConsumoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // FORAM DECLARADAS TODAS AS VARIÁVEIS QUE SERÃO UTILIZADAS NO PROGRAMA.
        String placaDoVeiculo;
        double valorLitroCombustivel, quantidadeTotalCombustivel, velocidadeMediaPonderada, custoTotalViagem, kmRodadosSessenta, kmRodadosOitenta, kmRodadosCem, kmRodadosCentoEVinte, kmRodadosCentoEQuarenta;
        
        // ENTRADA DE DADOS DO PROGRAMA: 
        System.out.println("\nEstimativa de Custo de Combustível");
        System.out.println("\nInforme a placa do veículo:");
        placaDoVeiculo = sc.nextLine();
        System.out.println("\nInforme o valor do litro de combustível:");
        valorLitroCombustivel = sc.nextDouble();
        System.out.println("\nInforme a quantidade de quilômetros rodados a 60 KM/H:");
        kmRodadosSessenta = sc.nextDouble();
        System.out.println("\nInforme a quantidade de quilômetros rodados a 80 KM/H:");
        kmRodadosOitenta = sc.nextDouble();
        System.out.println("\nInforme a quantidade de quilômetros rodados a 100 KM/H:");
        kmRodadosCem = sc.nextDouble();
        System.out.println("\nInforme a quantidade de quilômetros rodados a 120 KM/H:");
        kmRodadosCentoEVinte = sc.nextDouble();
        System.out.println("\nInforme a quantidade de quilômetros rodados a 140 KM/H:");
        kmRodadosCentoEQuarenta = sc.nextDouble();
            sc.close();

        // PROCESSAMENTO DOS DADOS INSERIDOS PELO USUÁRIO DO PROGRAMA:
        quantidadeTotalCombustivel = ((kmRodadosSessenta / 30.7) + (kmRodadosOitenta / 26.8) + (kmRodadosCem / 22.4) + (kmRodadosCentoEVinte / 18.1) + (kmRodadosCentoEQuarenta / 14.5));
        velocidadeMediaPonderada = ((kmRodadosSessenta * 60) + (kmRodadosOitenta * 80) + (kmRodadosCem * 100) + (kmRodadosCentoEVinte * 120) + (kmRodadosCentoEQuarenta * 140)) / (kmRodadosSessenta + kmRodadosOitenta  + kmRodadosCem  + kmRodadosCentoEVinte  + kmRodadosCentoEQuarenta);
        custoTotalViagem = (quantidadeTotalCombustivel * valorLitroCombustivel);

        // SAÍDA DE DADOS DO PROGRAMA:
        System.out.println("\nPlaca do veículo: " + placaDoVeiculo);
        System.out.printf("Consumo total: %.4f litros" , quantidadeTotalCombustivel);
        System.out.printf("\nValor total: R$ %.2f" , custoTotalViagem);
        System.out.printf("\nVelocidade média ponderada: %.4f" , velocidadeMediaPonderada); 
    }
}