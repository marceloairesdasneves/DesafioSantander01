# 🎬 Sistema de Bilheteria - OOP & Java Domain Modeling

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Arquitetura](https://img.shields.io/badge/Architecture-OOP-blue?style=for-the-badge)

Este repositório contém a implementação do *core* de um sistema de bilheteria de cinema, desenvolvido para consolidar conceitos avançados de Orientação a Objetos (OOP) e modelagem de domínio seguro em Java.

## 🎯 O Desafio e as Regras de Negócio

O sistema gerencia a emissão e o cálculo de valor de diferentes tipos de ingressos, aplicando regras de negócio específicas de forma encapsulada:

1. **Meia Entrada:** Aplica a redução de 50% sobre o valor base do ingresso.
2. **Ingresso Família:** Multiplica o valor base pela quantidade de membros. Caso a família tenha 4 ou mais pessoas, é aplicado um desconto automático de 5% sobre o valor total bruto.

## 🏗️ Decisões de Arquitetura e Clean Code

Para garantir que o código seja resiliente, escalável e seguro para operações financeiras, as seguintes abordagens foram aplicadas:

* **Polimorfismo e Contratos Rígidos:** A classe abstrata `Ingresso` dita o contrato através do método `calcularValorReal()`. O sistema central não precisa conhecer o tipo específico do ingresso, apenas executa o cálculo respeitando o Princípio da Substituição de Liskov (SOLID).
* **Segurança Financeira com `BigDecimal`:** Substituição de tipos primitivos (`double`/`float`) por `BigDecimal` para evitar perda de precisão em ponto flutuante, aplicando escalas decimais (`setScale`) e regras de arredondamento comercial (`RoundingMode.HALF_UP`).
* **Blindagem de Domínio com `Enum`:** Utilização da enumeração `TipoAudio` (Dublado/Legendado) para evitar injeção de estados inválidos ou erros de digitação (tipagem forte).
* **Eliminação de *Magic Numbers*:** Regras numéricas de descontos (como `0.05` e `4` pessoas) foram encapsuladas em constantes `static final` na própria classe dona da regra de negócio.

## 📐 Diagrama de Classes (UML)

A hierarquia foi desenhada previamente para garantir o encapsulamento e a correta distribuição de responsabilidades antes da codificação.

> **Nota:** *(Adicione aqui a imagem do seu diagrama UML, arrastando ela para o GitHub ou usando a tag `![Diagrama UML](./caminho-da-imagem.png)`)*

## 🚀 Como Executar

O projeto é uma aplicação Java pura (SE) e pode ser executado em qualquer ambiente com a JDK instalada.

1. Clone o repositório:
   ```bash
   git clone [https://github.com/marceloairesdasneves/sistema-bilheteria-java.git](https://github.com/marceloairesdasneves/sistema-bilheteria-java.git)