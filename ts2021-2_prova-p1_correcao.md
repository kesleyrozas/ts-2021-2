<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P1 - 16/02/2022</p>

Matrícula: 201804673
Nome: Kesley Rozas dos santos

<p><font color=green>Nota: 8,5.</font></p>

1. Quanto ao objetivo do Teste de Software, responda as duas questões seguintes:
   1. (**0,5 ponto**) Qual o objetivo primário da atividade de teste de software?

	R: O objetivo do teste de software <font color=red>e</font> executar um software, funcionalidade em condições controladas informando dados de entrada comparando os dados com os resultados esperados, esperando detectar a presença de <font color="red">erros</font> na funcionalidade testada, ou seja o objetivo <font color=red>e</font> determinar situações com entradas no quais o software falhe, para isso temos diversas técnicas que podem ser implementadas como teste funcional, teste estrutural e etc. <font color=orange>Parcialmente correto. Nota 0,4.</font>

   2. (**0,5 ponto**) O que acontece, quando não se atinge este objetivo primário?
	R: Quando o software ou a funcionalidade testada não atinge o objetivo primário, podemos afirmar que a funcionalidade foi implementada conforme a especificação <font color="red">no</font> qual não apresenta erros ou falhas e as entradas possíveis sempre vai gerar um resultado esperado. <font color=green>Certo.</font>

2. (**1,0 ponto**) Explique o que é o teste exaustivo e porque sua execução não é possível.
	R: Teste exaustivo <font color=red>e</font> o ato de testar todas as possibilidades possíveis de entrada, porém é impossível pois seria extremamente custoso cobrir os cénarios possíveis de um software, por exemplo uma tela que tem 5 campos com 4 possíveis valores de entrada cada, isso levaria mais de 50 cenários de teste para afirmar que foram <font color=red>cobridos</font> todos os tipos de teste dentro dessa tela, porém se pensarmos e um sistema com 20 telas isso levaria muito tempo para concluir, por isso existem técnicas para focar apensa nos testes pontencialmente mais significativos. <font color=green>Certo.</font>

3. (**1,0 ponto**) Cite pelo menos duas limitações da Técnica de Teste Funcional e duas da Técnica de Teste Estrutural.
	R: Teste Funcional
		1- Usando partição em classe de equivalencia e análise de valores limite, não levam em conta combinações de valores difícil <font color=red>testarsituações</font> em que diferentes combinações levam a <font color=red>diferentessaídas</font> do sistema
		2- Usando a partição por categorias e Árvore de classificação, Partem de especificações informais  não levam em conta modelos de especificação.
	   Teste Estrutural
		1- O número de caminhos pode ser muito grande ou até infinito.
		2- Alguns caminhos presentes na especificação pode ser esquecidos e não serem implementados gerando uma limitação no teste estrutural.
<font color=orange>Parcialmente correto. Nota 0,7.</font>
4. (**1,0 ponto**) Descreva pelo menos um dos quatro níveis de teste constantes da literatura especializada.
	R: Teste de Unidade -  Neste teste de unidade <font color=red>e</font> o momento que é verificado <font color=red>um parte</font> especifica ou menor do software, podendo ser um método, função, classe etc, testando entrada e saída de um sistema individualmente, o objetivo é isolar cada parte do sistema para <font color=red>gantir</font> que elas estejam funcionando conforme especificado. <font color=green>Certo.</font>

5. (**1.0 ponto**)Descreva qual o propósito do critério de teste funcional Particionamento por Classes de Equivlência.
	R:  O teste de particionamento de equivalência ou classes de equivalência, tem o objetivo de dividir os dados que representam as entradas no software a ser testado em partições ou classes de equivalência. Haverá uma partição para os valores que são considerados válidos e outra para os valores inválidos, ou seja atráves de um domínio de entrada devemos dividir essas classes para cobrir casos válidos e casos inválidos, por exemplo um condição onde a entrada de um teste deve ser somente positivo,  usando classe de equivalência devemos dividir entre números positivos, números menores ou igual a zero, com isso e possível ter a noção da cobertura dos testes a partir dos requisitos e especificações.
<font color=orange>Parcialmente correto. Nota 0,7.</font>
6. (**1.00 ponto**) Existe algum tipo de hierarquia em relação aos critérios de teste estrutural, todos os nós, todos os arcos e todos os caminhos? Se sim, explique-a, considerando a perspectiva dos níveis de cobertura desejados.
	R: Sim de acordo com o Copeland existem 8 níveis, quanto maior o nível maior o rigor do critério, seguindo temos a ordem hierarquia:

	1-critério todos os nós Nível 1: 100% cobertura de comandos - nível onde tem os requisitos mínimo de teste
	2-critério todos os arcos Nível 2: 100% cobertura de decisão - objetivo e fazer cada comando de decisão assumir os valores verdadeiro ou falso.
	3-critério todos os caminhos Nível 7: 100% cobertura de caminhos - objetivo cobrir todos os caminhos possíveis que podem ser seguidos.

<font color=green>Certo.</font>

7. Considere a especificação, a seguir, de um hipotético programa que objtiva a classificação de um triângulo, a partir dos valores informados para os seus três lados.

   a) Dado um triângulo cujos segmentos medem A, B e C, que são números inteiros positivos na faixa de 0 a 100. Esse triângulo somente existirá se: (A + B < C) ou (A + C < B) ou (B + C < A).
   b) Quanto às medidas dos seus lados o triângulo, poderá ser classicado em:
         • Isósceles = quando possui dois lados com a mesma medida;
         • Escaleno = quando todos os seus lados têm medidas diferentes;
         • Equilátero = quando todos os lados tem a mesma medida;
- Foi desconsiderado o restante para baixo.
         • Acutângulo = quando o quadrado de um dos seus lados é menor que a soma do quadrado dois outros dois. (A<sup>2</sup> < B<sup>2</sup> + C<sup>2</sup>).
         • Retângulo: quando o quadrado de um dos seus lados é igual à soma do quadrado dois outros dois. (A<sup>2</sup> = B<sup>2</sup> + C<sup>2</sup>).
         • Obtusângulo: quando o quadrado de um dos seus lados é maior que a soma do quadrado dois outros dois. A<sup>2</sup> > B<sup>2</sup> + C<sup>2</sup>.

7.1 (**2.0 pontos**) Definir uma tabela de decisão para o teste tanto da existência do triângulo, quanto para a definição do seu tipo. Consulte exemplo de tabela de decisão na tarefa 005.

<div align=center>
  <img src="tabela_descisao.png">
</div>

<font color=green>Certo.</font>

7.2 (**2.0 pontos**) Criar os conjunto de casos de teste necessários para a cobertura das combinações constantes da tabela de decisão, seguindo o seguinte padrão:

A) Partindo da

|CT|Lado A|Lado B|Lado C|Resultado|
|---|---|---|---|---|
|CT01|20|10|14|Triangulo|
|CT02|90|90|75|Isósceles|
|CT03|10|15|25|Escaleno|
|CT04|0|0|0|Não e triangulo|
|CT05|50|50|50|Equilátero|

<font color=orange>Parcialmente correto. O CT01 não é necessário e o CT03 falhou. Nota 1,2.</font>

INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing
3. Forma de Entrega: Entregar este arquivo, editado com suas respostas, no formato .md, nominado da seguinte forma: ts2021-2_prova-p1_mat.md, onde mat deverá ser substituído pelo número da sua matrícula.
4. **Entrega diferente da especificada não será avaliada.**
5. Data da Entrega: 22/02/2022, as 23h59min.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
