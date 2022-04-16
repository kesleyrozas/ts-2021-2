<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P2 - 12/04/2022</p>

Matrícula: 201804673

Nome: Kesley Rozas dos Santos

<font color="green">Nota 6,46</font>


1. Quanto ao Processo de Teste de Software, responda as duas questões seguintes:
   1. (**0,5 ponto**) Defina os seguintes conceitos Processo de Teste de Software, Projeto de Teste de Software e Plano de Teste de Sofware.

	Reposta:

	Processo de Teste de Software
		Podemos definir o processo de teste sendo como sendo um estrutura de atividades, responsabilidades e etapas no qual tem o objetivo a padronização dos trabalhos e da equipe a fim de obter organização durante o teste, para isso fazemos o processo do teste e podemos definir algumas parte como: Planejamento do teste, Modelagem, Execução, Análise dos resultados e encerramento do processo.

	Projeto de Teste de Software
		Podemos definir o projeto como sendo as fases do teste que tem como objetivo criar um teste para uma aplicação, as fases do projeto de teste de software definem: quais entregas serão realizadas, quais serviços técnicos, qual equipe vai realizar qual etapa, como serão verificadas e validadas os teste.

	Plano de Teste de Sofware
		Podemos definir o plano de teste como sendo o documento que e gerado no ínicio do planejamento do teste servindo como um mapa no qual vai conter os objetivos do teste, qual a meta a alcançar, os tipos de processos que vão ser realizados e vai conter modelagem detalhada do fluxo do trabalho durante o processo, como cronograma, alocação de recurso, marcos do projeto. <font color="red">Nota 0,5</font>

   2. (**0,5 ponto**) Descreva o relacionamento existente entre estes conceitos.

	Resposta: Para explicar o relacionamento podemos partir do exemplo da criação de um planejamento de teste de software em uma empresa, no caso temos que criar um plano de teste no qual será gerado um documento que vai conter modelagem do processo, cronograma etc, no meio desse planejamento vamos também fazer o plano do processo de teste no qual definiremos quais as fases do projeto de execução, de entrega, definir quais equipes irão fazer determiniado teste, aqui já podemos notar que neste plano existe um processo no qual deve ser seguido, primeiro o plano de teste seguido do projeto de teste que está dentro do plano de teste, ou seja estão todos relacionados no mesmo ambiente de aplicação. <font color="red">Nota 0,4</font>

2. (**1,0 pontos**) Descreva as vantagens para a equipe de desenvolvimento ao se adotar um processo de teste ágil.

	Resposta:

	Ao implementar o teste de software utilizando metodologias ageis a equipe de desenvolvimento também consegue trabalhar bem mais flexível, no caso temos mais o desenvolvedor mais próximo da equipe de teste isso faz com que as etapas do desenvolvimento finalizadas ela já são testadas e entregue, ou seja temos um software que e desenvolvido e testado ao mesmo tempo deixando tudo mais rápido, fazendo que tenhamos baixa criticidade, mudançãs mais frequentes que pode ser resolvidas mais fácieis, conseguimos trabalhar na qualidade do software e do teste visto que o teste pode sim enviar melhorias em implementações que estão de forma que custam mais recursos de máquina então o refatoramento do código fica mais fácil, isso evita que o sisteme vá para o cliente com errors que poderiam ser evitados no ínicio ou meio do projeto, então temos as vantagens lista:

	- As entregas são mais rápidas.
	- Métodos ágeis deixam o software mais flexível.
	- A boa qualidade do software.
	- Proximidade entre os stakeholders.

<font color="red">Nota 1,0</font>

3. (**1,0 ponto**) Cite pelo menos três características do Teste Exploratório.

	Resposta:
	Foi identificado 3 características do teste exploratório.
	1. Mitigar risco de incidentes que podem gerar impactos muito grandes.
	2. Documentação escrita durante o teste.
	3. Feedback visual das ferramentas. <font color="red">Nota 1,0</font>

4. Considere os arquivos .java (Banco.java, Agencia.java, Conta.java e BankValidator.java). Nos próprios arquivos .java estão definidas as regras para cadastramento de cada um deles (Banco, Agencia e Conta). Desta forma, pede-se:
   4.1. (**2.0 Pontos**) Definir os cenários de teste suficientes para testar o cadastro e movimentações financeiras envolvendo bancos, agências e contas, conforme especificado. Para cada cenário definir os critérios de teste adequados à definição dos seus casos de teste.

	Resposta:
