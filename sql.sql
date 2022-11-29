create database universidade
use universidade;
use master; drop database universidade;
go
create table unid_univer (
    id_unid int primary key,
    telefone_unid varchar(11),
    endereco_unid varchar(200),
    lucro_mensal numeric(7, 2),
    meses_ativo numeric(3)
);

create table uni_curso(
    id_curso_rel int  constraint c_id_fk references curso,
    id_unid_rel int constraint unid_id_fk references unid_univer
);

create table curso(
    id_curso int constraint cur_id_pk primary key,
    periodo_curso varchar(10),
    nome_curso varchar(200),
    preco_curso numeric(6,2),
    data_fim_curso date,
    data_inicio_curso date
);

create table departamento (
    id_dep int constraint dep_id_pk primary key,
    telefone_dep varchar(11),
    nome_dep varchar(20),
    id_unid_dep int references unid_univer,
);

create table aluno (
    id_aluno int constraint alu_id_pk primary key,
    cpf_aluno char(11),
    endereco_aluno varchar(200),
    telefone_aluno varchar(11),
    nome_aluno varchar(70),
    numero_matricula numeric(10),
    id_curso_aluno int references curso
);    

create table aula(
    id_aula int constraint aula_id_pk Primary Key,
    duracao_aula char(4),
    horario_aula char(4),
    id_curso_aula int references curso
);

create table aula_professor(
    id_aula_rel int references aula,
    id_prof_rel int references professor
);

create table aula_sala(
    id_sala_rel int references sala,
    id_aula_rel int references aula
);

create table professor(
    id_prof int constraint prof_id_pk primary key,
    cpf_prof char(11),
    telefone_prof varchar(11),
    endereco_prof varchar(200),
    nome_prof varchar(70),
    salario_prof numeric(7,2)
);

create table sala(
    id_sala int constraint sala_id_pk primary key,
    numero_sala char(2),
    andar_sala char(2),
    tamanho_sala numeric(5,2)
);