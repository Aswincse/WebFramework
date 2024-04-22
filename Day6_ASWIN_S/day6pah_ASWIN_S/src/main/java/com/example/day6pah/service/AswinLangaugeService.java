package com.example.day6pah.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6pah.model.AswinLanguage;
import com.example.day6pah.repository.AswinLanguageRepo;

@Service
public class AswinLangaugeService {
    public AswinLanguageRepo languageRepo;
    public AswinLangaugeService(AswinLanguageRepo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(AswinLanguage language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AswinLanguage> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<AswinLanguage> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<AswinLanguage> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}
