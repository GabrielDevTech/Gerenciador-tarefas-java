Gerenciador de Tarefas Simples

![Java Logo](https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg)

Este projeto é um **Gerenciador de Tarefas Simples** desenvolvido em Java, com o objetivo de organizar tarefas e demonstrar habilidades em programação orientada a objetos, concorrência e boas práticas de desenvolvimento. Ele foi pensado para ser funcional, modular e extensível, oferecendo uma base sólida para o gerenciamento de tarefas via console.

## Funcionalidades

- **CRUD de Tarefas**: Criação, leitura, atualização e exclusão de tarefas.
- **Salvamento Automático**: Utilização de threads para salvar as tarefas periodicamente em um arquivo.
- **Persistência de Dados**: Capacidade de salvar e carregar tarefas de arquivos, garantindo a continuidade do uso.
- **Categorias de Tarefas**: Suporte para diferentes tipos de tarefas, com possibilidade de extensão por meio de herança.
- **Enumerações**: Uso de enums para categorizar status (ex.: PENDING, COMPLETED) e níveis de prioridade (HIGH, MEDIUM, LOW).
- **Data e Hora**: Registro de criação e atualização das tarefas utilizando `LocalDateTime`.

## Conceitos e Tecnologias Abordados

- **Programação Orientada a Objetos (POO)**
  - Criação de classes com atributos encapsulados.
  - Herança e polimorfismo para estruturar diferentes tipos de tarefas.
  - Sobrescrita de métodos (ex.: `toString`) para personalizar comportamentos.
  
- **Concorrência e Threads**
  - Implementação de uma thread dedicada (`AutoSaveThread`) para executar salvamentos automáticos em segundo plano.
  - Uso de `Thread.sleep()` e controle de execução com flags.
  
- **Manipulação de Dados**
  - Armazenamento de tarefas em uma `ArrayList` para fácil manipulação.
  - Persistência utilizando APIs de entrada e saída (`BufferedWriter` e `FileWriter`).
  
- **Enums para Organização**
  - Enumeração para status das tarefas.
  - Enumeração para níveis de prioridade.
  
- **Gerenciamento de Arquivos**
  - Criação e manipulação de arquivos para salvar e carregar tarefas.
  - Uso de try-with-resources para garantir o fechamento adequado dos recursos.

## Estrutura do Projeto

```
src/
├── Main.java              // Ponto de entrada do programa
├── Task.java              // Classe base para representação de tarefas
├── WorkTask.java          // Classe derivada (opcional)
├── TaskManager.java       // Classe para operações de tarefas (CRUD)
├── AutoSaveThread.java    // Classe para salvamento automático
├── enums/                 // Pacote para enums
│   ├── TaskStatus.java    // Enum de status das tarefas
│   └── PriorityLevel.java // Enum de níveis de prioridade
data/
└── tasks.txt              // Arquivo para persistência das tarefas
```

## Como Rodar o Projeto

1. **Clone este repositório:**

   git clone https://github.com/seu-usuario/gerenciador-de-tarefas.git

2. **Compile e execute o programa:**

   javac src/*.java
   java -cp src Main

3. **Siga as instruções no console** para interagir com o gerenciador de tarefas.

## Visão Profissional

Este projeto foi desenvolvido para demonstrar minhas habilidades técnicas em Java e em desenvolvimento de sistemas robustos. Ele explora conceitos fundamentais e avançados, refletindo a capacidade de construir soluções organizadas, eficientes e escaláveis. Estou sempre em busca de aplicar esses conhecimentos em desafios reais e contribuir para o sucesso das equipes nas quais atuo.

---

Sinta-se à vontade para contribuir ou sugerir melhorias neste projeto!
