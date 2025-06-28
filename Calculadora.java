/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author Gilson Junior - PROJETO FEITO POR MIM PARA MEU APRENDIZADO EM JAVA.
 */
public class Calculadora {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); // Variavel de Entrada onde captura oque o usuario digita.
  int opçao; // variavel de numero inteiro para opçoes da calculadora.
  double num1, num2, resultado; // Variaveis de números com casas após a vírgula, onde o numero que o usario digitar vai se alocar nelas, e com isso resultado vai mostrar o calculo
  
   do{ // Laço de execução onde vai exibir para o usario uma das opçoes abaixo.
       System.out.println("=====CALCULADORA=====");
       System.out.println("1 - Soma");
       System.out.println("2 - Subtração");
       System.out.println("3 - Multiplicação");
       System.out.println("4 - Divisão");
       System.out.println("0 - Sair");
       System.out.print("Escolha uma opção: ");
       opçao = scanner.nextInt(); // Captura o numero que o usuario inseriu e guarda dentro da variavel opçao.
      
       if (opçao == 0) { // Se a opção que o usario inseriu for igual = 0, ele vai quebrar o laço e vai encerrar a calculadora.
       System.out.println("Encerrando Calculadora");
       break; // O break evita que execute os próximos cases desnecessariamente.
       }
          //Como usario nao digitou 0, ele irar pra proxima linha que independentemente da opçao, vai pedir para ele inserir um numero.
      System.out.println("Digite o primeiro numero: ");
      num1 = scanner.nextDouble();  // Vai guardar dentro da variavel num1, o numero que o usario digitou.
      System.out.println("Digite o segundo numero: ");
      num2 = scanner.nextDouble(); // Vai guardar dentro da variavel num2, o numero que o usario digitou.
      
      switch (opçao) { // O switch testa a opção do usuário e executa o código correspondente ao case correto.
          
          case 1: // case representa uma ação a opção escolhida no caso soma
          resultado = num1 + num2;
          System.out.println("O resultado da soma: " + resultado);
          break; // O break evita que execute os próximos cases desnecessariamente.
          
          case 2: // case representa uma ação a opção escolhida no caso subtração.
          resultado = num1 - num2;
          System.out.println("O resultado da soma: " + resultado);
          break; // O break evita que execute os próximos cases desnecessariamente.
          
          case 3: // case representa uma ação a opção escolhida no caso multiplicação.
          resultado = num1 * num2;
          System.out.println("O resultado da soma: " + resultado);
          break; // O break evita que execute os próximos cases desnecessariamente.
          
          case 4: // case representa uma ação a opção escolhida no caso divisão.
          if(num2 != 0) { // Como numeros não dão pra divir por 0, se o numero for diferente de 0, Vai pular pra proxima linha e fazer a divisão.
              resultado = num1 / num2;
           System.out.println("O resultado da soma: " + resultado); 
          }
          
          else { // O laço else(se nao) server para caso o numero digitado para fazer a divisão for 0, ele exibe a abaixo a mensagem de erro.
              System.out.println("Erro: divisão por zero não permitida.");
          }
          break; // O break evita que execute os próximos cases desnecessariamente.
          
          default: // O default serve para quando nenhuma das opçoes se encaixa no switch, exemplo o usario tem 4 opções, como 1, 2, 3, 4, ,0 | Se ele digitar 9 ira aparecer a mensagem abaixo, porque nao existem no switch case.
              System.out.println("Opção inválida. Tente novamente.");
      }
       System.out.println(); // O System.out.println()vazio, server pra organizar saltar as linhas, organizar e deixar mais estetico.
       
      } while (opçao != 0); // se a opção que o usario escolheu for diferente de 0, ele repete o codigo pra isso server o laço while.
          
      scanner.close(); // Fecha o scanner para não capturar nenhuma entrada de digitação do usario.
 }
}
