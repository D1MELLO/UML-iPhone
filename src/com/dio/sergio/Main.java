package com.dio.sergio;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        meuIphone.selecionarMusica("Shape of You");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
