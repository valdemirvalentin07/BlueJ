 class Consulta
{
    // Definindo váriaveis de instância privada
    private String Consulta;
    private char Exame;
    private int codigoExame;
    private int quantidade;
    private double valor;
    
    // Construtor público
    
    public Consulta(String Conculta, char Exame, int codigoExame ,int quantidade, double valor){
        this.Consulta = Consulta;
        this.Exame = Exame;
        this.codigoExame = codigoExame;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    // Métodos públicos getters(acesso aos dados)
    
    public String getConsulta(){
        return Consulta;
    }
    
    public char getExame(){
        return Exame;
    }
    
    public int getcodigoExame(){
        return codigoExame;
    }
    public int getquantidade(){
        return quantidade;
        
    }
    public double getvalor(){
        return valor;
    }
    
    
    
}