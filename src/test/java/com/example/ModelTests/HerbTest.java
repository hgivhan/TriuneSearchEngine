package com.example.ModelTests;

import com.example.Models.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class HerbTest {
    Herb herb = new Herb();

    @Test
    public void setAndGetHerbId() {
        Long expected = 1L;
        herb.setHerbId(expected);
        Long actual = herb.getHerbId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setAndGetLatinName() {
        String expected = "Stellaria media";
        herb.setLatinName(expected);
        String actual = herb.getLatinName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setAndGetCommonName() {
        String expected = "Chickweed";
        herb.setCommonName(expected);
        String actual = herb.getCommonName();
        Assert.assertEquals(expected,actual);
    }

//    @Test
//    void setAndGetOtherNames() {
//        OtherNames name1 = new OtherNames();
//        name1.setOtherNameId(1L);
//        name1.setOtherName("Starwort");
//        OtherNames name2 = new OtherNames();
//        name2.setOtherNameId(2L);
//        name2.setOtherName("Star Flower");
//        List<OtherNames> otherNamesList = new ArrayList<>();
//        otherNamesList.add(name1);
//        otherNamesList.add(name2);
//        herb.setOtherNames(otherNamesList);
//        boolean actual1 = herb.getOtherNames().contains(name1);
//        boolean actual2 = herb.getOtherNames().contains(name2);
//
//        Assert.assertTrue(actual1);
//        Assert.assertTrue(actual2);
//    }
//
//
//
//    @Test
//    void setAndGetDosageParts() {
//        Dosage dosage1 = new Dosage();
//        dosage1.setDosageId(3L);
//        dosage1.setDosage("1/6");
//        Dosage dosage2 = new Dosage();
//        dosage2.setDosageId(4L);
//        dosage2.setDosage("1/9");
//        List<Dosage> dosageList = new ArrayList<>();
//        dosageList.add(dosage1);
//        dosageList.add(dosage2);
//        herb.setDosage(dosageList);
//        boolean actual1 = herb.getDosage().contains(dosage1);
//        boolean actual2 = herb.getDosage().contains(dosage2);
//
//        Assert.assertTrue(actual1);
//        Assert.assertTrue(actual2);
//    }
//
//
//    @Test
//    void setAndGetEnergetics() {
//        Energetics energetics = new Energetics();
//        energetics.setEnergeticsId(5L);
//        energetics.setTemperature("hot");
//        energetics.setMoisture("dry");
//        List<Energetics> energeticsList = new ArrayList<>();
//        energeticsList.add(energetics);
//        herb.setEnergetics(energeticsList);
//        boolean actual = herb.getEnergetics().contains(energetics);
//
//        Assert.assertTrue(actual);
//    }
//
//
//    @Test
//    void setAndGetEffects(){
//        Effects effects1 = new Effects();
//        effects1.setEffectsId(6L);
//        effects1.setBodySystem("Lungs");
//        effects1.setActions("+");
//        Effects effects2 = new Effects();
//        effects2.setEffectsId(7L);
//        effects2.setBodySystem("Mucous Membranes");
//        effects2.setActions("+");
//        Effects effects3 = new Effects();
//        effects3.setEffectsId(8L);
//        effects3.setBodySystem("Stomach");
//        effects3.setActions("0");
//
//        List<Effects> effectsList = new ArrayList<>();
//        effectsList.add(effects1);
//        effectsList.add(effects2);
//        effectsList.add(effects3);
//
//        herb.setEffects(effectsList);
//        boolean actual1 = herb.getEffects().contains(effects1);
//        boolean actual2 = herb.getEffects().contains(effects2);
//        boolean actual3 = herb.getEffects().contains(effects3);
//
//        Assert.assertTrue(actual1);
//        Assert.assertTrue(actual2);
//        Assert.assertTrue(actual3);
//
//    }
}
