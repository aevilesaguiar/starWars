package com.bootcampjava.starwars.service;

import com.bootcampjava.starwars.model.Jedi;
import com.bootcampjava.starwars.repository.JediRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {
    //classe de Logs (log4j) para verificar nos testes
    private static  final Logger logger = LogManager.getLogger(JediService.class);

    private final JediRepositoryImpl jediRepositoryImpl;


    public JediService(JediRepositoryImpl jediRepositoryImpl) {
        this.jediRepositoryImpl = jediRepositoryImpl;
    }


    public Optional<Jedi> findById(int id) {

        logger.info("Find Jedi with id: {}", id);

        return  jediRepositoryImpl.findById(id);
    }

    public List<Jedi> findAll() {

        logger.info("Bring all the Jedis from the Galaxy");

        return (List<Jedi>) jediRepositoryImpl.findAll();
    }

    public Jedi save(Jedi jedi) {
        jedi.setVersion(Integer.parseInt(String.valueOf(1)));

        logger.info("Update Jedi from system");

        return jediRepositoryImpl.save(jedi);
    }

    public boolean update(Jedi jedi) {
        boolean updated = false;

        Jedi savedJedi = this.save(jedi);

        if (savedJedi != null) updated = true;

        return updated;
    }

    public boolean delete(int id) {
        return true;
    }
}