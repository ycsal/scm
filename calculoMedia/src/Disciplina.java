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
public void setMedia(double media) {
    Media = media;
}
public String getNome() {
    return Nome;
}
public void setNome(String nome) {
    Nome = nome;
}
public double getP1() {
    return P1;
}
public void setP1(double p1) {
    P1 = p1;
}
public double getP2() {
    return P2;
}
public void setP2(double p2) {
    P2 = p2;
}
public String getSituacao() {
    return Situacao;
}
public void setSituacao(String situacao) {
    Situacao = situacao;
}
double CalcularMedia(){
    return calcMedia.CalculaMedia(this.P1, this.P2);
}

public Disciplina(){

}
public Disciplina(ICalcMedia calcMedia){
    this.calcMedia = calcMedia;
}

}
