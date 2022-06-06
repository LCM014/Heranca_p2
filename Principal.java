public class Principal 
{
    public static void main(String[] args) 
    {
        Fisica fisica = new Fisica();
        Juridica juridica = new Juridica();
        Herança herança  = new Herança();

        fisica.setCpf(99999999999l);
        juridica.setCnpj(88888888888888l);
        herança.setEndereco("Kossey yamaki");
        herança.setNome("Lucas");

        System.out.println(fisica.getCpf());
        System.out.println(juridica.getCnpj());
        System.out.println(herança.getNome());
        System.out.println(herança.getEndereco());

    }
}
