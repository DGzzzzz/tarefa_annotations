package tarefa_annotations.tarefa_reflections;

import tarefa_annotations.AnotacaoTabela;
import tarefa_annotations.Tabela;

public class Reflection {
    public static void main(String[] args) {
        Class<Tabela> classe = Tabela.class;
        if (classe.isAnnotationPresent(AnotacaoTabela.class)) {
            AnotacaoTabela anotacao = classe.getAnnotation(AnotacaoTabela.class);
            System.out.println(anotacao.nome());
        }
    }    
}
