package com.example.ModelTests;

import com.example.Models.Herb;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerbTest {
    Herb herb1 = new Herb("Stellaria media", "Chickweed", "Starwort", "1/6", "ChickweedDescription", "Cool, moist", "Large Intestine, Mucous Membranes", "Builder");

    @Test
    public void setAndGetHerbId() {
        Long expected = 1L;
        herb1.setHerbId(1L);
        Long actual = herb1.getHerbId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void getLatinName() {
        String expected = "Stellaria media";
        String actual = herb1.getLatinName();
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
        String actual = herb1.getCommonName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setCommonName() {
        Herb herb = new Herb();
        herb.setCommonName("Pipsissewa");
        Assert.assertEquals("Pipsissewa", herb.getCommonName());
    }

    @Test
    void getOtherCommonNames() {
        String expected = "Starwort";
        String actual = herb1.getOtherCommonNames();
        Assert.assertEquals(expected,actual);

    }

    @Test
    void setOtherCommonNames() {
        Herb herb = new Herb();
        herb.setOtherCommonNames("Prince's Pine");
        Assert.assertEquals("Prince's Pine", herb.getOtherCommonNames());
    }

    @Test
    void getDosageParts() {
        String expected = "1/6";
        String actual = herb1.getDosageParts();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setDosageParts() {
        Herb herb = new Herb();
        herb.setDosageParts("1/18");
        Assert.assertEquals("1/18", herb.getDosageParts());
    }

    @Test
    void getDescription() {
        String expected = "ChickweedDescription";
        String actual = herb1.getDescription();
        Assert.assertEquals(expected,actual);

    }

    @Test
    void setDescription() {
        Herb herb = new Herb();
        herb.setDescription("TriphalaDescription");
        Assert.assertEquals("TriphalaDescription", herb.getDescription());
    }

    @Test
    void getEnergetics() {
        String expected = "Cool, moist";
        String actual = herb1.getEnergetics();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setEnergetics() {
        Herb herb = new Herb();
        herb.setEnergetics("Hot, damp");
        Assert.assertEquals("Hot, damp", herb.getEnergetics());
    }

    @Test
    void getBodySystems() {
        String expected = "Large Intestine, Mucous Membranes";
        String actual = herb1.getBodySystems();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setBodySystems() {
        Herb herb = new Herb();
        herb.setBodySystems("Lung, Spleen");
        Assert.assertEquals("Lung, Spleen", herb.getBodySystems());
    }

    @Test
    void getActions() {
        String expected = "Builder";
        String actual = herb1.getActions();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void setActions() {
        Herb herb = new Herb();
        herb.setActions("Eliminator");
        Assert.assertEquals("Eliminator", herb.getActions());
    }
}