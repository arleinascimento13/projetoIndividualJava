package entidades;

import java.util.Date;

public class Sala extends Evento {
    private String id;
    private String nome;
    private int capacidade;

    public Sala(String id, String nome, Date dataHora, Organizador organizadores, int participantes, String id1, String nome1, int capacidade) {
        super(id, nome, dataHora, organizadores, participantes);
        this.id = id1;
        this.nome = nome1;
        this.capacidade = capacidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
