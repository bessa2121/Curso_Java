# ☕ Curso de Java 

Este repositório contém os estudos, exercícios e projetos desenvolvidos durante o **Curso de Java** oferecido pela [Digital Innovation One (DIO)](https://www.dio.me/).  
O objetivo é consolidar os fundamentos da linguagem Java e aplicar boas práticas de programação.

---

## 📌 Conteúdo do Curso

Durante o curso, foram abordados os seguintes tópicos:

- ✅ **Introdução ao Java**
  - História da linguagem
  - Instalação do JDK e configuração do ambiente
  - Estrutura básica de um programa Java

- ✅ **Sintaxe Básica**
  - Tipos de dados
  - Variáveis e constantes
  - Operadores aritméticos, relacionais e lógicos
  - Estruturas de controle: `if/else`, `switch`, `while`, `for`

- ✅ **Programação Orientada a Objetos (POO)**
  - Classes e Objetos
  - Encapsulamento
  - Herança
  - Polimorfismo
  - Abstração

- ✅ **Coleções e Streams**
  - List, Set, Map
  - Lambda Expressions
  - Streams API

- ✅ **Exceções**
  - Tratamento de erros com `try/catch/finally`
  - Criação de exceções personalizadas

- ✅ **Java Avançado**
  - Generics
  - Interfaces Funcionais
  - Threads e Concorrência

- ✅ **Projetos Práticos**
  - Pequenos sistemas desenvolvidos ao longo do curso
  - Exercícios de fixação e desafios de código

---

## 🚀 Tecnologias Utilizadas

- **Java 17** (ou versão utilizada no curso)
- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Git & GitHub** para versionamento
- **Maven/Gradle** (quando aplicável)


# Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade; estes elementos precisam ser objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.
- O núcleo principal das coleções é formado pelas interfaces da figura abaixo; essas interfaces permitem manipular a coleção independentemente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

<p align="center">
<img src="./assets/image/collection-framework.png"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>


- Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
- Embora a interface Map não seja filha direta da interface Collection, ela também é considerada uma coleção devido à sua função.

<p align="center">
<img src="./assets/image/collection-framework-methods.png" alt="List interface hierarchy Java"><br>
<a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html">Method Sumary Collection Interface</a>
</p>


---

### Referências:

[1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

[2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

[3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

[4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

### Dúvidas e Suporte

Caso você tenha alguma dúvida, problema ou sugestão, fique à vontade para abrir uma issue no repositório. Espero conseguir te ajudar! (:
