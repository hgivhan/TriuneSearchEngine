package com.example.Services;

import com.example.Models.OtherNames;
import com.example.Repositories.OtherNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherNamesService {

    @Autowired
    OtherNamesRepository otherNamesRepository;

    public OtherNames addOtherName(OtherNames otherName){
        if (otherName.getOtherName().equals(getCheckOtherNameExists(otherName.getOtherName())))
        { return null;
        }
        return otherNamesRepository.save(otherName);
    }

    public String getCheckOtherNameExists(String otherName){
        if(otherNamesRepository.findOtherNamesByName(otherName) != null){
            return otherName;
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<OtherNames> otherNamesIndex(){return otherNamesRepository.findAll();}

    public OtherNames getOtherNameById(Long otherNameId){
        return otherNamesRepository.findOtherNamesById(otherNameId);
    }

    public OtherNames getByOtherName(String otherName){
        return otherNamesRepository.findOtherNamesByName(otherName);
    }

    public OtherNames updateOtherName(Long id, String otherName){
        OtherNames otherName1 = getOtherNameById(id);
        otherName1.setOtherName(otherName);

        if (otherName1.getOtherName().equals(getCheckOtherNameExists(otherName1.getOtherName())))
        { return null;}
        return otherNamesRepository.save(otherName1); }

    public void deleteOtherNameById(Long otherNameId){
        otherNamesRepository.delete(getOtherNameById(otherNameId));
    }

    public void deleteOtherNameByName(String otherName){
        otherNamesRepository.delete(getByOtherName(otherName));
    }
}

