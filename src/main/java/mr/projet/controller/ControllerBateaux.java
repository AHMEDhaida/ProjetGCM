package mr.projet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mr.projet.dao.DaoBateaux;
import mr.projet.entities.Bateaux;



@Controller

public class ControllerBateaux {
	
	@Autowired
	private DaoBateaux daoBateaux;
	
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		
		return "accueil";
	}
	
	@GetMapping("/ajout")
	public String formulaire(Model model) {
		Bateaux bateaux = new Bateaux();
		model.addAttribute("bateaux", bateaux);
		return "formBateaux";
	}
	
	@PostMapping("/save")
    public String addEmployee( @Valid @RequestBody @ModelAttribute("bateaux")  Bateaux bateaux,
                                 BindingResult result, Model model)
    {
    	
        if(result.hasErrors())
        {
            return "redirect:/ajout";
        }
      

        daoBateaux.save(bateaux);
        return "redirect:/";
    }
	

}
