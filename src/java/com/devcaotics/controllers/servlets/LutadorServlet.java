/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers.servlets;

import com.devcaotics.model.negocios.Lutador;
import com.devcaotics.model.repositorios.RepositorioLocalMemo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author willian santos
 */
public class LutadorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operacao = request.getParameter("op");
        
        if(operacao != null && operacao.equals("update")){
            
            int id = Integer.parseInt(request.getParameter("id"));
            
            Lutador l = RepositorioLocalMemo.getCurrentInstance().lerLutador(id);
            
            request.setAttribute("lutador", l);
            
            request.getRequestDispatcher("/AtualizaLutador.jsp").forward(request, response);
            
            return;
        } 
        
        if(operacao!=null && operacao.equals("delete")){
            
            int id = Integer.parseInt(request.getParameter("id"));
            
            RepositorioLocalMemo.getCurrentInstance().removerLutador(id);
            
        }
        
        List<Lutador> lutadores = RepositorioLocalMemo
                .getCurrentInstance().lerTudoLutador();
        
        request.setAttribute("lutadores", lutadores);
        
        request.getRequestDispatcher("/Lutadores.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String apelido = request.getParameter("apelido");
        String curso = request.getParameter("curso");
        String artMarcial = request.getParameter("artemarcial");
        String contEmergencia = request.getParameter("contatoemergencia");
        
        String altura = request.getParameter("altura");
        double height;
            if(altura != null && !altura.isEmpty()){
                height = Double.parseDouble(altura);
            }else{
                height = 0.0;
            }
        
        String peso = request.getParameter("peso");
        double weight;
            if(peso != null && !peso.isEmpty()){
            weight = Double.parseDouble(peso);
            }else{
            weight = 0.0;
            }
        
        String nascimento = request.getParameter("nascimento");

        String destro = request.getParameter("destro");
        boolean _isDestro;
            if(destro == null){
                _isDestro = false;
            }else{
                _isDestro = true;
            }

        Lutador l = new Lutador();
        
        l.setDestro(_isDestro);
        l.setNome(nome);
        l.setApelido(apelido);
        l.setCurso(curso);
        l.setArtMarcial(artMarcial);
        l.setContatoEmergencia(contEmergencia);
        l.setAltura(height);
        l.setPeso(weight);
        
        try {
               Date _nascimento = formataParaDate(nascimento);
               l.setNascimento(_nascimento);
            } catch (ParseException ex) {
                System.out.println("parser error");
            }

        String operacao = request.getParameter("op");
        
        if(operacao != null && operacao.equals("update")){
            int id = Integer.parseInt(request.getParameter("id"));
            l.setId(id);
            RepositorioLocalMemo.getCurrentInstance().alterar(l);
            response.sendRedirect("LutadorServlet?msg=Lutador%20"+nome+"%20alterado%20com%20sucesso!");
            return;
        }
        
        RepositorioLocalMemo.getCurrentInstance().inserir(l);
        request.setAttribute("msg", "Lutador "+nome+" cadastrado com sucesso!");
        response.sendRedirect("LutadorServlet?msg=Lutador%20"+nome+"%20cadastrado%20com%20sucesso!");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Date formataParaDate(String nascimento) throws ParseException{
        
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        if(nascimento == null){
            date = formato.parse("0000-00-00");
            return date;
        }
        date = formato.parse(nascimento);
        return date;
    }
    
    private String formataDateToString(Date data){
        
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateToStr = dateFormat.format(data);
    return dateToStr;
    }
    
    public static String DateToString(Date data){
    
        if(data == null){
        return "";
        }
        
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateToStr = dateFormat.format(data);
    return dateToStr;
    }
}
