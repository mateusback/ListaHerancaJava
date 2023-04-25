package br.edu.ifpr.lista.heranca.ex7;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa mateus = new Pessoa("Mateus", "teste@email.com", "44 999999999", "IFPR");
        Armario armarioMateus = new Armario("143", null);

        Reserva reservaMateus = new Reserva();
        reservaMateus.setArmario(armarioMateus);
        reservaMateus.setPessoa(mateus);
        
        System.out.println(reservaMateus.getArmario().getNumero());
        System.out.println(reservaMateus.getArmario().getObservacoes());
        System.out.println(reservaMateus.getArmario().getAtivo());
        System.out.println(reservaMateus.getPessoa().getNome());
    }
    
}
