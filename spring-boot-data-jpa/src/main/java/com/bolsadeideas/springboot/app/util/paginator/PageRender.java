package com.bolsadeideas.springboot.app.util.paginator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class PageRender<T> {
	private String url;
	private Page<T> page;
	
	private int totalPagins, paginaAcutal;
	private int numElementosPorPagina;
	private List<PageItem> paginas;
	
	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas= new ArrayList<PageItem>();
		
		numElementosPorPagina= page.getSize();
		totalPagins= page.getTotalPages();
		paginaAcutal= page.getNumber() + 1;
		
		int desde, hasta;
		if(totalPagins <= numElementosPorPagina) {
			desde= 1; 
			hasta= totalPagins;
		}else {
			if(paginaAcutal <= numElementosPorPagina/2 ) {
				desde = 1;
				hasta= numElementosPorPagina;
			}else if(paginaAcutal >= totalPagins - numElementosPorPagina/2){
				desde= totalPagins - numElementosPorPagina + 1;
				hasta= numElementosPorPagina;
			}else {
				desde= paginaAcutal - numElementosPorPagina/2;
				hasta= numElementosPorPagina;
			}
		}
		
		for(int i=0; i<hasta; i++) {
			paginas.add(new PageItem(desde + i, paginaAcutal == desde+i));
		}
	}

	public final String getUrl() {
		return url;
	}

	public final Page<T> getPage() {
		return page;
	}

	public final int getTotalPagins() {
		return totalPagins;
	}

	public final int getPaginaAcutal() {
		return paginaAcutal;
	}

	public final int getNumElementosPorPagina() {
		return numElementosPorPagina;
	}

	public final List<PageItem> getPaginas() {
		return paginas;
	}
	
	public boolean isFirst() {
		return page.isFirst();
	}
	public boolean isLast() {
		return page.isLast();
	}
	public boolean isHasNext() {
		return page.hasNext();
	}
	public boolean isHasPrevious() {
		return page.hasPrevious();
	}
	
}
