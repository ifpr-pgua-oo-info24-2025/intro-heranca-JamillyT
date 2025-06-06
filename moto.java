import java.util.StringTokenizer;

class moto extends veiculo {
 private String tipoDeGuidao;

 public String getTipoDeGuidao(){
    return tipoDeGuidao;
 }

 public void setTipoDeGuidao(String tipoDeGuidao){
    this.tipoDeGuidao = tipoDeGuidao;
 }

 @Override
 public void ExibirDetalhes(){
    System.out.println("Exibir tipo de guidão = " + tipoDeGuidao);
 }
}
