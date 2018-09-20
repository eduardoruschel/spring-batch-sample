create sequence SEQ_CLIENTE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
nocache
cycle;

create table CLIENTE(
Id Integer not null,
nome VARCHAR(100),
cpf VARCHAR(100),
rg VARCHAR(100),
datanascimento VARCHAR(100),
sexo VARCHAR(10),
CONSTRAINT clientePk PRIMARY KEY (Id)
)