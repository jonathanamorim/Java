package poo14;

class ExcecaoCartaInexistente extends Exception {
    ExcecaoCartaInexistente() {
        super("Carta Inexistente"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        return "Carta Inexistente";
    }
}
