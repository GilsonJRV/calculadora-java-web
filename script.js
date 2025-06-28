// Variáveis globais (como no seu Java)
let num1, num2, resultado;
let opçao = "1"; // Começa com soma selecionada

// Quando a página carrega
document.addEventListener('DOMContentLoaded', function() {
    // Elementos da página
    const display = document.getElementById('display');
    const operationSelect = document.getElementById('operation');
    const calculateBtn = document.getElementById('calculate');
    const clearBtn = document.getElementById('clear');
    const num1Input = document.getElementById('num1');
    const num2Input = document.getElementById('num2');
    const resultDiv = document.getElementById('result');

    // Atualiza a operação selecionada
    operationSelect.addEventListener('change', function() {
        opçao = this.value;
        updateDisplay();
    });

    // Botão Calcular (como seu switch case)
    calculateBtn.addEventListener('click', function() {
        // Pega os valores dos inputs
        num1 = parseFloat(num1Input.value);
        num2 = parseFloat(num2Input.value);

        // Verifica se são números válidos
        if (isNaN(num1) || isNaN(num2)) {
            resultDiv.textContent = "Por favor, insira números válidos";
            return;
        }

        // Faz o cálculo conforme a opção (igual ao seu Java)
        switch (opçao) {
            case "1": // Soma
                resultado = num1 + num2;
                resultDiv.textContent = `Resultado da soma: ${resultado}`;
                break;

            case "2": // Subtração
                resultado = num1 - num2;
                resultDiv.textContent = `Resultado da subtração: ${resultado}`;
                break;

            case "3": // Multiplicação
                resultado = num1 * num2;
                resultDiv.textContent = `Resultado da multiplicação: ${resultado}`;
                break;

            case "4": // Divisão
                if (num2 !== 0) {
                    resultado = num1 / num2;
                    resultDiv.textContent = `Resultado da divisão: ${resultado}`;
                } else {
                    resultDiv.textContent = "Erro: divisão por zero não permitida.";
                }
                break;

            default:
                resultDiv.textContent = "Opção inválida. Tente novamente.";
        }

        updateDisplay();
    });

    // Botão Limpar
    clearBtn.addEventListener('click', function() {
        num1Input.value = "";
        num2Input.value = "";
        resultDiv.textContent = "";
        opçao = "1";
        operationSelect.value = "1";
        updateDisplay();
    });

    // Atualiza o display (como seus System.out.println)
    function updateDisplay() {
        let operacaoTexto;
        switch (opçao) {
            case "1": operacaoTexto = "Soma"; break;
            case "2": operacaoTexto = "Subtração"; break;
            case "3": operacaoTexto = "Multiplicação"; break;
            case "4": operacaoTexto = "Divisão"; break;
            default: operacaoTexto = "Operação";
        }
        display.textContent = `Modo: ${operacaoTexto}`;
    }

    // Inicializa
    updateDisplay();
});