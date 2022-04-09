## Tarefa 009 - 15/03/2023 - Teste Exploratório (II)

1. O Programa historico_academico (arquivo historico_academico.zip), possui a seguinte documentação:
2. Classes:
~~~java
   1. Funcionario //classe definida para a manutenção dos dados de funcionário. Esta classe possui os seguintes atributos e métodos:
      1. private String nome;//O nome do animal deve possuir somente letras e ter o tamanho >= 5 e <= 100;
      2. private Integer codigoFuncional;//deve possuir quatro dígitos inteiros positivos;
      3. private Double rendaBasica;//Este atributo receberá o valor de R$ 1000.00
      4. private String escolaridade// deve possuir um dos seguintes valores {nenhum, basico, medio, graduacao}.
      5. private String cargo;//conter um dos valores: {vendedor, supervisor, gerente}.
      6. private Double comissao;//(gerente R$ 1500,00; supervisor = R$ 600,00 e vendedor = 250,00)
      7. private rendaTotal.
      8. public Funcionario(String nome, Integer codigoFuncional,String escolaridade,String cargo, Double comissao)//construtor parametrizado, da classe;
      9. public void atualizaRendaTotal()//método definido para atualizar a renda total, a partir da escolaridade do funcionário, conforme a seguir:
      //ensino básico = 10% de incremento na renda básica;
      //ensino médio = 10% de incremento na renda básica;
      //graduação = 100% de incremento na renda básica.
      10. public void atualizaComissoes();//Método definido para atualizar a renda total do funcionário, a partir da comissão paga pelo seu cargo. sendo:
      //gerente R$ 1500,00;
      //supervisor = R$ 600,00 e
      //vendedor = 250,00
      11. private boolean validaNome(String nome);//Método definido para validar o nome;
      12. private boolean validaCodigoFuncional(Integer codigoFuncional);//Método definido para validar o código funcional;
      13. private boolean validaEscolaridade(String escolaridade);//Método definido para validar a escolaridade do funcionário;
      14. private boolean validaCargo(String cargo);//Método definido para validar o cargo do funcionário.
      15. public String toString();//Método definido para imprimir na tela os dados do funcionario.
  2. Empresa. //Classe definida para manter 10 instâncias de Funcionário. Esta classe possui os seguintes atributos e métodos:
     1. private Funcionario[] funcionarios;//Vetor de funcionários, com 10 posiçoes dos quais: 70% são vendedores; 20% são supervisores e 10% gerentes;
     2. private Double totalRendaEnsinoBasico;//Atributo definido para totalizar os valores pagos aos funcionários com ensino básico;
     3. private Double totalRendaEnsinoMedio;//Atributo definido para totalizar os valores pagos aos funcionários com ensino médio;
     4. private Double totalRendaGraduacao;//Atributo definido para totalizar os valores pagos aos funcionários graduados;
     5. public void atualizaRemuneracao()//Método definido para invocar o método atualizaRendaTotal() para cada um dos funcionários constantes do vetor;
     6. public void atualizaAtualizaComissoes()// //Método definido para invocar o método atualizaComissoes() para cada um dos funcionários constantes do vetor;
     7. public void totalizaRendaPorEscolaridade()//Método definido para totalizar os pagamentos a todos os funcionários de acordo com seu nível de escolaridade;


~~~

3. Este trabalho consiste em duas etapas:
   1. Na primeira aula (sala) definir os cenários de teste e os casos de teste para a implementação destes cenários;
   2. A segunda aula (laboratório) implementar os casos de teste definidos na primeira etapa.

Implementações realizadas no git, arquivos são Empresa.java, Funcionario.java, Main.java e ValidaFuncionario.java 


INSTRUÇÕES:
1. Tipo: Individual ou em Dupla;
2. Local de Entrega: Plataforma Turing. Entregar somente os arquivos (.java) das classes de teste.
3. Data da Entrega: 15/03/2022 às 22hs.
4. Critério de Aceitação: Arquivo entregue conforme especificado.
