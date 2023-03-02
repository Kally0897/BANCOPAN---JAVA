package one.dio.edu;

public class Main {
    //Conceito e encadeamento de nó;

    public static void main(String[] args) {
        No no1 = new No("Conteúdo nó 1");
        No no2 = new No("Conteúdo nó 2");

        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo nó 3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo nó 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);


        System.out.println("-----------------------");
        //Encadeamento propeamente dito

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


        System.out.println("-----------------------");

        System.out.println("---------------------- REFATORAÇÃO ----------------------");
        No2<String>  noo1 = new No2<>("Conteúdo nó 1");
        No2<String> noo2 = new No2<>("Conteúdo nó 2");

        noo1.setProximoNo(noo2);

        No2<String> noo3 = new No2<>("Conteúdo nó 3");
        noo2.setProximoNo(noo3);

        No2<String> noo4 = new No2<>("Conteúdo nó 4");
        noo3.setProximoNo(noo4);


        System.out.println(noo1);
        System.out.println(noo1.getProximoNo());
        System.out.println(noo1.getProximoNo().getProximoNo());
        System.out.println(noo1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(noo1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
