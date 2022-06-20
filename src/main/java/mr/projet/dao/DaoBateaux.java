package mr.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.projet.entities.Bateaux;

public interface DaoBateaux extends JpaRepository<Bateaux, Integer> {

}
