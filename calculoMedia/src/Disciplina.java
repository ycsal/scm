public class Disciplina {
    
ICalcMedia calcMedia;
double Media;
String Nome;
double P1;
double P2;
String Situacao;

public double getMedia() {
    return Media;
}
public void setMedia(double Media) {
    this.Media = Media;
}
public String getNome() {
    return Nome;
}
public void setNome(String Nome) {
    this.Nome = Nome;
}
public double getP1() {
    return P1;
}
public void setP1(double P1) {
    this.P1 = P1;
}
public double getP2() {
    return P2;
}
public void setP2(double P2) {
    this.P2 = P2;
}
public String getSituacao() {
    return Situacao;
}
public void setSituacao(String Situacao) {
    this.Situacao = Situacao;
}
void CalcularMedia(){
    this.Media = calcMedia.CalculaMedia(this.P1, this.P2);
    this.Situacao = calcMedia.Situacao(Media);
}

public Disciplina(){

}
public Disciplina(ICalcMedia calcMedia){
    this.calcMedia = calcMedia;
}

}
