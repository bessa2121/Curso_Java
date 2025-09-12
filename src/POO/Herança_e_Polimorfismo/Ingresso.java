package POO.Herança_e_Polimorfismo;

public sealed class Ingresso permits IngressoFamilia {

    protected String nome;
    protected int quantidadeIngresso;
    protected int valor; // agora protegido para acesso pela filha
    protected String nomeFilme;
    protected String tipoAudio;

    public void setinfoIngresso(String nome,int quantidadeIngresso,boolean isFamilia , String nomeFilme, boolean isDublado){
        this.nome = nome;
        this.quantidadeIngresso = quantidadeIngresso;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = (isDublado) ? "Dublado" : "Legendado";
    }

    public void getInfoIngresso(){
        System.out.printf("%nNome do Comprador: %s%n" , nome);
        System.out.printf("Valor: %s%n" , valor);
        System.out.printf("Nome do Filme: %s%n" , nomeFilme);
        System.out.printf("Tipo de Áudio: %s%n" , tipoAudio);
    }
}
