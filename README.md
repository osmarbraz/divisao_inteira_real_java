# Demonstração de Divisão Inteira e Divisão Real em Java

## Descrição

Este programa demonstra a diferença entre a divisão inteira e a divisão de ponto flutuante na linguagem Java, utilizando os tipos `int` e `double`.

O objetivo é mostrar como os tipos de dados envolvidos em uma operação aritmética influenciam o resultado e como o momento em que uma conversão de tipo é realizada pode alterar o comportamento do programa.

O exemplo utiliza a divisão de `7` por `2` para demonstrar que a parte decimal pode ser descartada quando a operação é realizada entre dois números inteiros.

## Objetivos

- Compreender a diferença entre divisão inteira e divisão real.
- Conhecer o comportamento do operador `/` em Java.
- Entender o conceito de conversão de tipos (*casting*).
- Demonstrar a diferença entre converter o resultado de uma operação e converter um dos operandos antes da operação.
- Identificar situações em que a divisão inteira pode produzir resultados diferentes dos esperados.

## Funcionamento do programa

O programa realiza quatro operações para comparar os resultados.

### 1. Divisão inteira

```java
int a = 7;
int b = 2;

System.out.println(a / b);
```

Como os dois operandos são do tipo `int`, Java realiza uma divisão inteira.

O resultado matemático de `7 / 2` é `3,5`, mas a divisão inteira descarta a parte fracionária. Por isso, o resultado é `3`.

### 2. Divisão real

```java
System.out.println(7.0 / 2);
```

Nesse caso, o literal `7.0` é do tipo `double`. O outro operando, `2`, é promovido a `double` para a operação.

A divisão é realizada em ponto flutuante, produzindo `3.5`.

### 3. Conversão depois da divisão

```java
System.out.println((double) (a / b));
```

Primeiro, Java calcula `a / b` como uma divisão inteira, obtendo `3`.

Depois, converte o resultado `3` para `double`, produzindo `3.0`.

A conversão não recupera a parte decimal que já foi descartada durante a divisão.

### 4. Conversão antes da divisão

```java
System.out.println(((double) a / b));
```

Nesse caso, a variável `a` é convertida para `double` antes da operação.

A divisão passa a ser realizada em ponto flutuante, produzindo `3.5`.

Essa comparação demonstra que o momento da conversão influencia o resultado.

## Código-fonte

O arquivo `Principal.java` contém a implementação completa do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

**1. Compile o programa:**

```bash
javac Principal.java
```

**2. Execute o programa:**

```bash
java Principal
```

## Saída esperada

```text
Divisao inteira: 3
Divisao real: 3.5
Conversao depois: 3.0
Conversao antes: 3.5
```

## Conceitos fundamentais

### Divisão inteira

Quando os dois operandos de uma divisão são inteiros, Java realiza uma divisão inteira. A parte fracionária do quociente é descartada, sem arredondamento.

Por exemplo:

```text
7 / 2 = 3
9 / 2 = 4
10 / 3 = 3
```

### Divisão de ponto flutuante

Quando pelo menos um dos operandos é do tipo `float` ou `double`, a operação é realizada em ponto flutuante, respeitando as regras de conversão numérica e a precisão do tipo utilizado.

Por exemplo:

```text
7.0 / 2 = 3.5
9.0 / 2 = 4.5
10.0 / 3 = 3.3333333333333335
```

Os resultados de ponto flutuante podem ser aproximações dos valores matemáticos exatos.

### Conversão de tipos (*casting*)

O *casting* permite converter um valor de um tipo para outro.

No exemplo, `(double) (a / b)` converte o resultado da divisão inteira para `double`, enquanto `(double) a / b` converte um dos operandos antes da divisão.

A diferença é fundamental: **converter o resultado depois da operação não desfaz os efeitos da divisão inteira**.

## Comparação dos resultados

| Expressão | Tipo da divisão | Resultado |
|---|---|---:|
| `a / b` | Inteira | `3` |
| `7.0 / 2` | Ponto flutuante | `3.5` |
| `(double) (a / b)` | Inteira, seguida de conversão | `3.0` |
| `(double) a / b` | Ponto flutuante | `3.5` |

## Conclusão

O programa demonstra que o resultado de uma operação aritmética em Java depende dos tipos de dados utilizados e da ordem em que as conversões são realizadas.

A divisão inteira descarta a parte fracionária do resultado. Já a divisão em ponto flutuante permite representar a parte decimal, embora esteja sujeita às limitações de precisão dos tipos `float` e `double`.

Compreender essa diferença ajuda a evitar erros em cálculos matemáticos e a escolher corretamente os tipos de dados em programas Java.