## Objeto de acesso a dados (DAO)
DAO significa Data Access Object , que é comumente usado para interação com o banco de dados. Os DAOs existem para 
fornecer um meio de ler e gravar dados no banco de dados e devem expor essa funcionalidade por meio de uma interface 
pela qual o restante do aplicativo os acessará.

O suporte a Data Access Object (DAO) no Spring facilita o trabalho com tecnologias de acesso a dados, como JDBC, 
Hibernate, JPA ou JDO de maneira consistente.

/**
* 
* @param jdbcTemplate
* A classe JDBC Template executa consultas SQL, atualiza instruções e chamadas de procedimento armazenado, executa
* iteração sobre ResultSets e extração de valores de parâmetros retornados. Ele também captura exceções JDBC e as
* traduz para a hierarquia de exceção genérica e mais informativa definida no pacote org.springframework.dao.
* @param dataSource
* @param simpleJdbcInsert
* SimpleJdbcInsert é um objeto reutilizável multithread que fornece recursos de inserção fáceis para uma tabela.
* Ele fornece processamento de metadados para simplificar o código necessário para construir uma instrução de
* inserção básica. A inserção real está sendo tratada usando o JdbcTemplate do Spring
*/
* 


## Referencias:
https://www.tutorialspoint.com/springjdbc/springjdbc_create_query.htm