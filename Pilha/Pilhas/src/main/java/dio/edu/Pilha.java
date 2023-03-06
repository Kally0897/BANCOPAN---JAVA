package dio.edu;

public class Pilha {

    private No referencyNoPilha;


    public Pilha() {
        this.referencyNoPilha = null;
    }

    public No top() {
        return referencyNoPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = referencyNoPilha;
        referencyNoPilha = novoNo;
        referencyNoPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!isEmpty()) {
            No noPopped = referencyNoPilha;
            referencyNoPilha = referencyNoPilha.getRefNo();
        }
        return null;

    }


    public boolean isEmpty() {
//        if(referencyNoPilha == null){
//            return true;
//        }
//        return false;

        return referencyNoPilha == null ? true : false;
    }

    @Override
    public String toString() {
       String stringRetorno = "--------\n";
       stringRetorno += " Pilha\n";
       stringRetorno += "--------\n";

       No noAuxiliar = referencyNoPilha;
       while ((true)){
           if (noAuxiliar != null){
               stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
           }
           else{
               break;
           }
       }
       return stringRetorno;
    }
}
