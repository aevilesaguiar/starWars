package com.bootcampjava.starwars.service;

import com.bootcampjava.starwars.model.Jedi;
import com.bootcampjava.starwars.repository.JediRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JediTestService {
    @Autowired
    public JediService jediService;

        //Mock de uma classe
    @MockBean
    public JediRepositoryImpl jediRepository;

    @Test
    @DisplayName("Should return Jedi with Sucess! ")
    public  void testFindBySucesso(){

        //cenario de execução

        //Mock de um objeto
        Jedi mockJedi = new Jedi(1, "Jedi Name", 10, 1);
        Mockito.doReturn(Optional.of(mockJedi)).when(jediRepository).findById(1);


        //execução
        Optional<Jedi> returnedJedi  = jediService.findById(1);

        //assert (resposta)
        Assertions.assertTrue(returnedJedi.isPresent(), "Jedi was not found");//caso o jedy não seja encontrado
        /*
         * Os métodos Assert.assertSame() verificam se dois objetos se referem ao mesmo objeto.
         * Se eles não forem iguais, um AssertionError será lançado.
         */
        Assertions.assertSame(returnedJedi.get(), mockJedi, "Jedis must be the same");//eu quero que o Jedy seja o mesmo que o mock




    }




}