Temos um cénario onde vamos criar um banco com contas e agencias:
Para criar o banco o número do banco deve ser > 0 e formado por 3 digitos, e o seu nome deve ser do tamanho entre 5 e 100 caracteres.
Para criar a conta o número da conta deve ser de 6 digitos, o tipo pode ser ou Corrente ou Poupança e o metodo para cheque especial deve ser aplicado somente para conta do tipo Corrente, e toda agencia tem um banco.
Não pode se sacar valores maiores que o saldo.
Toda transferencia só e realizada se existir saldo.
Toda conta tem o metodo de sacar, depositar e transferir.
Contas do tipo Poupanca tem os metodos creditarRendimentos e debitarJurosChequeEspecial.
Para criar uma agencia o número deve ter de 3 a 5 digitos, o nome deve ser do tamanho entre 5 e 100 caracteres, a cidade deve ser do tamanho entre 5 e 100 caracteres e toda conta tem uma agencia.

  <font color="red">Nota 0,5</font>

   4.2. (**2.0 Pontos**) Definir os casos de teste suficientes para a cobertura do teste de cada um dos cenários definidos. Documentar os casos de teste no seguinte padrão:

Agencia
|CT|Valores de Entrada|Resultado esperado|
|---|---|---|
|CT01|-12, Senador, Canedo, banco|Entrada Invalida|
|CT02|1254568, Senador, Canedo, banco|Entrada Invalida|
|CT03|122, Senador, Canedo, banco|Entrada Valida|
|CT04|122, Sen, Canedo, banco|Entrada Invalida|
|CT05|122, Senadorsodsaodisaodiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiioiiiiiiiiiiiiiiii, Canedo, banco|Entrada Invalida|
|CT06|122, Senador, Canedo, banco|Entrada Valida|
|CT07|122, Senador, Can, banco|Entrada Invalida|
|CT08|122, Senador, Canedoaasddddddddddddddddddddddddddddddddddddddddddddddddggggggggggggggggggggggggggggdddddddddddddddddddddddddddddddddddd, banco|Entrada Invalida|
|CT09|122, Senador, Canedo, banco|Entrada Valida|


Banco
|CT|Valores de Entrada|Resultado esperado|
|---|---|---|
|CT01|12, Inter|Entrada Invalida|
|CT02|-12, Inter|Entrada Invalida|
|CT03|544, Inter|Entrada Valida|
|CT04|544, Nu|Entrada Invalida|
|CT05|544, Banco interrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr|Entrada Invalida|
|CT06|544, Inter|Entrada Valida|

Conta
|CT|Valores de Entrada|Resultado esperado|
|---|---|---|
|CT01|125, Corrente, 544|Entrada Invalida|
|CT02|125546, Corrente, 544|Entrada Valida|
|CT03|125555555, Corrente, 544|Entrada Invalida|
|CT04|125546, CorrentePo, 544|Entrada Invalida|
|CT05|125546, Poupanca, 544|Entrada Valida|
|CT06|125546, Corrente, 544|Entrada Valida|

Movimentar Conta
|CT|Valores de Entrada|Resultado esperado|
|---|---|---|
|CT01|conta1, 100.00|Deposito Realizado|
|CT02|conta1, Corrente, 100.00|Saque Realizado|
|CT03|conta1, Corrente, 11000.00|Saldo Indisponível|
|CT04|conta1, Poupanca, 100.00|Rendimento Aplicado|
|CT05|conta1, Poupanca, -11000.00|Valor inválido|

  <font color="red">Nota 1,7</font>

   3. (**3.0 Pontos**) Implementar (na linguagem de programação java) as classes para o teste da criação dos objetos e das movimentações financeiras envolvendo bancos e agências e contas.

	Resposta: Segue as classes em anexo.

  <font color="red">Nota 1,36</font>

INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing.
3. Forma de Entrega: arquivo compactado contendo:
   1. Este arquivo md, respondido.
   2. Classes de teste para (BancoTest, AgenciaTest e ContaTest);
   3. O arquivo compactado deverá ter o seguinte nome prova_p2<mat>.zip, onde mat é o número da matrícula do aluno(a).
5. Data da Entrega: 12/04/2022, as 22hs.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
7. Obs: segue no mesmo pacote o arquivo "org.apache.commons.lang.StringUtils", que é uma dependência do projeto. É deve ser inserida no _classpath_ do projeto de implementação da questão 4, caso não esteja utilizando o _maven_.
