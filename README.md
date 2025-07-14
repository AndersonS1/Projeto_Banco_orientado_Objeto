# Projeto Banco Orientado a Objetos em Java

## Descrição

Este projeto implementa um sistema simples de contas bancárias utilizando os conceitos de Programação Orientada a Objetos (POO) em Java.

O sistema contempla dois tipos de contas oferecidas pelo banco:

- **Conta Corrente**: permite depósito, saque, transferência e possui limite de crédito.
- **Conta Poupança**: permite depósito, saque e transferência.

---

## Conceitos Utilizados

- **Abstração**: A classe abstrata `Conta` representa as características comuns às contas.
- **Encapsulamento**: Os atributos são privados e acessados/modificados por métodos públicos ou protegidos.
- **Herança**: `ContaCorrente` e `ContaPoupanca` herdam da classe base `Conta`.
- **Polimorfismo**: Objetos de tipos específicos são tratados como objetos do tipo genérico `Conta`.

---

## Estrutura do Projeto

src/
└── banco/
├── Conta.java (classe abstrata base)
├── ContaCorrente.java (classe derivada - conta corrente)
├── ContaPoupanca.java (classe derivada - conta poupança)
└── BancoApp.java (classe principal com método main)


---

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/seurepositorio.git

Abra o projeto em sua IDE preferida (recomendado IntelliJ IDEA).

Compile e execute a classe BancoApp.

O programa realizará operações de depósito, saque e transferência entre contas, exibindo as informações no console.


Contribuição

Contribuições são bem-vindas! Para melhorias ou correções, faça um fork do projeto e envie um pull request.
