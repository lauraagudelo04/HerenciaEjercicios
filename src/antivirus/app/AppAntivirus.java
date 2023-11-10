package antivirus.app;

import antivirus.dominio.*;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus=new Antivirus();

        DocExcel excel= new DocExcel("HOJA1.xlsx",10);
        DocPdf pdf = new DocPdf("CV.pdf", 40);
        DocWord word = new DocWord("cuento.docx", 35, "Erase🦠una vez...");
        Aplicacion app = new Aplicacion("chrome.exe");
        Video video = new Video("concierto.mp4", 720);


        antivirus.agregar(excel);
        antivirus.agregar(pdf);
        antivirus.agregar(word);
        antivirus.agregar(app);
        antivirus.agregar(video);

        antivirus.escanear();
    }
}
