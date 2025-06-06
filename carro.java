class carro extends veiculo {

    private int numeroDePortas;

    public int getNumeroDePortas(){
  return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
    
    @Override
    public void ExibirDetalhes(){
        System.out.println("Exibir número de portas = " + numeroDePortas);
    }
}
