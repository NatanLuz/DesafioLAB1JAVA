# Sistema de Gerenciamento de Lojas - Shopping Center (Java)

Aplicacao em Java desenvolvida para gerenciamento de lojas em um shopping center, utilizando conceitos de Programacao Orientada a Objetos (POO), como heranca, polimorfismo e associacao entre classes.

---

## Problema Resolvido

A gestao manual de lojas e seus produtos em um shopping pode gerar desorganizacao, dificuldade de controle e baixa visibilidade sobre informacoes importantes, como estoque, categorias de lojas e dados operacionais.

Este projeto propoe uma solucao estruturada para organizar essas informacoes de forma programatica, aplicando conceitos fundamentais de modelagem orientada a objetos.

---

## Solucao Proposta

O sistema implementa um modelo orientado a objetos para representar lojas, produtos e suas relacoes, permitindo cadastro, manipulacao e consulta de dados por meio de um menu interativo em console.

A arquitetura utiliza:

- Classes base e especializadas
- Associacao entre entidades
- Heranca e polimorfismo para diferentes tipos de loja
- Estruturas de dados (arrays) para gerenciamento em memoria

---

## Funcionalidades

- Cadastro de lojas
- Cadastro de produtos
- Listagem de lojas e produtos
- Verificacao de produtos vencidos
- Contagem de lojas por tipo
- Identificacao da loja de informatica com maior valor de seguro
- Insercao e remocao de produtos no estoque

---

## Modelagem do Sistema

### Classes principais

- `Loja`
- `Produto`
- `Endereco`
- `Data`

### Subclasses de Loja

- `Cosmetico`
- `Vestuario`
- `Bijuteria`
- `Alimentacao`
- `Informatica`

---

## Conceitos de POO Aplicados

- **Encapsulamento**: uso de atributos privados com getters e setters
- **Heranca**: especializacao da classe `Loja`
- **Polimorfismo**: sobrescrita de metodos como `toString()`
- **Associacao**: relacionamento entre Loja, Endereco e Data

---

## Regras e Logica do Sistema

- Cada loja possui endereco e data de fundacao associados
- Produtos sao gerenciados dentro de cada loja
- Verificacao de validade e feita com base em comparacao de datas
- A loja de informatica com maior seguro e identificada por comparacao de valores
- O sistema opera com arrays para controle de dados em memoria

---

## Estrutura do Projeto

```text
.
├── src/
│   ├── Loja.java
│   ├── Produto.java
│   ├── Endereco.java
│   ├── Data.java
│   ├── subclasses/
│   └── Principal.java
```

---

## Tecnologias Utilizadas

- **Java**: linguagem principal
- **POO (Programacao Orientada a Objetos)**: base do sistema
- **Git/GitHub**: versionamento

---

## Como Executar

### 1) Clonar o repositorio

```bash
git clone https://github.com/NatanLuz/DesafioLAB1JAVA.git
cd DesafioLAB1JAVA
```

### 2) Importar na IDE

- Eclipse
- IntelliJ IDEA
- NetBeans

### 3) Compilar e executar

- Executar a classe `Principal.java`
- Utilizar o menu interativo no console para:
  - Cadastrar lojas
  - Gerenciar produtos
  - Visualizar relatorios

---

## Possiveis Melhorias

- Substituir arrays por estruturas dinamicas (`ArrayList`)
- Persistencia de dados com banco de dados
- Interface grafica (JavaFX ou Swing)
- API para integracao externa
- Validacoes mais robustas de entrada

---

## Autor

Natan Da Luz

Desenvolvedor Backend (PHP | Python | Java)

LinkedIn:

https://www.linkedin.com/in/natan-da-luz-3156582a2/
