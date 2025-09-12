package POO.Herança_e_Polimorfismo;

public final class IngressoFamilia extends Ingresso {

    public void setInfoFamilia(String nome, int quantidadeIngresso, boolean isFamilia, String nomeFilme, boolean isDublado) {

        super.setinfoIngresso(nome, quantidadeIngresso, isFamilia, nomeFilme, isDublado);

        // Aplica a lógica do valor
        if (isFamilia) {
            valor = 46 * quantidadeIngresso;
        } else {
            valor = 23 * quantidadeIngresso;
        }

        // Regra do desconto: família e mais de 3 ingressos
        if (isFamilia && quantidadeIngresso > 3) {
            valor -= (valor * 0.05); // desconto de 5%
        }
    }

    @Override
    public void getInfoIngresso() {
        super.getInfoIngresso(); // aproveita a exibição da classe mãe
    }
}
