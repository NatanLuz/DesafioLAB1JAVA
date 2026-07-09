# Sistema de Gerenciamento de Lojas - ShoppingCenter (Java)

## 📖 Sobre o projeto

O **Sistema de Gerenciamento de Lojas - ShoppingCenter** é uma aplicação Java executada em console para representar e administrar lojas e produtos de um shopping center.

O projeto foi desenvolvido para aplicar conceitos fundamentais de Programação Orientada a Objetos e modelagem de sistemas. A solução organiza o domínio em classes, subclasses e associações, permitindo compreender na prática encapsulamento, herança, polimorfismo e sobrescrita de métodos.

Os dados são mantidos em arrays durante a execução. A aplicação não possui persistência e utiliza um menu interativo para cadastrar, consultar e manipular as informações.

### Modelagem

As classes principais representam os elementos compartilhados pelo domínio:

- `Loja`;
- `Produto`;
- `Endereco`;
- `Data`.

A classe `Loja` é especializada nas seguintes subclasses:

- `Cosmetico`;
- `Vestuario`;
- `Bijuteria`;
- `Alimentacao`;
- `Informatica`.

### Conceitos de POO

- **Encapsulamento:** atributos privados acessados por getters e setters;
- **herança:** especialização da classe `Loja`;
- **polimorfismo:** comportamento específico nas subclasses;
- **associação:** relacionamento entre loja, endereço, data e produtos;
- **sobrescrita:** redefinição de métodos como `toString()`;
- **organização em classes:** separação das responsabilidades do domínio.

## ✨ Funcionalidades

- Cadastro de lojas;
- cadastro de produtos;
- listagem das lojas;
- listagem dos produtos;
- inserção de produtos no estoque de uma loja;
- remoção de produtos;
- verificação de produtos vencidos por comparação de datas;
- contagem de lojas por categoria;
- identificação da loja de informática com o maior valor de seguro;
- gerenciamento pelo menu interativo no console.

### Regras do sistema

- Cada loja possui endereço e data de fundação associados;
- os produtos são gerenciados dentro das lojas;
- a validade é verificada por meio da comparação entre datas;
- a loja de informática com o maior seguro é identificada pela comparação dos valores;
- os dados permanecem em memória durante a execução.

## 🚀 Tecnologias

- **Java:** implementação da aplicação;
- **Programação Orientada a Objetos:** modelagem e organização do domínio;
- **Git:** controle de versão;
- **GitHub:** hospedagem do repositório.

## ⚙️ Como executar

### Pré-requisitos

- Java Development Kit instalado;
- Git;
- uma IDE Java compatível.

### Clonar o repositório

```bash
git clone https://github.com/NatanLuz/DesafioLAB1JAVA.git
cd DesafioLAB1JAVA
```

### Importar em uma IDE

Importe a pasta clonada como projeto Java em uma das seguintes IDEs:

- IntelliJ IDEA;
- Eclipse;
- NetBeans.

### Iniciar a aplicação

Localize e execute a classe:

```text
src/Principal.java
```

Após a inicialização, utilize o menu exibido no console para cadastrar lojas, gerenciar produtos e consultar as informações.

## 📂 Estrutura do projeto

O código-fonte fica no diretório `src/`, com as classes principais, as subclasses de loja e o ponto de entrada:

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

- `Loja.java`: classe base das lojas;
- `Produto.java`: representação dos produtos;
- `Endereco.java`: dados de endereço;
- `Data.java`: representação e comparação de datas;
- `subclasses/`: especializações de `Loja`;
- `Principal.java`: ponto de entrada e menu interativo.

## 🌐 Deploy

O projeto é uma aplicação Java para execução local e não possui deploy web. Pode ser executado em qualquer ambiente com um JDK compatível e os arquivos do projeto disponíveis.

Para distribuição futura, a aplicação poderá ser empacotada como um arquivo executável Java. Esse empacotamento ainda não faz parte da versão atual.

## 👤 Autor

**Natan Da Luz**

- LinkedIn: [linkedin.com/in/natandaluz](https://www.linkedin.com/in/natandaluz/)

- Portfólio: [portfolionatan.vercel.app](https://portfolionatan.vercel.app/)

- E-mail: [natandaluz01@gmail.com](mailto:natandaluz01@gmail.com)

## 📄 Licença

Este projeto está sem uma licença definida no momento.
