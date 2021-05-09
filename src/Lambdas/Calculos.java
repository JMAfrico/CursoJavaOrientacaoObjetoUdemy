package Lambdas;

@FunctionalInterface // No momento que crio uma anotação de interface funcional, a classe só pode ter 1 método
                                            //pois as funções Lambdas só são preenchidas obrigatóriamente com um unico método(função)
public interface Calculos {

    public abstract double executar(double a,double b);
}
