package cz.czechitas.java2webapps.ukol3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    //TODO Vytvoř si v kontroleru VizitkaController privátní field, který bude obsahovat seznam vizitek (List<Vizitka>) a naplň seznam nějakými údaji. Nezapomeň vytvořit i takové vizitky, které nebudou mít uvedené všechny kontakty.
    //TODO Uprav metodu seznam() tak, aby vracela ModelAndView. Zvol správné view a do modelu vlož seznam vizitek.
    //TODO Uprav šablonu seznam.html tak, aby zobrazovala vizitky z modelu. Každá vizitka musí odkazovat na svou stránku s detailem.
    @GetMapping("/")
    public String seznam() {
        return "seznam";
    }

    //TODO Uprav metodu detail() tak, aby vracela ModelAndView. Uprav metodu tak, aby z požadavku prohlížeče načítala query parametr id. Zvol správné view a do modelu vlož vizitku získanou ze seznamu na základě id (indexu v seznamu).
    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}
