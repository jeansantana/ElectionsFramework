# Contexto
------------------

O framework oferece uma classes e interfaces trabalhando juntas para prover a construção de uma sistema de eleições de cargos políticos ou administrativos. 

## Pontos fixos

#### Cadastrar Eleitores/Candidatos
	..1. O eleitor deve ter um nome, cpf, data de nascimento.
	..2. O candidato deve ter um nome, cpf, e uma chave que o represente como candidato (por exemplo, 13, 45, “BR”, “FR”, “EUA”).

#### Cadastrar Cargos
	..1. A eleição deve ter a definição dos cargos, os quais serão disputados pelos candidatos.

#### Votar no candidato 
	..1. Cada eleitor deve votar em seu candidado. (A funcionalidade de voto pode ser extesível, voto branco ou nulo, por exemplo).

#### Cadastrar Eleição
	..1. A eleição deve conter os cargos dentre os cadastrados para essa eleição.

## Ponto de extensão

####  Regras/condições da eleição para cada cargo.
	..1. O voto de cada eleitor terá um impacto diferente sobre o resultado da eleição.

#### Diferenciar eleitores
	..1.Cada eleitor tem um idenficador (além do CPF) que é importante para diferenciá-lo dentro de um certo contexto (por exemplo, em uma eleição para reitor de uma universidade, o identificador desse aluno para esse contexto é sua matrícula).
#### Diferenciar cargos
	..1. Os cargos variam para cada contexto de eleição, por exemplo: prefeito, presidente, reitor de uma universidade, representante estudantil, etc.

## Aplicações

### Eleição para cargos políticos
#### Exemplo
..1. **Cargos:** Prefeito
..2. **Eleitores:** cidadãos acima de 16 anos 
..3. **Regras:** O candidato é eleito com a maioridade dos votos
..4. **Fórmula** = Somatório de votos

### Eleição para cargos administrativos
#### Exemplo
..1. **Cargos:** Reitor
..2. **Eleitores:** Funcionários, professores e alunos. 
..3. **Regras:** O reitor é eleito com a maioridade dos votos. Professores e funcionários têm 5% a mais de peso nos votos.
..4. **Fórmula** = `0.35*votos_funcionarios + 0.35*votos_professores + 0.3*votos_alunos`

### Eleição para títulos
#### Exemplo  
..1. **Cargo:** Melhor aluno. 
..2. **Eleitores:** professores e alunos. 
..3. **Regras:** o aluno só é eleito se a quantidade de votos for 10% superior ao segundo lugar. Professores têm 20% a mais de peso nos votos.
..4. **Fórmula** = `0.7*votos_professores + 0.3*votos_alunos`

