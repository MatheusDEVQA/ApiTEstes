#language: pt

  Funcionalidade: API de consulta de restrição no CPF

    Cenario: CPF sem retrição
      Dado que consulte um cpf com retrição
      Então é retornado o status code 200 e a mensagem ""