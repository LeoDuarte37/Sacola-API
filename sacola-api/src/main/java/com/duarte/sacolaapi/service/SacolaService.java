package com.duarte.sacolaapi.service;

import com.duarte.sacolaapi.model.Item;
import com.duarte.sacolaapi.model.Sacola;
import com.duarte.sacolaapi.resource.dto.ItemDto;

public interface SacolaService {
	
	Sacola verSacola(Long id);
	Sacola fecharSacola(Long id, int formaPagamento);
	Item incluirItemNaSacola(ItemDto itemDto);
}
