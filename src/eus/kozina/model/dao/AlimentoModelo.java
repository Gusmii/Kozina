package eus.kozina.model.dao;

import java.util.ArrayList;
import eus.kozina.model.bean.Alimento;

public interface AlimentoModelo {
	ArrayList<Alimento> selectAll();

	Alimento select(int id);

	boolean delete(int id);

	int update(Alimento alimento);
	
	ArrayList<Alimento> ingredientes(int id_receta);
	
	void insert(Alimento alimento);
}
