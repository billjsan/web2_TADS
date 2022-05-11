/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model.repositorios;

import com.devcaotics.model.negocios.Local;
import com.devcaotics.model.negocios.Lutador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class RepositorioLocalMemo {
    
    private static RepositorioLocalMemo myself = null;
    
    private List<Local> locais = null;
    private List<Lutador> lutadores = null;  
    private static int lastId = 1;
    private static int lastIdLutador = 1;
    
    private RepositorioLocalMemo(){
        this.locais = new ArrayList<>();
        this.lutadores = new ArrayList<>();
    }
    
    public static RepositorioLocalMemo getCurrentInstance(){
        
        if(myself == null)
            myself = new RepositorioLocalMemo();
        
        return myself;
        
    }
    
    public void inserir(Local l){
        l.setId(lastId++);
        this.locais.add(l);
    }
    
    public void inserir(Lutador lutador){
        lutador.setId(lastIdLutador++);
        this.lutadores.add(lutador);
    }
    
    public void alterar(Local l){
        for(Local lAux : this.locais){
            
            if(lAux.getId() == l.getId()){
                lAux.setApelido(l.getApelido());
                lAux.setCapacidade(l.getCapacidade());
                lAux.setEndereco(l.getEndereco());
                return;
            }
        }
    }
    
    public void alterar (Lutador lutador){
        for(Lutador lAux : this.lutadores){
            
            if(lAux.getId() == lutador.getId()){
                lAux.setAltura(lutador.getAltura());
                lAux.setApelido(lutador.getApelido());
                lAux.setArtMarcial(lutador.getArtMarcial());
                lAux.setContatoEmergencia(lutador.getContatoEmergencia());
                lAux.setCurso(lutador.getCurso());
                lAux.setDestro(lutador.isDestro());
                lAux.setNascimento(lutador.getNascimento());
                lAux.setNome(lutador.getNome());
                lAux.setPeso(lutador.getPeso());
                lAux.setSenha(lutador.getSenha());
                return;
            }
        }
    
    }
    
    public Local ler(int id){
        for(Local lAux : this.locais){
            if(lAux.getId() == id){
                return lAux;
            }
        }
        return null;
    }
    
    public Lutador lerLutador(int id){
        for(Lutador lAux : this.lutadores){
            if(lAux.getId() == id){
                return lAux;
            }
        }
        return null;
    }
    
    public void remover(int id){
        Local l = null;
        for(Local lAux : this.locais){
            if(lAux.getId() == id){
                l = lAux;
                break;
            }
        }
        
        this.locais.remove(l);
    }
    
    public void removerLutador(int id){
        Lutador l = null;
        for(Lutador lAux : this.lutadores){
            if(lAux.getId() == id){
                l = lAux;
                break;
            }
        }
        
        this.lutadores.remove(l);
    }
    
    public List<Local> lerTudo(){
        return this.locais;
    }
    
    public List<Lutador> lerTudoLutador(){
        return this.lutadores;
    }
}
