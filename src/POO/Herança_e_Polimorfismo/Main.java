package POO.Herança_e_Polimorfismo;

public class Main {
    public static void main(String[] args){

        IngressoFamilia ingresso1 = new IngressoFamilia();
        ingresso1.setInfoFamilia("Carlos", 2, false, "A Guerra de Ultron", false);

        IngressoFamilia ingresso2 = new IngressoFamilia();
        ingresso2.setInfoFamilia("Giulia", 4, true, "Vingadores", true);

        IngressoFamilia ingresso3 = new IngressoFamilia();
        ingresso3.setInfoFamilia("Davi", 2, true, "Guerra Infinita", true);

        ingresso1.getInfoIngresso();
        ingresso2.getInfoIngresso();
        ingresso3.getInfoIngresso();
    }
}
