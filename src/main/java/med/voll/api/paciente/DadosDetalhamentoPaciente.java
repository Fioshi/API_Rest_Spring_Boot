package med.voll.api.paciente;

import med.voll.api.medico.DadosDetalhamentoMedico;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf) {

    public DadosDetalhamentoPaciente (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}


