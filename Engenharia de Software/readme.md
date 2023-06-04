1 - O que é Engenharia de Software?
Engenharia de software é voltada a manutenção, desenvolvimento e criação do programa, como aplicação de tecnologias e ferramentas de organização e gerenciamento.
A programação é um dos requisitos fundamentais dessa estrutura.

2 - O que são requisitos?
Requisitos são atributos definidos de uma aplicação requisitada pelo cliente.

2.1 - Funcionais:
Exemplos: Cadastro de usuario, login, emissão de relatórios, controle de vendas.

2.2 - Não funcionais:
Exemplos: Segurança, Escalabilidade, Desempenho e Usuablidade.

2.3 - Exemplos de Trade-offs em requisitos não funcionais:

Exemplo 1: O cliente precisa escolher se o usuario terá a possibilidade de receber um código de segurança via SMS e/ou e-mail para ter acesso em um aplicativo. Ao oferecer a opção de receber um código de segurança tanto por SMS quanto por e-mail, o usuário pode acabar recebendo duas mensagens diferentes para autenticação, o que pode ser confuso e inconveniente.

Além disso, ao oferecer múltiplas opções de entrega de código de segurança, há um aumento no tempo e nos recursos necessários para implementar e manter essa funcionalidade. Será necessário desenvolver e manter a lógica para enviar o código por SMS e e-mail, bem como lidar com casos em que o usuário pode solicitar alterações nas preferências de entrega.

Exemplo 2: Uma empresa possui um sistema que gerencia seus atendimentos precisa decidir se irá gerar relatórios de produtividade semanais ou diarios para avaliação de seus funcionarios. A parte negativa desse trade-off envolve a sobrecarga administrativa, o estresse adicional para os funcionários e a possível perda de detalhamento ao optar por relatórios menos frequentes. A decisão deve ser baseada nas necessidades da empresa e nos objetivos de avaliação de desempenho dos funcionários.
