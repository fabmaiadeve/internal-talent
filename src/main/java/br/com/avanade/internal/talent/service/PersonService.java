package br.com.avanade.internal.talent.service;

import br.com.avanade.internal.talent.model.Person;

import br.com.avanade.internal.talent.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository rep;

    public Person insertPerson(Person person){

        return rep.save(person);
    }

    public List<Person> listAll() {
        return rep.findAll();
    }

    public Optional<Person> findById(Long id) {
        return rep.findById(id);
    }

    public void deleteById(Long id) {
        rep.deleteById(id);
    }

    public void deleteAll() {
         rep.deleteAll();
    }

    public Person updateById(Person person){
        if(rep.existsById(person.getIdPerson())){
            return rep.save(person);
        }
        return null;
    }

}
