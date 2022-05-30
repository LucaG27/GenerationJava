package com.galiero.animeManga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.animeManga.model.AnimeManga;
import com.galiero.animeManga.repository.AnimeMangaDB;

@Service
public class AnimeMangaService {

	@Autowired
	AnimeMangaDB db;

	public List<AnimeManga> getListaAM() {

		return db.findAll();

	}

	public boolean addAM(AnimeManga newAnimeManga, boolean isUpdate) {

		if(!isUpdate) {
			db.save(newAnimeManga);
		}else {db.save(newAnimeManga);
		}
		return true;
	}

	public boolean delAnimeManga(int id) {

		db.deleteById(id);
		return true;
	}


}
