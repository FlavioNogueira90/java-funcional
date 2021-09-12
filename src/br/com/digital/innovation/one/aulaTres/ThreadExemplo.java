package br.com.digital.innovation.one.aulaTres;

public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPdf iniciarGeradPdf = new GeradorPdf();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradPdf);

        iniciarGeradPdf.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPdf extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Iniciando geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado com sucesso!");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

