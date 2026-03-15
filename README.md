# PooHerancaKotlin

Este projeto é um exemplo prático de Programação Orientada a Objetos (POO) utilizando a linguagem Kotlin, com foco no conceito de **Herança**.

## 🚀 Sobre o Projeto

O objetivo deste projeto é demonstrar como funciona a herança em Kotlin, utilizando um cenário comum de classes de funcionários.

### Estrutura de Classes

- **Funcionario**: Classe base (progenitora) que contém atributos comuns como nome, data de admissão e salário.
- **Gerente**: Classe que herda de `Funcionario` e adiciona atributos específicos como bonificação e número de funcionários gerenciados.

## 🛠️ Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal.
- **Android Studio**: IDE de desenvolvimento.

## 📝 Exemplo de Herança

Em Kotlin, para permitir que uma classe seja herdada, utilizamos a palavra-chave `open`:

```kotlin
open class Funcionario {
    // ...
}

class Gerente : Funcionario() {
    // ...
}
```

## 📂 Como rodar o projeto

1. Clone o repositório.
2. Abra o projeto no **Android Studio**.
3. Sincronize o Gradle.
4. Execute o aplicativo em um emulador ou dispositivo físico.

---
Desenvolvido para fins de estudo de POO com Kotlin.
