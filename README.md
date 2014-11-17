# Contexto
------------------

O framework oferece uma classes e interfaces trabalhando juntas para prover a construção de uma sistema de eleições de cargos políticos ou administrativos. 

## Pontos fixos

#### Cadastrar Eleitores/Candidatos
	* O eleitor deve ter um nome, cpf, data de nascimento.
	* O candidato deve ter um nome, cpf, e uma chave que o represente como candidato (por exemplo, 13, 45, “BR”, “FR”, “EUA”).

#### Cadastrar Cargos
	* A eleição deve ter a definição dos cargos, os quais serão disputados pelos candidatos.

#### Votar no candidato 
	* Cada eleitor deve votar em seu candidado. (A funcionalidade de voto pode ser extesível, voto branco ou nulo, por exemplo).

#### Cadastrar Eleição
	* A eleição deve conter os cargos dentre os cadastrados para essa eleição.

## Ponto de extensão

####  Regras/condições da eleição para cada cargo.
	* O voto de cada eleitor terá um impacto diferente sobre o resultado da eleição.

#### Diferenciar eleitores
	*Cada eleitor tem um idenficador (além do CPF) que é importante para diferenciá-lo dentro de um certo contexto (por exemplo, em uma eleição para reitor de uma universidade, o identificador desse aluno para esse contexto é sua matrícula).
#### Diferenciar cargos
	* Os cargos variam para cada contexto de eleição, por exemplo: prefeito, presidente, reitor de uma universidade, representante estudantil, etc.

## Aplicações

### Eleição para cargos políticos
#### Exemplo
* **Cargos:** Prefeito
* **Eleitores:** cidadãos acima de 16 anos 
* **Regras:** O candidato é eleito com a maioridade dos votos
* **Fórmula** = Somatório de votos

### Eleição para cargos administrativos
#### Exemplo
* **Cargos:** Reitor
* **Eleitores:** Funcionários, professores e alunos. 
* **Regras:** O reitor é eleito com a maioridade dos votos. Professores e funcionários têm 5% a mais de peso nos votos.
* **Fórmula** = `0.35*votos_funcionarios + 0.35*votos_professores + 0.3*votos_alunos`

### Eleição para títulos
#### Exemplo  
*Cargo:** Melhor aluno. 
* **Eleitores:** professores e alunos. 
* **Regras:** o aluno só é eleito se a quantidade de votos for 10% superior ao segundo lugar. Professores têm 20% a mais de peso nos votos.
* **Fórmula** = `0.7*votos_professores + 0.3*votos_alunos`


