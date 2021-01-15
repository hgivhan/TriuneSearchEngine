package com.example.ModelTests;

import com.example.Models.Herb;
import com.example.Models.OtherNames;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class HerbTest {
    Herb herb = new Herb();

    @Test
    public void setAndGetHerbId() {
        Long expected = 1L;
        herb.setHerbId(1L);
        Long actual = herb.getHerbId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void getLatinName() {
        String expected = "Stellaria media";
        herb.setLatinName(expected);
        String actual = herb.getLatinName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setLatinName() {
        Herb herb = new Herb();
        herb.setLatinName("Chimaphila Umbellata");
        Assert.assertEquals("Chimaphila Umbellata", herb.getLatinName());

    }

    @Test
    void getCommonName() {
        String expected = "Chickweed";
        herb.setCommonName(expected);
        String actual = herb.getCommonName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setCommonName() {
        Herb herb = new Herb();
        herb.setCommonName("Pipsissewa");
        Assert.assertEquals("Pipsissewa", herb.getCommonName());
    }

//    @Test
//    void getOtherNames() {
//        OtherNames on = new OtherNames();
//        on.setOtherNameId(1L);
//        on.setOtherName("Starwort");
//        OtherNames on2 = new OtherNames();
//        on2.setOtherNameId(2L);
//        on2.setOtherName("Star Flower");
//        List<OtherNames> onl = new ArrayList<>();
//        onl.add(on);
//        onl.add(on2);
//        herb.setOtherNames(onl);
//
//        Assert.assertEquals(herb.getCommonName().toString(), onl.toString());
//
//    }

//    @Test
//    void setOtherNames() {
//        Herb herb = new Herb();
//        herb.setOtherNames("Prince's Pine");
//        Assert.assertEquals("Prince's Pine", herb.getOtherNames());
//    }
//
//    @Test
//    void getDosageParts() {
//        String expected = "1/6";
//        String actual = herb.getDosage();
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    void setDosageParts() {
//        Herb herb = new Herb();
//        herb.setDosage("1/18");
//        Assert.assertEquals("1/18", herb.getDosage());
//    }
//
//
//    @Test
//    void getEnergetics() {
//        String expected = "Cool, moist";
//        String actual = herb.getEnergeticsId();
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    void setEnergetics() {
//        Herb herb = new Herb();
//        herb.setEnergeticsId("Hot, damp");
//        Assert.assertEquals("Hot, damp", herb.getEnergeticsId());
//    }
//
//    @Test
//    void getBodySystems() {
//        String expected = "Large Intestine, Mucous Membranes";
//        String actual = herb.getBodySystems();
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    void setBodySystems() {
//        Herb herb = new Herb();
//        herb.setBodySystems("Lung, Spleen");
//        Assert.assertEquals("Lung, Spleen", herb.getBodySystems());
//    }
//
//    @Test
//    void getActions() {
//        String expected = "Builder";
//        String actual = herb.getActions();
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    void setActions() {
//        Herb herb = new Herb();
//        herb.setActions("Eliminator");
//        Assert.assertEquals("Eliminator", herb.getActions());
//    }
}
