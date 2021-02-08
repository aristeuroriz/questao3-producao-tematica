# Produção Temática

[ Instruções de execução ](#Executando)
[ Construção do banco de dados ](#Banco de dados)
[Resumo dos arquivos do projeto](#Summary)

## Executando

- Adicionar o driver à biblioteca do projeto
	* [Realizar download do driver PostgreSQL](https://jdbc.postgresql.org/download.html)
- Executar a criação do banco de dados
	* [ Construção do banco de dados ](#criando)
- Executar a classe principal ProducaoTematica.java

### Banco de dados
#### Tabelas
``
~~~sql
DROP TABLE IF EXISTS PRODUTO, ITEM_PRODUTO;


CREATE TABLE PRODUTO (
 CODIGOPRODUTO SERIAL CONSTRAINT PK_COD_PROD PRIMARY KEY,
 NOME varchar(50),
 DESCRICAO varchar(255),
 CATEGORIA varchar(50),
 ATRIBUTO1 varchar(50),
 ATRIBUTO2 varchar(50),
 ATRIBUTO3 varchar(50),
 ATRIBUTO4 varchar(50)
);

CREATE TABLE ITEM_PRODUTO (
 CODIGOPRODUTO SERIAL NOT NULL,
 CODIGOITEM SERIAL CONSTRAINT PK_COD_ITEM_PROD PRIMARY KEY,
 NOME varchar(50),
 DESCRICAO varchar(255),
 CATEGORIA varchar(50),
 ATRIBUTO1 varchar(50),
 ATRIBUTO2 varchar(50),
 ATRIBUTO3 varchar(50),
 ATRIBUTO4 varchar(50),
 FOREIGN KEY (CODIGOPRODUTO) REFERENCES PRODUTO (CODIGOPRODUTO) ON DELETE CASCADE
);
~~~
``
#### Populando as tabelas
``
~~~sql
INSERT INTO PRODUTO (nome, descricao, categoria, atributo1, atributo2, atributo3, atributo4) 
VALUES ('produto1', 'descrição 1', 'test', 'test', 'test', 'test', 'test');

INSERT INTO PRODUTO (nome, descricao, categoria, atributo1, atributo2, atributo3, atributo4) 
VALUES ('produto2', 'descrição 2', 'test', 'test', 'test', 'test', 'test');

INSERT INTO ITEM_PRODUTO (CODIGOPRODUTO, nome, descricao, categoria, atributo1, atributo2, atributo3, atributo4) 
VALUES (1, 'item 1', 'descrição item 1', 'test', 'test', 'test', 'test', 'test');

INSERT INTO ITEM_PRODUTO (CODIGOPRODUTO, nome, descricao, categoria, atributo1, atributo2, atributo3, atributo4) 
VALUES (1, 'item 2', 'descrição item 2', 'test', 'test', 'test', 'test', 'test');

INSERT INTO ITEM_PRODUTO (CODIGOPRODUTO, nome, descricao, categoria, atributo1, atributo2, atributo3, atributo4) 
VALUES (2, 'item 3', 'descrição item 3', 'test', 'test', 'test', 'test', 'test');
~~~
``


## Summary
* Gerado com extensão VSCodeCounter

Date : 2021-02-08 12:25:47

Directory \questao-3-pt-aristeu\src

Total : 6 files,  172 codes, 85 comments, 49 blanks, all 306 lines

###  Languages
| language | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| Java | 6 | 172 | 85 | 49 | 306 |

### Directories
| path | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| . | 6 | 172 | 85 | 49 | 306 |
| app | 5 | 155 | 70 | 44 | 269 |
| app\dao | 4 | 135 | 61 | 38 | 234 |
| db | 1 | 17 | 15 | 5 | 37 |