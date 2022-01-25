## Tarefa 004 - 19/01/2022 - Análise do Valor Limte - Definição de casos de testes.

**DEFINIÇÃO**:
1. Considerando o conjunto de classes de equivalência que você definiu em atendimento à **Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência**.
2. Considerando as explicações a respeito do critério de teste funcional **Análise do Valor Limite** disponíveis em:
   1. [Análise do Valor Limite 1](https://viniciuspessoni.com/2020/03/15/analise-do-valor-limite/).
   2. [Análise do Valor Limite 2](https://www.youtube.com/watch?v=EQU5ODvmwzs).
   3. [Análise do Valor Limite 3](https://www.youtube.com/watch?v=jX7uyaTAn-k).
3. Pede-se a definição do conjunto de casos de testes necessários para o teste do mesmo cenário descrito na tarefa 003. Estes casos de teste deverão ser criadas a partir das diretrizes definidas pelo critério funcional "Análise do Valor Limte".
 
Obs: Carga horária de 64H

|id|descrição|V/I|
|--|--|--|
|CE01|Reprovar alunos que tiverem a quantidade de faltas*  > (25% * cargaHoraria)|I|
|CE02|Reprovar por falta se nota1 >= 6.0 e nota2 >= 6.0 e a quantidade de faltas > (25% * cargaHoraria)|I|
|CE03|Reprovar alunos que obter nota1 e nota2 <  3.0 |I|
|CE04|Recuperacao para alunos que obter nota1 e nota2 for >= 3.0 e < 6.0|V|
|CE05|Aprovado alunos que obter nota1 >= 6.0 e nota2  >= 6.0|V|

4. O Conjunto de casos de testes derivado deve seguir o seguinte padrão:

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|
|CT01|6.0, 7.0, 15|Aprovado|CE05|
|CT02|7.0, 8.0, 16|Reprovado por Falta|CE02|
|CT03|8.0, 9.0, 17|Reprovado por Falta|CE01|
|CT04|3.0, 6.0, 15|Recuperaçao|CE04|
|CT05|4.0, 7.0, 16|Reprovado|CE01|
|CT06|5.0, 8.0, 17|Reprovado|CE01|
|CT07|5.0, 5.0, 17|Reprovado|CE01|
|CT08|6.0, 6.0, 16|Reprovado por Falta|CE02|
|CT09|7.0, 7.0, 15|Aprovado|CE05|
|CT010|2.0, 2.0, 17|Reprovado|CE03|
|CT011|3.0, 3.0, 16|Reprovado|CE01|
|CT012|4.0, 4.0, 15|Recuperação|CE04|
|CT013|2.0, 5.0, 17|Reprovado|CE01|
|CT014|3.0, 6.0, 15|Recuperaçao|CE04|
|CT015|4.0, 7.0, 16|Reprovado|CE01|
|CT016|5.0, 6.0, 17|Reprovado|CE01|
|CT017|6.0, 7.0, 16|Reprovado por Falta|CE02|
|CT018|7.0, 8.0, 15|Aprovado|CE05|
|CT019|4.0, 7.0, 17|Reprovado|CE01|
|CT020|5.0, 8.0, 16|Reprovado|CE01|
|CT021|9.0, 10, 15|Aprovado|CE05|


Onde:
**CT** = Caso de Teste, seguido de um valor sequencial;
**Valor de entrada** é o valor informado para a variável;
**Resultado esperado** é o resultado que se espera da execução da função;
**Classe de Equivalência** é a identificação de qual classe de equivalência está sendo exercitada pelo caso de teste.

INSTRUÇÕES:
1. Tipo: Esta tarefa é individual;
2. Como responder: Pode-se editar este arquivo, complementando as tabelas de definições de classes de equivalência e dos casos de teste.
3. Local de Entrega: A entrega deverá seu repositório pessoal, utilizado para a manutenção dos artefatos de trabalho da disciplina (ts-2021-2);
4. Data da Entrega: Esta tarefa deve estar disponível para avaliação até o dia 24/01/2022 às 23h59min.
5. Esta tarefa valerá nota e presença para aula assíncrona do dia 18/01/2022.
6. Critério de Aceitação: tarefa entregue conforme especificado e na data definida.
7. Caso necessite de suporte, pode encaminhar mensagem para o professor.
