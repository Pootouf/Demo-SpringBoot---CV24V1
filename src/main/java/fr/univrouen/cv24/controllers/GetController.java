package fr.univrouen.cv24.controllers;

import fr.univrouen.cv24.model.TestCV;
import fr.univrouen.cv24.util.Fichier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {
    @GetMapping("/resume")
    public String getListCVinXML() {
        return "Envoi de la liste des CV";
    }

    @GetMapping("/cvid")
    public String getCVinXML(
            @RequestParam(value = "texte") String texte
    ) {
        return "Détail du CVVVVVV n°" + texte;
    }

    @GetMapping("/test")
    public String getTest(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "titre") String titre
    ) {
        return "Testttttttttt : <br/>id = " + id + "<br/>titre = " + titre;
    }

    @GetMapping("/testfic")
    public String getTestFic() {
        return Fichier.loadFileXML();
    }

    @RequestMapping(value="/testxml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody TestCV getXML() {
        TestCV cv = new TestCV("HAMILTON","Margaret","1969/07/21", "Appollo11@nasa.us");
        return cv;
    }
}
