package one.dio.edu;

public class No2<T> {

    private T conteudo;
    private No2<T> proximoNo;

    public No2(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No2<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No2<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
