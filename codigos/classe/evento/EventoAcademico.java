class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    // EventoAcademico(String nome, String local, int participantes) {
    //     nomeDoEvento = nome;
    //     localDoEvento = local;
    //     numeroDeParticipantes = participantes;
    // }

    public void mostraEvento() {
        System.out.println("Evento: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }

    public static void main(String[] args) {
        EventoAcademico ev = new EventoAcademico("ECOP", "Pau dos Ferros", 200);

        ev.mostraEvento();
    }
}