## Tarefa 005 - 08/02/2022 - Grafo de Causa e Efeito / Tabela de Decisão.

1.Considere o seguinte cenário: Uma corretora de seguros concede desconto sobre o prêmio anual de seguro de automóvel, aos seus segurados conforme as regras a seguir:
|Sexo|Idade (anos)|Estado Civil|Desconto (%)|
|---|---|---|---|
|Masculino|< 25|Solteiro|0|
|Masculino|< 25|Casado|5|
|Masculino|> 25|Solteiro|10|
|Masculino|> 25|Casado|15|
|Feminino|< 25|Solteira|5|
|Feminino|< 25|Casada|10|
|Feminino|> 25|Solteira|15|
|Feminino|> 25|Casada|20|


2. Solicita-se:
   1. Geração do grafo de causa e efeito para representar este cenário.
      1. Anexar a este arquivo a imagem do grafo.

<!--![Figura 1 - Grafo-->
<div align="center">
  <img src="./imagens/grafo_causa_efeito.png">
  <figcaption>Figura 1 - Grafo</figcaption>
  </div>
<br>
   2. Geração da tabela de decisão para representar o cenário.
      1. Editar este arquivo e adicionar a tabela de decisão.

|Condições|Testes|Testes|Testes|Testes|Testes|Testes|Testes|
|---|---|---|---|---|---|---|---|---|
|Condições|Masculino|Masculino|Masculino|Masculino|Feminino|Feminino|Feminino|Feminino|
|Casado|Não|Sim|Não|Sim|Não|Sim|Não|Sim|
|Solteiro|Sim|Não|Sim|Não|Sim|Não|Sim|Não|
|Idade|24|24|26|26|24|24|26|26|
|Desconto|0|5|10|15|5|10|15|20|

   3. Geração do conjunto de casos de teste suficientes para cobrir todos os cenários, constantes do grafo e da tabela de decisão.
      1. Editar este arquivo e adicionar a tabela com os casos de teste, conforme exemplos disponibilizados em tarefas anteriores.

|id|descrição|V/I|
|--|--|--|
|CE01|Desconto para sexo masculino e idade < 25 e solteiro|0|
|CE02|Desconto para sexo masculino e idade < 25 e casado|5|
|CE03|Desconto para sexo masculino e idade > 25 e solteiro|10|
|CE04|Desconto para sexo masculino e idade > 25 e casado|15|
|CE05|Desconto para sexo feminino e idade < 25 e solteiro|5|
|CE06|Desconto para sexo feminino e idade < 25 e casado|10|
|CE07|Desconto para sexo feminino e idade > 25 e solteiro|15|
|CE08|Desconto para sexo feminino e idade > 25 e casado|20|

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|masculino, 24, solteiro|R$ 2.000,00|CE01|
|CT02|masculino, 24, casado|R$ 1.900,00|CE02|
|CT03|masculino, 26, solteiro|R$ 1.800,00|CE03|
|CT04|masculino, 26, casado|R$ 1.700,00|CE04|
|CT05|feminino, 24, solteiro|R$ 1.900,00|CE05|
|CT06|feminino, 24, casado|R$ 1.800,00|CE06|
|CT07|feminino, 26, solteiro|R$ 1.700,00|CE07|
|CT08|feminino, 26, casado|R$ 1.600,00|CE08|

   4. Em relação aos casos de teste, considere o valor do seguro de R$ 2.000,00 (Dois mil reais). Desta forma, o valor esperado, do resultado do caso de teste, deve ser o valor líquido a ser pago. Ou seja, o prêmio deduzido do valor correspondente ao percentual do desconto obtido pelo cliente.
INSTRUÇÕES:
1. Tipo: Tarefa Individual;
2. Local de Entrega: Repositório pessoal, no github. O arquivo a ser entregue é este mesmo, editado com a inclusão dos dados solicitados.
3. Data da Entrega: 14/02/2022, as 23h59min.
4. Critério de Aceitação: Arquivo entregue com os dados solicitados.
