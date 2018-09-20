drop table CONTATOS_TMP;
drop table CONTATOS_CLIENTES;

create table CONTATOS_TMP(
Id Integer not null,
ddd VARCHAR(3),
telefone VARCHAR(20),
nomecontato VARCHAR(100),
CONSTRAINT CONTATOS_TMPPk PRIMARY KEY (Id)
);


create table CONTATOS_CLIENTES(
Id Integer not null,
ddd VARCHAR(3),
telefone VARCHAR(20),
nomecontato VARCHAR(100),
cliente Integer not null,
CONSTRAINT CLIENTES_FK FOREIGN KEY (cliente)  REFERENCES CLIENTE(id),
CONSTRAINT CONTATOS_CLI_Pk PRIMARY KEY (Id)
);


insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (1,'41','30252525','Contato 1');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (2,'41','30252526','Contato 2');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (3,'41','30252525','Contato 3');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (4,'41','30252526','Contato 4');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (5,'41','30252525','Contato 5');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (6,'41','30252526','Contato 6');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (7,'41','30252525','Contato 7');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (8,'41','30252526','Contato 8');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (9,'41','30252525','Contato 9');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (10,'41','30252526','Contato 10');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (11,'41','30252525','Contato 11');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (12,'41','30252526','Contato 12');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (13,'41','30252525','Contato 13');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (14,'41','30252526','Contato 14');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (15,'41','30252525','Contato 15');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (16,'41','30252526','Contato 16');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (17,'41','30252525','Contato 17');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (18,'41','30252526','Contato 18');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (19,'41','30252525','Contato 19');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (20,'41','30252526','Contato 20');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (21,'41','30252525','Contato 21');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (22,'41','30252526','Contato 22');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (23,'41','30252525','Contato 23');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (24,'41','30252526','Contato 24');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (25,'41','30252525','Contato 25');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (26,'41','30252526','Contato 26');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (27,'41','30252525','Contato 27');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (28,'41','30252526','Contato 28');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (29,'41','30252525','Contato 29');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (30,'41','30252526','Contato 30');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (31,'41','30252525','Contato 31');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (32,'41','30252526','Contato 32');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (33,'41','30252525','Contato 33');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (34,'41','30252526','Contato 34');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (35,'41','30252525','Contato 35');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (36,'41','30252526','Contato 36');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (37,'41','30252525','Contato 37');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (38,'41','30252526','Contato 38');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (39,'41','30252525','Contato 39');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (40,'41','30252526','Contato 40');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (41,'41','30252525','Contato 41');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (42,'41','30252526','Contato 42');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (43,'41','30252525','Contato 43');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (44,'41','30252526','Contato 44');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (45,'41','30252525','Contato 45');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (46,'41','30252526','Contato 46');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (47,'41','30252525','Contato 47');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (48,'41','30252526','Contato 48');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (49,'41','30252525','Contato 49');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (50,'41','30252526','Contato 50');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (51,'41','30252525','Contato 51');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (52,'41','30252526','Contato 52');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (53,'41','30252525','Contato 53');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (54,'41','30252526','Contato 54');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (55,'41','30252525','Contato 55');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (56,'41','30252526','Contato 56');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (57,'41','30252525','Contato 57');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (58,'41','30252526','Contato 58');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (59,'41','30252525','Contato 59');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (60,'41','30252526','Contato 60');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (61,'41','30252525','Contato 61');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (62,'41','30252526','Contato 62');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (63,'41','30252525','Contato 63');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (64,'41','30252526','Contato 64');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (65,'41','30252525','Contato 65');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (66,'41','30252526','Contato 66');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (67,'41','30252525','Contato 67');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (68,'41','30252526','Contato 68');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (69,'41','30252525','Contato 69');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (70,'41','30252526','Contato 70');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (71,'41','30252525','Contato 71');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (72,'41','30252526','Contato 72');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (73,'41','30252525','Contato 73');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (74,'41','30252526','Contato 74');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (75,'41','30252525','Contato 75');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (76,'41','30252526','Contato 76');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (77,'41','30252525','Contato 77');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (78,'41','30252526','Contato 78');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (79,'41','30252525','Contato 79');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (80,'41','30252526','Contato 80');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (81,'41','30252525','Contato 81');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (82,'41','30252526','Contato 82');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (83,'41','30252525','Contato 83');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (84,'41','30252526','Contato 84');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (85,'41','30252525','Contato 85');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (86,'41','30252526','Contato 86');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (87,'41','30252525','Contato 87');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (88,'41','30252526','Contato 88');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (89,'41','30252525','Contato 89');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (90,'41','30252526','Contato 90');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (91,'41','30252525','Contato 91');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (92,'41','30252526','Contato 92');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (93,'41','30252525','Contato 93');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (94,'41','30252526','Contato 94');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (95,'41','30252525','Contato 95');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (96,'41','30252526','Contato 96');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (97,'41','30252525','Contato 97');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (98,'41','30252526','Contato 98');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (99,'41','30252525','Contato 99');
insert into CONTATOS_TMP(id, ddd, telefone, nomecontato) values (100,'41','30252526','Contato 100');

