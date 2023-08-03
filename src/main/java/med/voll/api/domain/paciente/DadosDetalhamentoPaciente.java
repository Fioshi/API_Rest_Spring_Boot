package med.voll.api.domain.paciente;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf) {

    public DadosDetalhamentoPaciente (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}


