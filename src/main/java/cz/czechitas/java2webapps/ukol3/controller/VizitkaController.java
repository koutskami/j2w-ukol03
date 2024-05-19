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
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", null, "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "monika@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "mirka@czechitas.cs", null, "www.czechitas.cz"),
            new Vizitka("Eliška Krásnohorská", "Firma", "Ulice", "61400 Brno-Husovice", "eliska@eliska.cz", "733333333", "webovka.cz"),
            new Vizitka(null, null, null, null, null, null, null)
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        modelAndView.addObject("seznamVizitek", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail/{index}")
    public ModelAndView detail(@PathVariable int index) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(index));
        return modelAndView;
    }
}
