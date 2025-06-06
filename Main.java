public class Main {
    public static void Main (String[] args){
        
        carro meuCarro = new carro();
        meuCarro.setMarca("Volkswagen");
        meuCarro.setModelo("Amarok");
        meuCarro.setAno(2025);
        meuCarro.setNumeroDePortas(4);

        moto minhaMoto = new moto();
        minhaMoto.setMarca("Yamaha");
        minhaMoto.setModelo("MT 03");
        minhaMoto.setAno(2008);
        minhaMoto.setTipoDeGuidao("Esportivo");

        System.out.println("Exibir detalhes do carro = ");
        meuCarro.ExibirDetalhes();
        System.out.println("Exibir detalhes da moto = ");
        minhaMoto.ExibirDetalhes();

    }
}
