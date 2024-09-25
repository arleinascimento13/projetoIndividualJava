package entidades;

import jdk.jfr.Event;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String id;
    private String nome;
    private Date dataHora;
    private Sala salas;
    private Organizador organizadores;
    private int participantes;

    public Evento(String id, String nome, Date dataHora, Sala salas, Organizador organizadores, int participantes) {
        this.id = id;
        this.nome = nome;
        this.dataHora = dataHora;
        this.salas = salas;
        this.organizadores = organizadores;
        this.participantes = participantes;
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

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Sala getSalas() {
        return salas;
    }

    public void setSalas(Sala salas) {
        this.salas = salas;
    }

    public Organizador getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(Organizador organizadores) {
        this.organizadores = organizadores;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", dataHora=" + dataHora +
                ", salas={" + salas.getNome() +
                "}, organizadores={" + organizadores.getNome() +
                "}, participantes=" + participantes +
                '}';
    }
}
