package com.school.escola.entity;

import com.school.escola.entity.Curso;
import com.school.escola.entity.EnumSexo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-21T19:04:30")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, Curso> curso;
    public static volatile SingularAttribute<Aluno, Date> tsAlteracao;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, Long> id;
    public static volatile SingularAttribute<Aluno, Date> dataNascimento;
    public static volatile SingularAttribute<Aluno, EnumSexo> sexo;
    public static volatile SingularAttribute<Aluno, Date> ultimoAcesso;

}