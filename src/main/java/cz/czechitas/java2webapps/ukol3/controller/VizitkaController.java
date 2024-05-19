package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    //Vytvoř si v kontroleru VizitkaController privátní field, který bude obsahovat seznam vizitek (List<Vizitka>) a naplň seznam nějakými údaji. Nezapomeň vytvořit i takové vizitky, které nebudou mít uvedené všechny kontakty.
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000", "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
            //new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000", null, "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000", "monika@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
            //new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000", "mirka@czechitas.cs", null, "www.czechitas.cz"),
            new Vizitka("Eliška Krásnohorská", "Firma", "Ulice", "61400", "eliska@eliska.cz", "733333333", "webovka.cz")
    );
    //Uprav šablonu seznam.html tak, aby zobrazovala vizitky z modelu. - hotovo
    //TODO Každá vizitka musí odkazovat na svou stránku s detailem.
    //TODO Upravit šablonu tak aby zvládla nullové hodnoty.
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        modelAndView.addObject("seznamVizitek", seznamVizitek);
        return modelAndView;
    }

    //TODO Uprav metodu detail() tak, aby vracela ModelAndView. Uprav metodu tak, aby z požadavku prohlížeče načítala query parametr id. Zvol správné view a do modelu vlož vizitku získanou ze seznamu na základě id (indexu v seznamu).
    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
//    @GetMapping("/detail/{id}")
//    public ModelAndView detail(@PathVariable int id) {
//        ModelAndView modelAndView = new ModelAndView("/detail");
//        modelAndView.addObject("vizitka", seznamVizitek.get(id));
//        return modelAndView;
}
