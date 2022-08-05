package br.fiap.smartcities.main;

import jakarta.persistence.Persistence;

public class cap4 {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
	}
}

