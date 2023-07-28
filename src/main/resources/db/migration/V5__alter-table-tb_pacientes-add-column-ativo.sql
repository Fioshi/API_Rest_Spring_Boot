alter table tb_pacientes add ativo tinyint;
update tb_pacientes set ativo = 1;