
public class TesteImovel{

    public static void main (String[] args){

        Apartamento i = new Apartamento(1,1);
        i.setCodigo("10");
        System.out.println(i.getCodigo());

        i.addAndar(5);

    }
}