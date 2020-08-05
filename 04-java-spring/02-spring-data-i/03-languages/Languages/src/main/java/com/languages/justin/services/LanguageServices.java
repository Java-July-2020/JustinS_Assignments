package com.languages.justin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.languages.justin.models.Language;
import com.languages.justin.repositories.*;


@Service
public class LanguageServices {
	private final LanguageRepository lRepository;
	
	public LanguageServices (LanguageRepository languageRepository) {
		this.lRepository = languageRepository;
	}
	
	public List<Language> allLanguage(){
		return lRepository.findAll();
	}
	
	public Language createLanguage(Language b) {
		return lRepository.save(b);
	}
	
	public Language findLanguage(Long Id) {	
		Optional<Language> optionalLanguage = lRepository.findById(Id);
     	if(optionalLanguage.isPresent()) {
     		return optionalLanguage.get();
     	} 
     	else {
     		return null;
     	}
     	
	}
	
	public Language updateCertainLanguage(Long id, String name, String creator, Double version) {
		Language lang = findLanguage(id);
		lang.setName(name);
		lang.setCreator(creator);
		lang.setVersion(version);
		return updateLanguage(lang);
				
	}
	
	public Language updateLanguage(Language language) {
		updateLanguage(language);
		return lRepository.save(language);
	 }

	public void deleteById(Long id) {
		lRepository.deleteById(id);
	}
	
	
	
	
	
	
}

