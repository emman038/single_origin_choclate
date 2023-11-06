package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EstateService estateService;

    @Autowired
    ChocolateService chocolateService;

    public void run(ApplicationArguments args) {
        Estate estate1 = new Estate("Nestlé", "Belgium");
        Estate estate2 = new Estate("Procter & Gamble", "USA");
        Chocolate chocolate1 = new Chocolate("KitKat1", 37, estate1);
        Chocolate chocolate2 = new Chocolate("Kitkat2", 38, estate1);
        Chocolate chocolate3 = new Chocolate("KitKat3", 39, estate1);
        Chocolate chocolate4 = new Chocolate("Maltesers1", 40, estate2);
        Chocolate chocolate5 = new Chocolate("Maltesers2", 41, estate2);
        Chocolate chocolate6 = new Chocolate("Maltesers3", 42, estate2);

        chocolateService.saveChocolate(chocolate1);
        chocolateService.saveChocolate(chocolate2);
        chocolateService.saveChocolate(chocolate3);
        chocolateService.saveChocolate(chocolate4);
        chocolateService.saveChocolate(chocolate5);
        chocolateService.saveChocolate(chocolate6);

        estateService.saveEstate(estate1);
        estateService.saveEstate(estate2);

    }
}
