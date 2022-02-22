## Tarefa 006 - 15/02/2022 - Grafo de Fluxo de Controle

1. Considere o fragmento de código implementado na Linguagem de Programação Java.

~~~java

public class Avaliacao {


1    public String avalia(double nota1, double nota2, int faltas, int cargaHoraria) throws ValoresInvalidosException{
2        String result;
3        double percentualFaltas = (faltas*100/cargaHoraria);
4        double media = (nota1 + nota2)/2;
5        if((nota1 < 0.0 || nota1 > 10) || (nota2 < 0.0 || nota2 > 10) || (faltas < 0 || faltas > cargaHoraria) || cargaHoraria < 0){
6            throw new ValoresInvalidosException();//result = "Valores Inválidos.";
7        }else if(percentualFaltas > 25.0){
8            result = "Reprovado por Falta.";
9        }else if(media < 3.0){
10            result = "Reprovado por Média.";
11        }else if(media >= 3.0 && media < 6.0){
12            result = "Prova Extra.";
13        }else{
14            result = "Aprovado.";
15        }
16        return result;
17    }
18 }
~~~

2. Pede-se:
   1. Desenhar o **Grafo do Fluxo de Controle**. Pode-se anexar a imagem, aqui neste arquivo.
<!--![Figura 1 - Grafo-->
<div align="center">
  <img src="./images/grafo.png">
  <figcaption>Figura 1 - Grafo</figcaption>
  </div>
<br>
   2. Calcular a complexidade ciclomática do código. Exemplo de coo calcular pode ser obtido no [link](https://www.treinaweb.com.br/blog/complexidade-ciclomatica-analise-estatica-e-refatoracao)

	V(G) = E – N + 2 - onde E é o número de arestas (setas) e N é o número de nós do grafo G.

	R: V(G) = E – N + 2 = 15 - 12 nós + 2 = 1

	Portanto a complexidade entra como baixo risco
	1-10	Método simples. Baixo risco.

   3. Definir quantos caminhos de execução existem;

	R: Existem 5 caminhos no qual podem ser percorridos.

   4. Definir os casos de teste necessários para se percorrer todos estes caminhos. Cada caso de teste deve ter o valor correspondente para cada variável de entrada e o valor esperado.

|CT|Valor de Entrada|Resultado Esperado|
|--|--|--|
|CT01|0.0, 11.0, 15, 60|Valores Inválidos|
|CT02|6.0, 7.0, 18, 60|Reprovado por Falta|
|CT03|2.0, 3.0, 10, 60|Reprovado por Média|
|CT04|4.0, 6.0, 10, 60|Prova Extra|
|CT05|6.0, 7.0, 8, 60|Aprovado|


INSTRUÇÕES:
1. Tipo: Tarefa Individual;
2. Local de Entrega: _branch main/master_ do repositório pessoal do aluno, criado para a manutenção do controle de versão dos artefatos da disciplina. O arquivo a ser entregue, pode ser este mesmo, editado com as respostas das questões solicitadas.
3. Data da Entrega: 21/02/2021, as 23h59min.
4. Critério de Aceitação: arquivo entregue, conforme solicitado.
